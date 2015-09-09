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
import android.view.Gravity;
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

        setupViews();
        navigationListener();
        actionBarDrawerToggleSetup();


        if (numOfVisits() == 0) {

            CreateFilesForCategories createFiles = new CreateFilesForCategories(this);
            JSONSerializer serializer = new JSONSerializer(this);
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
            displayListOfJokes(R.id.nakljucni_navigation);
            mDrawerLayout.openDrawer(Gravity.LEFT);
            incrementAndSaveVisits();


        } else{
            displayListOfJokes(R.id.nakljucni_navigation);
            Toast.makeText(this, "Num of entries: " + numOfVisits(), Toast.LENGTH_LONG).show();
            incrementAndSaveVisits();
        }

        navigationListener();

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
                        mToolbar.setTitle(R.string.janezNav);
                        return true;
                    }
                    case (R.id.priljubljeni_navigation):{
                        JSONSerializer serializer = new JSONSerializer(getApplicationContext());
                        try {
                            if(serializer.loadCategory(JSONSerializer.PRILJUBLJENI_FILENAME).size() == 0)
                                Toast.makeText(getApplicationContext(), "Prazna kategorija", Toast.LENGTH_LONG).show();
                            else {
                                Toast.makeText(getApplicationContext(), "YOYO", Toast.LENGTH_LONG).show();
                                mToolbar.setTitle(R.string.pribljubljeniNav);
                                displayListOfJokes(R.id.priljubljeni_navigation);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    }


                    case (R.id.mujohaso_navigation): {
                        Toast.makeText(getApplicationContext(), "Mujo&Haso", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.mujohasoNav);
                        return true;
                    }

                    case (R.id.policaji_navigation): {
                        Toast.makeText(getApplicationContext(), "Policaji", Toast.LENGTH_LONG).show();
                        mToolbar.setTitle(R.string.policajiNav);
                        return true;
                    }

                    case (R.id.tvojamama_navigation): {
                        mToolbar.setTitle(R.string.tvojaMamaNav);
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
                        return true;

                    }



                    case (R.id.nakljucni_navigation):{
                        mToolbar.setTitle(R.string.nakljucniVici);
                        displayListOfJokes(R.id.nakljucni_navigation);

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



    }



}
