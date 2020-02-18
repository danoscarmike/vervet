package com.danoscarmike.vervet;

/**
 * Represents the JSON object in repos.json file in <code>googleapis/sloth</code> repository.
 * @see <a href="https://github.com/googleapis/sloth">Sloth Utility Tool</a>
 */
public class SlothRepoJson {

    private Repo[] repos;

    public SlothRepoJson() { }

    /**
     * Get array of {@link Repo} objects per sloth's repos.json file.
     * @return array of {@link Repo} objects
     */
    public Repo[] getRepos() {
        return repos;
    }

}
