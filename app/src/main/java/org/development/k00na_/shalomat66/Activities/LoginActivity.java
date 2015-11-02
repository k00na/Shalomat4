package org.development.k00na_.shalomat66.Activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseFacebookUtils;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import org.development.k00na_.shalomat66.MainActivity;
import org.development.k00na_.shalomat66.R;

import java.util.ArrayList;

import mehdi.sakout.fancybuttons.FancyButton;

/**
 * Created by k00na_ on 29.10.2015.
 *
 *  // NOTES AND THOUGHTS
 *
 *  Ta activity bo moral imeti drugačen izgled, ko bo user že signed in bo dostopal do njega.
 *  Ubistvu bo v tem primeru znotraj MainActivity-ja imel na možnost samo "Sign Out" pod optionsMenu
 *  in če bo kliknu na signOut se mu bo pojavu pop-up menu za potrditev izbire.
 *
 *
 *
 */
public class LoginActivity extends AppCompatActivity {


    private EditText mUser_ET, mPassword_ET;
    private FancyButton mLogin_BTN, mRegisterBTN;
    private LoginButton loginButton;
    private CallbackManager callbackManager;
    private ArrayList<String> permissions = new ArrayList<>();
    private View positiveAction;
    private String inputUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_sourcey);


        setupViews();

        // facebook login stuff

        permissions.add("user_friends");
        permissions.add("email");
        permissions.add("public_profile");


        loginButton = (LoginButton)findViewById(R.id.login_button_FB);
        loginButton.setReadPermissions(permissions);
        callbackManager = CallbackManager.Factory.create();



        // Callback registration
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
                Log.d("fb", "onSuccess");

                loginWithParseFacebook();
            }

            @Override
            public void onCancel() {
                // App code
                Log.d("fb", "onCancel");
            }


            @Override
            public void onError(FacebookException exception) {
                // App code
                Log.d("fb", "onError");
            }
        });


        // <-- END OF facebook login stuff


        mLogin_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loginWithRegularParse();
            }
        });

        mRegisterBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(openRegister);
            }
        });


    }

    /**
     *  CUSTOM METHODS DOWN-BELLOW:
     */

    private void loginWithRegularParse(){

        String uName = mUser_ET.getText().toString();
        String pass = mPassword_ET.getText().toString();

        ParseUser.logInInBackground(uName, pass, new LogInCallback() {
            @Override
            public void done(ParseUser parseUser, ParseException e) {
                if (parseUser != null) {
                    Toast.makeText(LoginActivity.this, "Prijava uspešna!", Toast.LENGTH_LONG).show();


                } else
                    Toast.makeText(LoginActivity.this, "Prijava neuspešna, poizkusite ponovno.", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void loginWithParseFacebook(){


        ParseFacebookUtils.logInWithReadPermissionsInBackground(LoginActivity.this, permissions, new LogInCallback() {
            @Override
            public void done(ParseUser parseUser, ParseException e) {

                if (parseUser == null) { // cancel button pressed

                    Log.d("fb parse", "cancel");
                } else if (parseUser.isNew()) { // new user
                    Log.d("fb parse", "new user");
                    materialDialogUsername(parseUser);


                    // parseUser.setUsername();
                } else { // old user
                    Log.d("fb parse", "old user");

                    Toast.makeText(LoginActivity.this, "Prijava uspešna!", Toast.LENGTH_LONG).show();
                    Intent backToMain = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(backToMain);


                }


            }
        });

    }

    private void alertDialogEnterUsername(final ParseUser pUser) {

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        final EditText edittext = new EditText(LoginActivity.this);
        alert.setMessage("Vnesite psevdonim, ki bo prikazan pod vici, ki jih boste dodali.");
        alert.setTitle("Uporabniško ime");
        alert.setIcon(R.drawable.smiley_icon2);

        alert.setView(edittext);

        alert.setPositiveButton("Končaj", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //What ever you want to do with the value
                String newUserName = edittext.getText().toString();
                pUser.setUsername(newUserName);
                pUser.saveInBackground();
            }
        });

        alert.show();
    }

    private void materialDialogUsername(final ParseUser pUser){


        new MaterialDialog.Builder(this)
                .title("Določite svoje uporabniško ime")
                .content("Vnesite poljubno ime s katerim se boste podpisovali pod svoje vice.")
                .inputRangeRes(2, 16, R.color.error_color)
                .inputType(InputType.TYPE_CLASS_TEXT)
                .input(" ... ", "", new MaterialDialog.InputCallback() {

                    @Override
                    public void onInput(MaterialDialog dialog, CharSequence input) {
                        // Do something

                        inputUsername = input.toString();
                        pUser.setUsername(input.toString());
                        pUser.saveInBackground(new SaveCallback() {
                            @Override
                            public void done(ParseException e) {

                                if (e == null) {
                                    Intent backToMain = new Intent(LoginActivity.this, MainActivity.class);
                                    startActivity(backToMain);
                                } else
                                    Toast.makeText(LoginActivity.this, "Nekaj je narobe znotraj pUser.saveinbackground", Toast.LENGTH_LONG).show();

                            }
                        });
                    }
                })
                .positiveText("OK")
                .show();


    }


    private void setupViews(){

        mUser_ET = (EditText)findViewById(R.id.enterUsername_ET);
        mPassword_ET = (EditText)findViewById(R.id.enterPassword_ET);
        mLogin_BTN = (FancyButton)findViewById(R.id.vpis_BTN);
        mRegisterBTN = (FancyButton)findViewById(R.id.novRacun_BTN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        callbackManager.onActivityResult(requestCode, resultCode, data);
        ParseFacebookUtils.onActivityResult(requestCode, resultCode, data);
    }
}
