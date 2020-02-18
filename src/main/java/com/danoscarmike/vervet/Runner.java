package com.danoscarmike.vervet;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.kohsuke.github.GHFileNotFoundException;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.*;
import java.util.ArrayList;

/**
 * Main application runner class
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        GitHub gitHub = GitHub.connect();
        Gson gson = new Gson();
        ArrayList<String> languages = new ArrayList<>();
//        languages.add("go");
        languages.add("java");
        languages.add("nodejs");
        languages.add("python");

        GHRepository sloth = gitHub.getRepository("googleapis/sloth");
        InputStream reposFile = sloth.getFileContent("repos.json").read();
        String reposString = IOUtils.toString(reposFile, "US-ASCII");

        SlothRepoJson slothRepos = gson.fromJson(reposString, SlothRepoJson.class);

        for (Repo r : slothRepos.getRepos()) {
            if (languages.contains(r.getLanguage())) {
                GHRepository repo = null;
                try {
                    repo = gitHub.getRepository(r.getRepo());
                } catch (GHFileNotFoundException e) {
                    System.out.println("no such repository " + r.getRepo());
                }
                if (repo != null) {
                    try {
                        InputStream repoMetadata = repo.getFileContent(".repo-metadata.json").read();
                        String metadataString = IOUtils.toString(repoMetadata, "US-ASCII");
                        r.setMetadata(gson.fromJson(metadataString, RepoMetadataJson.class));
                    } catch (FileNotFoundException e) {
                        System.out.println(".repo-metadata.json file not found for " + r.getRepo());
                    }
                }
            }
        }
    }
}
