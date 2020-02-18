package com.danoscarmike.vervet;

/**
 * Represents the JSON object in .repo-metadata.json files.
 */
public class RepoMetadataJson {
    private String name;
    private String name_pretty;
    private String product_documentation;
    private String issue_tracker;
    private String release_level;
    private String language;
    private String repo;
    private String distribution_name;
    private String api_id;
    private boolean requires_billing;

    public RepoMetadataJson() { }

    /**
     * Get service's (Google API's) shortname.
     * @return shortname string
     */
    public String getName() {
        return name;
    }

    /**
     * Get service's (Google API's) full name for pretty printing.
     * @return full name string
     */
    public String getPrettyName() {
        return name_pretty;
    }

    /**
     * Get link to the Google API's product documentation.
     * @return docs url string
     */
    public String getProductDocLink() {
        return product_documentation;
    }

    /**
     * Get link to the Google API's public issue tracker.
     * @return issue tracker url string
     */
    public String getIssueTrackerLink() {
        return issue_tracker;
    }

    /**
     * Get the client library package's release level (typically: alpha, beta or ga).
     * @return client library package's release level string
     */
    public String getReleaseLevel() {
        return release_level;
    }

    /**
     * Get the client library's primary language (e.g. "java", "python").
     * @return programming language string
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Get the repository name.
     * @return repository name string
     */
    public String getRepo() {
        return repo;
    }

    /**
     * Get the client library package's distribution name.
     * @return client library package string
     */
    public String getDistributionName() {
        return distribution_name;
    }

    /**
     * Get the service's (Google API's) full id (e.g. vision.googleapis.com).
     * @return API ID string
     */
    public String getApiId() {
        return api_id;
    }

    /**
     * Get if the service requires a Google billing account.
     * @return true if billing account if required, false if not.
     */
    public boolean requiresBilling() {
        return requires_billing;
    }
}
