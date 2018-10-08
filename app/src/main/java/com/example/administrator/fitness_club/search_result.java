package com.example.administrator.fitness_club;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class search_result extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftersearch);
        getSupportActionBar().hide();
    }

    public void details(View view){
        Intent intent = new Intent(this,class_details.class);
        startActivity(intent);
    }
}
