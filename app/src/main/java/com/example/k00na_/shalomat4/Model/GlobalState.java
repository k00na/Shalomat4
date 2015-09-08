package com.example.k00na_.shalomat4.Model;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class GlobalState extends Application {

    private int numOfVisits;
    private ArrayList<Joke> blondinkeGlobal;



    /*
        GETTERS AND SETTERS
     */

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
