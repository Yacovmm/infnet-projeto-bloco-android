package infnet.edu.br.projetobloco.API;

import java.util.List;

import infnet.edu.br.projetobloco.model.GitHubCatalog;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



public interface GitHubApi {
    @GET("search/repositories?q=language:Java&sort=stars&page=1&per_page=20")
    Call<GitHubCatalog> getCatalog();


    @GET("repos/{owner}/{repo}/pulls")
    Call<List<GitHubCatalog>> getPullRequest(@Path("owner") String owner, @Path("repo") String repo);
}

