package com.example.k00na_.shalomat4;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.k00na_.shalomat4.Fragments.ListOfJokesFragment;
import com.example.k00na_.shalomat4.Model.GlobalState;
import com.example.k00na_.shalomat4.Util.CreateFilesForCategories;
import com.example.k00na_.shalomat4.Util.JSONSerializer;

import org.json.JSONException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private int visitsCounter;
    private GlobalState globalState;
    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        globalState = (GlobalState)getApplicationContext();

        try {
            setupGlobalState();

        } catch (IOException e) {
            e.printStackTrace();
        }



        setupViews();
        navigationListener();
        actionBarDrawerToggleSetup();

        CreateFilesForCategories createFiles = new CreateFilesForCategories(this);
        JSONSerializer serializer = new JSONSerializer(this);

        if (numOfVisits() == 0) {


            Toast.makeText(this, "Files created", Toast.LENGTH_SHORT).show();
            try {
                createFiles.createAllJokes();
                serializer.createVsiViciCategory();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            displayListOfJokes(R.id.nakljucni_navigation);
            Toast.makeText(this, "First visit; wellcome!", Toast.LENGTH_LONG).show();
            mDrawerLayout.openDrawer(Gravity.LEFT);
            incrementAndSaveVisits();


        } else{
            displayListOfJokes(R.id.nakljucni_navigation);
            Toast.makeText(this, "Num of entries: " + numOfVisits(), Toast.LENGTH_LONG).show();
            incrementAndSaveVisits();
        }



        navigationListener();

        try {
            setupNumOfJokesForMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void setupViews() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.ourDrawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.navigationView);
        mToolbar = (Toolbar)findViewById(R.id.includeappbar);
        setSupportActionBar(mToolbar);
    }

    private void navigationListener(){

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                int selectedCategoryNum;

                if (menuItem.isChecked())
                    menuItem.setChecked(false);
                else
                    menuItem.setChecked(true);

                mDrawerLayout.closeDrawers();

                switch (menuItem.getItemId()) {

                    case (R.id.blondinke_navigation): {
                        Toast.makeText(getApplicationContext(), "Blondinke", Toast.LENGTH_LONG).show();
                        getSupportActionBar().setTitle(R.string.blondinkeNav);

                        displayListOfJokes(R.id.blondinke_navigation);

                        return true;
                    }

                    case (R.id.crnihumor_navigation): {
                        Toast.makeText(getApplicationContext(), "Črni humor", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.crnihumorNav);
                        displayListOfJokes(R.id.crnihumor_navigation);

                        return true;
                    }

                    case (R.id.gostilniske_navigation): {
                        Toast.makeText(getApplicationContext(), "Gostilniške", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.gostilniskeNav);
                        displayListOfJokes(R.id.gostilniske_navigation);
                        return true;
                    }

                    case (R.id.janezek_navigation): {
                        Toast.makeText(getApplicationContext(), "Janezek", Toast.LENGTH_LONG).show();
                        getSupportActionBar().setTitle(R.string.janezNav);
                        Log.i("curCat", "Curr Cat, MainActivity: " + R.id.janezek_navigation);
                        displayListOfJokes(R.id.janezek_navigation);
                        return true;
                    }
                    case (R.id.shranjeni_navigation): {
                        JSONSerializer serializer = new JSONSerializer(getApplicationContext());
                        try {
                            if (serializer.loadCategory(JSONSerializer.PRILJUBLJENI_FILENAME).size() == 0)
                                Toast.makeText(getApplicationContext(), "Prazna kategorija", Toast.LENGTH_LONG).show();
                            else {
                                Toast.makeText(getApplicationContext(), "YOYO", Toast.LENGTH_LONG).show();
                                mToolbar.setTitle(R.string.pribljubljeniNav);
                                displayListOfJokes(R.id.shranjeni_navigation);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    }


                    case (R.id.mujohaso_navigation): {
                        Toast.makeText(getApplicationContext(), "Mujo&Haso", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.mujohasoNav);
                        displayListOfJokes(R.id.mujohaso_navigation);
                        return true;
                    }

                    case (R.id.policaji_navigation): {
                        Toast.makeText(getApplicationContext(), "Policaji", Toast.LENGTH_LONG).show();
                        getSupportActionBar().setTitle(R.string.policajiNav);
                        displayListOfJokes(R.id.policaji_navigation);
                        return true;
                    }

                    case (R.id.tvojamama_navigation): {
                        mToolbar.setTitle(R.string.tvojaMamaNav);
                        displayListOfJokes(R.id.tvojamama_navigation);
                        return true;
                    }

                    case (R.id.tasce_navigation): {
                        mToolbar.setTitle(R.string.tasceNav);
                        return true;
                    }

                    case (R.id.politicnivici_navigation): {
                        mToolbar.setTitle(R.string.politicniNav);
                        return true;
                    }

                    case (R.id.yugovici_navigation): {
                        mToolbar.setTitle(R.string.yugoviciNav);
                        displayListOfJokes(R.id.yugovici_navigation);
                        return true;

                    }
                    case (R.id.nakljucni_navigation): {
                        mToolbar.setTitle(R.string.nakljucniVici);
                        displayListOfJokes(R.id.nakljucni_navigation);
                        return true;
                    }
                    case (R.id.opolzke_navigation): {
                        mToolbar.setTitle(R.string.opolzkeNav);
                        displayListOfJokes(R.id.opolzke_navigation);
                        return true;
                    }

                    default: {
                        Toast.makeText(getApplicationContext(), "No such category...", Toast.LENGTH_LONG).show();
                        return true;
                    }


                }
            }
        });


    }

    private void actionBarDrawerToggleSetup(){

        ActionBarDrawerToggle toggler = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawerOpen, R.string.drawerClosed){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);


                invalidateOptionsMenu();


            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

                invalidateOptionsMenu();
            }
        };

        mDrawerLayout.setDrawerListener(toggler);
        toggler.syncState();

    }

    private String setupSpacesForMenu(String title){

        int titLen = title.length();

        while(titLen < 22){
           title = title.concat("_");
            titLen++;
        }

        return title;

    }

    private void setupNumOfJokesForMenu() throws IOException {

        JSONSerializer serializer = new JSONSerializer(this);

        Menu menu = mNavigationView.getMenu();

      menu.getItem(0).setTitle(getString(R.string.blondinkeNav) + " [" + serializer.loadCategory(JSONSerializer.BLONDINKE_FILENAME).size() + " vicev]");
      menu.getItem(1).setTitle(getString(R.string.opolzkeNav) + " [" + serializer.loadCategory(JSONSerializer.OPOLZKE_FILENAME).size() + " vicev]");
        menu.getItem(2).setTitle(getString(R.string.policajiNav) + " [" + serializer.loadCategory(JSONSerializer.POLICAJI_FILENAME).size() + " vicev]");
        menu.getItem(3).setTitle(getString(R.string.tvojaMamaNav) + " [" + serializer.loadCategory(JSONSerializer.TVOJAMAMA_FILENAME).size() + " vicev]");
        menu.getItem(4).setTitle(getString(R.string.gostilniskeNav) + " [" + serializer.loadCategory(JSONSerializer.GOSTILNSIKE_FILENAME).size() + " vicev]");
        menu.getItem(5).setTitle(getString(R.string.janezNav) + " [" + serializer.loadCategory(JSONSerializer.JANEZEK_FILENAME).size() + " vicev]");
        menu.getItem(6).setTitle(getString(R.string.mujohasoNav) + " [" + serializer.loadCategory(JSONSerializer.MUJOHASO_FILENAME).size()+ " vicev]");
        menu.getItem(7).setTitle(getString(R.string.crnihumorNav) + " [" + serializer.loadCategory(JSONSerializer.CRNIHUMOR_FILENAME).size() + " vicev]");
        menu.getItem(10).setTitle(getString(R.string.yugoviciNav) + " [" + serializer.loadCategory(JSONSerializer.YUGO_FILENAME).size() + " vicev]");

        menu.getItem(11).setTitle(getString(R.string.pribljubljeniNav) + " [" + serializer.loadCategory(JSONSerializer.PRILJUBLJENI_FILENAME).size() + " vicev]");
        menu.getItem(12).setTitle(getString(R.string.nakljucniVici) + " [" + serializer.loadCategory(JSONSerializer.VSIVICI_FILENAME).size() + " vicev]");

        // yoyo
    }

    public int numOfVisits() {

        SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        globalState.setNumOfVisits(prefs.getInt("counter", 0));

        return globalState.getNumOfVisits();
    }

    public void incrementAndSaveVisits() {

        SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        globalState.setNumOfVisits(prefs.getInt("counter", 0) + 1);


        editor.putInt("counter", globalState.getNumOfVisits());
        editor.commit();
//

    }

    private void displayListOfJokes(int menuItemID){

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ListOfJokesFragment.newInstance(menuItemID, getSupportActionBar().getTitle().toString()))
                .addToBackStack(null)
                .commit();

    }

    private void setupGlobalState() throws IOException {

        JSONSerializer serializer = new JSONSerializer(this);
        globalState.setBlondinkeGlobal(serializer.loadCategory(JSONSerializer.BLONDINKE_FILENAME));
        globalState.setJanezekGlobal(serializer.loadCategory(JSONSerializer.JANEZEK_FILENAME));



    }

    @Override
    protected void onResume() {
        super.onResume();



        try {
            setupNumOfJokesForMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
