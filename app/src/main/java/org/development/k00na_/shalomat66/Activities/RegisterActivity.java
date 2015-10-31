package org.development.k00na_.shalomat66.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import org.development.k00na_.shalomat66.MainActivity;
import org.development.k00na_.shalomat66.R;

import mehdi.sakout.fancybuttons.FancyButton;

/**
 * Created by k00na_ on 30.10.2015.
 */
public class RegisterActivity extends AppCompatActivity {

    private EditText mRegUser_ET, mRegPass_ET, mRegPassCheck_ET;
    private FancyButton mRegister_BTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.register_activity);

        setupViews();

        mRegister_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = mRegUser_ET.getText().toString();
                String pass1 = mRegPass_ET.getText().toString();
                String pass2 = mRegPassCheck_ET.getText().toString();

                if (userName.length() == 0 || pass1.length() == 0 || pass2.length() == 0)
                    Toast.makeText(RegisterActivity.this, "Vnesite podatke v vsa polja", Toast.LENGTH_LONG).show();
                else if (!pass1.equals(pass2))
                    Toast.makeText(RegisterActivity.this, "Vnešeni gesli se ne ujemata", Toast.LENGTH_LONG).show();
                else if (userName.length() < 2 || userName.length() > 16)
                    Toast.makeText(RegisterActivity.this, "Uporabniško ime mora vsebovati vsaj 2 znaka in ne več kot 16 znakov.", Toast.LENGTH_LONG).show();
                else
                    newParseUser(userName, pass1);
            }



        });

    }

    private void newParseUser(String userName, String pass1) {
        ParseUser user = new ParseUser();
        user.setUsername(userName);
        user.setPassword(pass1);

        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Toast.makeText(RegisterActivity.this, "Registracija uspešna", Toast.LENGTH_LONG).show();
                    Intent backToMain = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(backToMain);
                } else
                    Toast.makeText(RegisterActivity.this, "Napaka pri registraciji: " + e.toString(), Toast.LENGTH_LONG).show();
            }
        });


    }

    private void setupViews() {

        mRegUser_ET = (EditText)findViewById(R.id.registrationUsername_ET);
        mRegPass_ET= (EditText)findViewById(R.id.registrationPassword_ET);
        mRegPassCheck_ET = (EditText)findViewById(R.id.registrationPasswordDoubleCheck_ET);
        mRegister_BTN = (FancyButton)findViewById(R.id.registracija_BTN);
    }
}
