package org.development.k00na_.shalomat66.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

import org.development.k00na_.shalomat66.MainActivity;
import org.development.k00na_.shalomat66.R;

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
    private Button mLogin_BTN, mRegisterBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_activity);
        setupViews();


        mLogin_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loginWithParse();
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

    private void loginWithParse(){

        String uName = mUser_ET.getText().toString();
        String pass = mPassword_ET.getText().toString();

        ParseUser.logInInBackground(uName, pass, new LogInCallback() {
            @Override
            public void done(ParseUser parseUser, ParseException e) {
                if(parseUser != null){
                    Toast.makeText(LoginActivity.this, "Prijava uspešna!", Toast.LENGTH_LONG).show();
                    Intent backToMain = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(backToMain);
                }
                else
                    Toast.makeText(LoginActivity.this, "Prijava neuspešna, poizkusite ponovno.", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void setupViews(){

        mUser_ET = (EditText)findViewById(R.id.enterUsername_ET);
        mPassword_ET = (EditText)findViewById(R.id.enterPassword_ET);
        mLogin_BTN = (Button)findViewById(R.id.vpis_BTN);
        mRegisterBTN = (Button)findViewById(R.id.novRacun_BTN);
    }
}
