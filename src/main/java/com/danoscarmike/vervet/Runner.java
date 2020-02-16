package com.danoscarmike.vervet;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.RepositoryService;

import java.io.IOException;

/**
 * Main
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        RepositoryService service = new RepositoryService();
        Repository sloth = service.getRepository("googleapis", "sloth");
        System.out.println(sloth.getDescription());
    }
}
