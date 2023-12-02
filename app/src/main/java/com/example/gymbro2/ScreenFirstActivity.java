package com.example.gymbro2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import android.view.View;
import android.content.Intent;
public class ScreenFirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_first);

        Button createAccountButton = findViewById(R.id.CreateAccountButton);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override


            public void


            onClick(View v) {
                // Create an Intent to start the com.example.gymbro2.AccountCreationActivity
                Intent intent = new Intent(ScreenFirstActivity.this, AccountCreationActivity.class);

                // Start the activity
                startActivity(intent);
            }
        });

        Button Log_InButton = findViewById(R.id.LogInButton);

        Log_InButton.setOnClickListener(new View.OnClickListener() {
            @Override


            public void

            onClick(View v) {
                // Create an Intent to start the com.example.gymbro2.AccountCreationActivity
                Intent intent = new Intent(ScreenFirstActivity.this, LogInActivity.class);

                // Start the activity
                startActivity(intent);
            }
        });
    }

}