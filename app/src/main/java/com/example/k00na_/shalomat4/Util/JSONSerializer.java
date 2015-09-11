package com.example.k00na_.shalomat4.Util;

import android.content.Context;

import com.example.k00na_.shalomat4.Model.Joke;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
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
    public static final String TVOJAMAMA_FILENAME = "tvojamama.json";
    public static final String JANEZEK_FILENAME = "janezek.json";
    public static final String MUJOHASO_FILENAME = "mujohaso.json";
    public static final String CRNIHUMOR_FILENAME = "crnihumor.json";
    public static final String TASCE_FILENAME = "tasce.json";
    public static final String POLITICNI_FILENAME = "politicni.json";
    public static final String YUGO_FILENAME = "yugo.json";
    public static final String VSIVICI_FILENAME = "vsivici.json";
    public static final String OPOLZKE_FILENAME = "opolzke.json";




    public JSONSerializer(Context c){

        mContext = c;
    }


    public ArrayList<Joke> loadCategory(String fileName) throws IOException {

        BufferedReader reader = null;
        ArrayList<Joke> arrayList = new ArrayList<Joke>();

        try{
            InputStream in = mContext.openFileInput(fileName);
            reader = new BufferedReader(new InputStreamReader(in));
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
        } finally {
            if(reader != null)
                reader.close();
        }

        return arrayList;
    }

    public void saveCategory(ArrayList<Joke> array, String fileName) throws JSONException, IOException {

        JSONArray jsonArray = new JSONArray();
        for(Joke joke : array)
            jsonArray.put(joke.toJSON());

        Writer writer = null;
        try{
            OutputStream out = mContext.openFileOutput(fileName, Context.MODE_PRIVATE);
            writer = new OutputStreamWriter(out);
            writer.write(jsonArray.toString());

        } finally {
            if(writer != null)
                writer.close();
        }


    }

    public void createVsiViciCategory() throws IOException, JSONException {

        ArrayList<Joke> vsiViciArray = new ArrayList<>();

        vsiViciArray.addAll(loadCategory(BLONDINKE_FILENAME));
        vsiViciArray.addAll(loadCategory(GOSTILNSIKE_FILENAME));
        vsiViciArray.addAll(loadCategory(POLICAJI_FILENAME));
        vsiViciArray.addAll(loadCategory(YUGO_FILENAME));
        vsiViciArray.addAll(loadCategory(OPOLZKE_FILENAME));
        vsiViciArray.addAll(loadCategory(JANEZEK_FILENAME));
        vsiViciArray.addAll(loadCategory(MUJOHASO_FILENAME));
        vsiViciArray.addAll(loadCategory(CRNIHUMOR_FILENAME));



        saveCategory(vsiViciArray, VSIVICI_FILENAME);



    }

    public void createPriljubljene(Joke joke) throws IOException, JSONException{

        JSONArray favJokes = new JSONArray();
        favJokes.put(joke.toJSON());
        joke.setIsFavorited(true);


        Writer writer = null;
        try{
            OutputStream out = mContext.openFileOutput(CreateFilesForCategories.PRILJUBLJENI_FILENAME, Context.MODE_PRIVATE);
            writer = new OutputStreamWriter(out);
            writer.write(favJokes.toString());

        } finally {
            if(writer != null)
                writer.close();
        }

    }

    public void addToPriljubljene(Joke joke) throws IOException, JSONException{

        // naredi JSONArray. V njega se izpiše ves dosedanji šit z branjem iz file-a.
        // nato se v ta array doda trenuten joke in tako se potem ta posodobljen array zapiše v file.
        JSONArray jsonArray = new JSONArray();

        // 1. dobi JSONArray iz fajla za priljubljene

        ArrayList<Joke> jokeArray = new ArrayList<Joke>();
        BufferedReader reader = null;
        try{
            InputStream in = mContext.openFileInput(CreateFilesForCategories.PRILJUBLJENI_FILENAME);
            reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder jsonString = new StringBuilder();
            String line = null;

            while((line = reader.readLine()) != null)
                jsonString.append(line);

            jsonArray = (JSONArray) new JSONTokener(jsonString.toString()).nextValue();

            jsonArray.put(joke.toJSON());

        } catch (FileNotFoundException fnfe){

        } finally {
            if(reader != null)
                reader.close();
        }

        Writer writer = null;

        if(jsonArray.length()==0)
            jsonArray.put(joke.toJSON());

        try{
            OutputStream out = mContext.openFileOutput(CreateFilesForCategories.PRILJUBLJENI_FILENAME, Context.MODE_PRIVATE);
            writer = new OutputStreamWriter(out);
            writer.write(jsonArray.toString());
        }finally {
            if(writer!=null)
                writer.close();
        }

    }

    public ArrayList<Joke> loadFavorites() throws IOException, JSONException{

        ArrayList<Joke> arrayList = new ArrayList<>();
        BufferedReader reader = null;

        try{
            InputStream in = mContext.openFileInput(CreateFilesForCategories.PRILJUBLJENI_FILENAME);
            reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder jsonString = new StringBuilder();
            String line = null;
            while((line = reader.readLine()) != null)
                jsonString.append(line);

            JSONArray array = (JSONArray) new JSONTokener(jsonString.toString()).nextValue();

            for(int i = 0; i < array.length(); i++){
                arrayList.add(new Joke(array.getJSONObject(i))); // <-- btw, ful kul line!
            }
        } catch (FileNotFoundException fnfe){

        }finally {
            if(reader != null)
                reader.close();
        }
        return arrayList;
    }



}
