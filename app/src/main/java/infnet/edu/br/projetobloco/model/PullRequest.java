package infnet.edu.br.projetobloco.model;

import com.google.gson.annotations.SerializedName;


public class PullRequest {

    @SerializedName("user")
    public User user;

    public User getUser() {
        return user;
    }

}
