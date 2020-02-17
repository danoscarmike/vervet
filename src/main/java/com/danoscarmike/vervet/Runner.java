package com.danoscarmike.vervet;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.*;

/**
 * Main
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository sloth = gitHub.getRepository("googleapis/sloth");

        Gson gson = new Gson();

        InputStream reposFile = sloth.getFileContent("repos.json").read();
        String reposString = IOUtils.toString(reposFile, "US-ASCII");
        Repo r = new Repo();
        r.repo = "googleapis/google-cloud-cpp";
        r.language = LanguageName.CPP;

        String rJson = gson.toJson(r, Repo.class);

        System.out.println(rJson);
    }
}
