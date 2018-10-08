package com.example.administrator.fitness_club;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class IndexActivity extends AppCompatActivity {
    Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        getSupportActionBar().hide();
        initView();
    }
    private void initView() {
        banner = (Banner) findViewById(R.id.banner);
        //本地图片数据（资源文件）
        List<Integer> list=new ArrayList<>();
        list.add(R.drawable.boxing);
        list.add(R.drawable.yoga);

        banner.setImages(list)
                .setImageLoader(new GlideImageLoader())
                .start();
    }

    public void loginAction(View view){
        Intent intent = new Intent(this,search.class);
        startActivity(intent);
    }
}

