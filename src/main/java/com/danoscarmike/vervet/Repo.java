package com.danoscarmike.vervet;

import java.util.HashSet;
import java.util.Set;

/**
 * Object representing a GitHub repository containing client library source code.
 */
public class Repo {
    /**
     * {@link Set} of {@link Package} objects associated with this com.danoscarmike.vervet.Repo.
     */
    private Set<Package> packageSet = new HashSet<>();
    private String repo;
    private String language;
    private String apiHint;


    // Constructors
    public Repo () {
    }


    // Methods
    public String getRepo() {
        return repo;
    }

    public String getApiHint() {
        return apiHint;
    }

    public String getLanguage() {
        return language;
    }

    public Set<Package> getPackageSet() {
        return packageSet;
    }
}
