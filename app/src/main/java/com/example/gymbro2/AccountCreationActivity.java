package com.example.gymbro2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import com.example.gymbro2.R;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class AccountCreationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_creation);

        // You can set the click listener programmatically
        Button btnNext = findViewById(R.id.NextButton);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAccountCreation2Activity();
            }
        });
    }


    private void startAccountCreation2Activity() {
        Intent intent = new Intent(AccountCreationActivity.this, AccountCreation2Activity.class);
        startActivity(intent);
    }
}

