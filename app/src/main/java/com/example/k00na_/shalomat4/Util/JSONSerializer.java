package com.example.k00na_.shalomat4.Util;

import android.content.Context;

import com.example.k00na_.shalomat4.Model.Joke;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class JSONSerializer {

    private static Context mContext;
    public static final String POLICAJI_FILENAME = "policaji.json";
    public static final String BLONDINKE_FILENAME = "blondinke.json";
    public static final String GOSTILNSIKE_FILENAME = "gostilniske.json";
    public static final String PRILJUBLJENI_FILENAME = "priljubljeni.json";
    public static final String TVOJAMAMA_FILENAME = "TVOJAMAMA.json";
    public static final String JANEZEK_FILENAME = "JANEZEK_.json";
    public static final String MUJOHASO_FILENAME = "MUJOHASO.json";
    public static final String CRNIHUMOR_FILENAME = "CRNIHUMOR.json";
    public static final String TASCE_FILENAME = "TASCE.json";
    public static final String POLITICNI_FILENAME = "POLITICNI.json";
    public static final String YUGO_FILENAME = "YUGO.json";
    public static final String VSIVICI_FILENAME = "VSIVICI.json";



    public JSONSerializer(Context c){

        mContext = c;
    }


    public ArrayList<Joke> loadCategory(String fileName){

        BufferedReader reader = null;
        ArrayList<Joke> arrayList = new ArrayList<Joke>();

        try{
            reader = new BufferedReader(new InputStreamReader(mContext.getAssets().open(fileName)));
            StringBuilder jsonString = new StringBuilder();
            String line = null;

            while((line = reader.readLine()) != null)
                jsonString.append(line);

            JSONArray array = (JSONArray) new JSONTokener(jsonString.toString()).nextValue();

            for(int i = 0; i < array.length(); i++)
                arrayList.add(new Joke(array.getJSONObject(i)));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return arrayList;
    }




}
