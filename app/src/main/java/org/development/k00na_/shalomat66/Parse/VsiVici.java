package org.development.k00na_.shalomat66.Parse;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.UUID;

/**
 * Created by k00na_ on 19.10.2015.
 */

@ParseClassName("VsiVici")
public class VsiVici extends ParseObject {

    private String jokeCategoryTitle;
    private String jokeContent;
    private String addedBy;
    private int numOfLikes = 0;
    private boolean isFavorited = false;


    public VsiVici(){

    }

    public String getContent(){
        return getString("content");
    }

    public void setContent(String newContent){
        put("content", newContent);
    }

    public String getUser(){
        return getString("addedBy");
    }

    public void setUser(String user){
        put("addedBy", user);
    }

    public int getNumOfLikes(){
        return getInt("numOfLikes");
    }

    public void setCategoryTitle(String title){
        put("category", title);
    }

    public String getCategoryTitle(){
        return getString("category");
    }

}
