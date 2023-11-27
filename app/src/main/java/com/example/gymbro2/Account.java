package com.example.gymbro2;

import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Account extends AppCompatActivity {
    public void login(View view) {
        EditText username = (EditText) findViewById(R.id.UserNameTextBox);
        EditText password = (EditText) findViewById(R.id.PasswordTextBox);
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {

            //correcct password
        } else {
            //wrong password
        }
    }
}
