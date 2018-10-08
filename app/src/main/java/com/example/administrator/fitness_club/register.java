package com.example.administrator.fitness_club;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.angmarch.views.NiceSpinner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        NiceSpinner niceSpinner = (NiceSpinner) findViewById(R.id.nice_spinner);
        List<String> dataset = new LinkedList<>(Arrays.asList("瑜伽", "游泳", "拳击", "乒乓球", "电子竞技"));
        niceSpinner.attachDataSource(dataset);
    }

    public void homeAction(View view) {
        Intent intent = new Intent(this, IndexActivity.class);
        startActivity(intent);
    }

    public void returnAction(View view){
        Intent intent = new Intent(this, login.class);
        finish();
        startActivity(intent);
    }
}
