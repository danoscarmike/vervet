package com.danoscarmike.vervet;

/**
 * Object representing a GitHub repository containing client library source code.
 */
public class Repo {
    private String repo; // repository name
    private String language; // programming language
    private String apiHint; // from sloth's repos.json
    private RepoMetadataJson metadata; // from repo's .repo-metadata.json file

    // Constructor
    public Repo () {
    }

    // Methods
    /**
     * Get repository's name
     * @return repository name string in the form "<code>owner/repo-name</code>".
     */
    public String getRepo() {
        return repo;
    }

    /**
     * Get the apiHint, if one was found in sloth's repos.json file.
     * @return apiHint string
     */
    public String getApiHint() {
        return apiHint;
    }

    /**
     * Get the repository programming language.
     * @return language string
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Get the repository's metadata object.
     * @return metadata object reflecting the JSON object in the .repo-metadata.json file if one exists.
     */
    public RepoMetadataJson getMetadata() {
        return metadata;
    }

    /**
     * Set the repository's metadata.
     * @param metadata {@link RepoMetadataJson} object
     */
    public void setMetadata(RepoMetadataJson metadata) {
        this.metadata = metadata;
    }
}
