package org.development.k00na_.shalomat66.Model;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import java.util.ArrayList;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class GlobalState extends Application {

    private int numOfVisits;
    private int numOfVisitsContent;
    private ArrayList<Joke> blondinkeGlobal;
    private ArrayList<Joke> janezekGlobal;
    private int blondinkeSize;
    private int opolzkiSize;
    private int policajiSize;
    private int tvojaMamaSize;
    private int gostilniskiSize;
    private int janezekSize;
    private int mujoHasoSize;
    private int crniHumorSize;
    private int politicniSize;
    private int yugoSize;
    private int shranjeniSize;
    private int vsiViciSize;


    /*
        GETTERS AND SETTERS
     */

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public int getNumOfVisitsContent() {
        return numOfVisitsContent;
    }

    public void setNumOfVisitsContent(int numOfVisitsContent) {
        this.numOfVisitsContent = numOfVisitsContent;
    }

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

    public int getBlondinkeSize() {
        return blondinkeSize;
    }

    public void setBlondinkeSize(int blondinkeSize) {
        this.blondinkeSize = blondinkeSize;
    }

    public int getOpolzkiSize() {
        return opolzkiSize;
    }

    public void setOpolzkiSize(int opolzkiSize) {
        this.opolzkiSize = opolzkiSize;
    }

    public int getPolicajiSize() {
        return policajiSize;
    }

    public void setPolicajiSize(int policajiSize) {
        this.policajiSize = policajiSize;
    }

    public int getTvojaMamaSize() {
        return tvojaMamaSize;
    }

    public void setTvojaMamaSize(int tvojaMamaSize) {
        this.tvojaMamaSize = tvojaMamaSize;
    }

    public int getGostilniskiSize() {
        return gostilniskiSize;
    }

    public void setGostilniskiSize(int gostilniskiSize) {
        this.gostilniskiSize = gostilniskiSize;
    }

    public int getJanezekSize() {
        return janezekSize;
    }

    public void setJanezekSize(int janezekSize) {
        this.janezekSize = janezekSize;
    }

    public int getMujoHasoSize() {
        return mujoHasoSize;
    }

    public void setMujoHasoSize(int mujoHasoSize) {
        this.mujoHasoSize = mujoHasoSize;
    }

    public int getCrniHumorSize() {
        return crniHumorSize;
    }

    public void setCrniHumorSize(int crniHumorSize) {
        this.crniHumorSize = crniHumorSize;
    }

    public int getPoliticniSize() {
        return politicniSize;
    }

    public void setPoliticniSize(int politicniSize) {
        this.politicniSize = politicniSize;
    }

    public int getYugoSize() {
        return yugoSize;
    }

    public void setYugoSize(int yugoSize) {
        this.yugoSize = yugoSize;
    }

    public int getShranjeniSize() {
        return shranjeniSize;
    }

    public void setShranjeniSize(int shranjeniSize) {
        this.shranjeniSize = shranjeniSize;
    }

    public int getVsiViciSize() {
        return vsiViciSize;
    }

    public void setVsiViciSize(int vsiViciSize) {
        this.vsiViciSize = vsiViciSize;
    }

    //// NUMS OF VISITS SETTERS AND GETTERS

    public int getNumOfVisits() {
        return numOfVisits;
    }

    public void setNumOfVisits(int numOfVisits) {
        this.numOfVisits = numOfVisits;
    }



}
