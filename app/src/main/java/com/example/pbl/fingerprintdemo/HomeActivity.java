package com.example.pbl.fingerprintdemo;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new DatabaseHandler(this);

        // get db log browser address
        //Log.i("duti", "DB Browser: " + DebugDB.getAddressLog());

    }


    public void addUser(View view) {
        Intent intent = new Intent(HomeActivity.this,
                UserRegistrationActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    public void verifyUser(View view) {
        Intent intent = new Intent(HomeActivity.this,
                UserVerificationActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
