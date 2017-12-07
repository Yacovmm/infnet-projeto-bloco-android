package infnet.edu.br.projetobloco.model;

import com.google.gson.annotations.SerializedName;


public class Repo_owner {

    @SerializedName("login")
    private String login;

    @SerializedName("avatar_url")
    private String avatar_url;

    public String getLogin() {
        return login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

}
