package com.example.k00na_.shalomat4.Model;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class GlobalState extends Application {

    private int numOfVisits;
    private ArrayList<Joke> blondinkeGlobal;
    private ArrayList<Joke> janezekGlobal;



    /*
        GETTERS AND SETTERS
     */

    public ArrayList<Joke> getJanezekGlobal() {
        return janezekGlobal;
    }

    public void setJanezekGlobal(ArrayList<Joke> janezekGlobal) {
        this.janezekGlobal = janezekGlobal;
    }

    public ArrayList<Joke> getBlondinkeGlobal() {
        return blondinkeGlobal;
    }

    public void setBlondinkeGlobal(ArrayList<Joke> blondinkeGlobal) {
        this.blondinkeGlobal = blondinkeGlobal;
    }

    //// NUMS OF VISITS SETTERS AND GETTERS

    public int getNumOfVisits() {
        return numOfVisits;
    }

    public void setNumOfVisits(int numOfVisits) {
        this.numOfVisits = numOfVisits;
    }
}
