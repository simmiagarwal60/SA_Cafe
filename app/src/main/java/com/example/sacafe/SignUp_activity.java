package com.example.sacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignUp_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setTitle("Sign Up");
    }
}