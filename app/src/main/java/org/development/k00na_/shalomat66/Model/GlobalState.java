package org.development.k00na_.shalomat66.Model;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.flurry.android.FlurryAgent;
import com.parse.Parse;
import com.parse.ParseClassName;
import com.parse.ParseObject;

import org.development.k00na_.shalomat66.Parse.VsiVici;
import org.development.k00na_.shalomat66.Util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class GlobalState extends Application {

    private int numOfVisits;
    private int numOfVisitsContent;

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
    private static final String FLURRY_KEY = "GY98KGH7WQVZ72N4TFKH";
    private static final String PARSE_APP_KEY = "9Ao0ayCgsudGL7222ytHBwOicQPwPvTy4H02zJHJ";
    private static final String CLIENT_KEY = "tonhJCLrztMnSkLFtwOoiII10k060UjyuNYutRzN";

    private static List<VsiVici> mVsiViciListRandomized;
    private static List<VsiVici> mVsiViciListNewest;
    private static List<VsiVici> mVsiViciListBest;

    /*
        GETTERS AND SETTERS
     */

    @Override
    public void onCreate() {
        super.onCreate();

        setupFlurry();


        // Parse part
        ParseObject.registerSubclass(VsiVici.class);
        Parse.initialize(this, Constants.PARSE_KEY, Constants.PARSE_CLIENT);


    }

    private void setupFlurry(){
        FlurryAgent.setLogEvents(true);

        // configure Flurry
        FlurryAgent.setLogEnabled(true);
        FlurryAgent.setLogLevel(Log.INFO);

        // init Flurry
        FlurryAgent.init(this, FLURRY_KEY);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    // { "results": [ {...}, ... ]}


    // GETTER & SETTER for lists


    public static List<VsiVici> getmVsiViciListRandomized() {
        return mVsiViciListRandomized;
    }

    public static void setmVsiViciListRandomized(List<VsiVici> mVsiViciListRandomized) {
        GlobalState.mVsiViciListRandomized = mVsiViciListRandomized;
    }

    public static List<VsiVici> getmVsiViciListNewest() {
        return mVsiViciListNewest;
    }

    public static void setmVsiViciListNewest(List<VsiVici> mVsiViciListNewest) {
        GlobalState.mVsiViciListNewest = mVsiViciListNewest;
    }

    public static List<VsiVici> getmVsiViciListBest() {
        return mVsiViciListBest;
    }

    public static void setmVsiViciListBest(List<VsiVici> mVsiViciListBest) {
        GlobalState.mVsiViciListBest = mVsiViciListBest;
    }

    public int getNumOfVisitsContent() {
        return numOfVisitsContent;
    }

    public void setNumOfVisitsContent(int numOfVisitsContent) {
        this.numOfVisitsContent = numOfVisitsContent;
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
