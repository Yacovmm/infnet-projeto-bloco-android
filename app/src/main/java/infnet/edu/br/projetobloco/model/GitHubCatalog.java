package infnet.edu.br.projetobloco.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;



public class GitHubCatalog {
    @SerializedName("items")
    private List<Repository> repositories;

    @SerializedName("JSON")
    private List<PullRequest> pullRequests;

    // GETTER

    public List<Repository> getRepositories() {
        return repositories;
    }

    public List<PullRequest> getPullRequests() {
        return pullRequests;
    }
}
