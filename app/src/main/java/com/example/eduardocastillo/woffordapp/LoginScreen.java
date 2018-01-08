package com.example.eduardocastillo.woffordapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        final Button login_but = (Button) findViewById(R.id.login_but);
        final Button contGuest = (Button) findViewById(R.id.continue_guest);

        final LinearLayout main_pg = (LinearLayout) findViewById(R.id.main_page);
        final GridLayout le_calendare = (GridLayout) findViewById(R.id.the_calendare);

        login_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText email_addr = (EditText) findViewById(R.id.username);
                EditText password = (EditText) findViewById(R.id.password);

                //email_addr.setText(R.string.hint_username);

                contGuest.setVisibility(View.VISIBLE);

                String email_address = email_addr.getText().toString();
                String the_password = password.getText().toString();

                password.setText(email_address);
                email_addr.setText(the_password);

                main_pg.setVisibility(View.INVISIBLE);
                le_calendare.setVisibility(View.VISIBLE);

            }

        });

    }
}
