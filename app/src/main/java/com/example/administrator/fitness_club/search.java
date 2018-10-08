package com.example.administrator.fitness_club;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class search extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().hide();
    }

    public void searchResult(View view){
        Intent intent = new Intent(this,search_result.class);
        startActivity(intent);
    }
}
