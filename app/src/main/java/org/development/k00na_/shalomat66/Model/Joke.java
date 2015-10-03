package org.development.k00na_.shalomat66.Model;

import org.json.JSONObject;
import org.json.JSONException;

import java.util.UUID;

/**
 * Created by k00na_ on 25.8.2015.
 */
public class Joke {

    private String jokeCategoryTitle;
    private String jokeContent;
    private int timesFavorited = 0;
    private double userRating = 0.0;
    private boolean isFavorited = false;
    private UUID jokeID;
    // JSON STUFF yo
    public static final String JSON_ID = "id";
    public static final String JSON_CATTITLE = "category";
    public static final String JSON_CONENT = "content";
    public static final String JSON_FAVORITED = "favorited";


    public Joke(){
        jokeID = UUID.randomUUID();
        isFavorited = false;

    }

    public Joke(String content, double userR, boolean favOrNot){

        jokeID = UUID.randomUUID();
        jokeContent = content;
        userRating = userR;
        isFavorited = favOrNot;

    }

    /*
        JSON STUFF
     */

    public JSONObject toJSON() throws JSONException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put(JSON_ID, jokeID.toString());
        jsonObject.put(JSON_CATTITLE, jokeCategoryTitle);
        jsonObject.put(JSON_CONENT, jokeContent);
        jsonObject.put(JSON_FAVORITED, isFavorited);


        return jsonObject;
    }

    public Joke(JSONObject jsonObject) throws JSONException{

        jokeID = UUID.fromString(jsonObject.getString(JSON_ID));
        jokeContent = jsonObject.getString(JSON_CONENT);
        isFavorited = jsonObject.getBoolean(JSON_FAVORITED);
        jokeCategoryTitle = jsonObject.getString(JSON_CATTITLE);

    }




    /*
        GETTERS AND SETTERS
     */

    public String getJokeCategoryTitle() {
        return jokeCategoryTitle;
    }

    public void setJokeCategoryTitle(String jokeCategoryTitle) {
        this.jokeCategoryTitle = jokeCategoryTitle;
    }

    public UUID getJokeID() {
        return jokeID;
    }

    public void setJokeID(UUID jokeID) {
        this.jokeID = jokeID;
    }

    public boolean isFavorited() {
        return isFavorited;
    }

    public void setIsFavorited(boolean isFavorited) {
        this.isFavorited = isFavorited;
    }

    public String getJokeContent() {
        return jokeContent;
    }

    public void setJokeContent(String jokeContent) {
        this.jokeContent = jokeContent;
    }

    public int getTimesFavorited() {
        return timesFavorited;
    }

    public void setTimesFavorited(int timesFavorited) {
        this.timesFavorited = timesFavorited;
    }

    public double getUserRating() {
        return userRating;
    }

    public void setUserRating(double userRating) {
        this.userRating = userRating;
    }
}

