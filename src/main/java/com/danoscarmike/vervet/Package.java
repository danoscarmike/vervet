package com.danoscarmike.vervet;

/**
 * Object representing a client library binary.
 */
public class Package {
    // Instance variables
    /**
     * Primary programming language.
     */
    public Language language;

    /**
     * Distribution name of the binary.
     */
    public String distributionName;

    /**
     * {@link Repo containing the package source code.}
     */
    public Repo repository;

    /**
     * Short name of the Google API service.
     */
    public String serviceName;

    /**
     * The Google product associated with the API.
     */
    public String productName;

    /**
     * URL of the Google product documentation.
     */
    public String productDocLink;

    /**
     * URL of the client library documentation (javadoc).
     */
    public String clientDocLink;

    /**
     * Release level (stability) of the client library.
     */
    public String releaseLevel;

    // Constructors
    public Package (Language language, String distributionName) {
        this.language = language;
        this.distributionName = distributionName;
    }

    // Methods
}
