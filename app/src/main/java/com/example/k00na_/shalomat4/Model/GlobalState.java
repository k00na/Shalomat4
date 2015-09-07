package com.example.k00na_.shalomat4.Model;

import android.app.Application;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class GlobalState extends Application {

    private int numOfVisits;


    /*
        GETTERS AND SETTERS
     */

    public int getNumOfVisits() {
        return numOfVisits;
    }

    public void setNumOfVisits(int numOfVisits) {
        this.numOfVisits = numOfVisits;
    }
}
