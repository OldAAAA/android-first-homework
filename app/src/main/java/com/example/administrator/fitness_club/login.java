package com.example.administrator.fitness_club;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }

    public void loginAction(View view){
        Intent intent = new Intent(this,IndexActivity.class);
        startActivity(intent);
    }

    public void registerAction(View view){
        Intent intent = new Intent(this,register.class);
        startActivity(intent);
    }
}
