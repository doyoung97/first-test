package com.deutest.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView redarrow, it2, chemical2, machine2, alarm, message;
    ImageView ux, android, game, webprogramming, security;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redarrow = findViewById(R.id.redarrow);
        redarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categoriesActivity.class);
                startActivity(intent);
            }
        });

        it2 = findViewById(R.id.it2);
        it2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categories_itActivity.class);
                startActivity(intent);
            }
        });

        chemical2 = findViewById(R.id.chemical2);
        chemical2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categories_engineeringActivity.class);
                startActivity(intent);
            }
        });

        machine2 = findViewById(R.id.machine2);
        machine2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categories_engineeringActivity.class);
                startActivity(intent);
            }
        });

        alarm = findViewById(R.id.alarm);
        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), alarmActivity.class);
                startActivity(intent);
            }
        });

        message = findViewById(R.id.message);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), tipsActivity.class);
                startActivity(intent);
            }
        });


        ux = findViewById(R.id.ux);
        ux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()){
                    case R.id.ux:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/list/job-category?cat_key=41213"));
                        startActivity(intent);
                        break;
                }
            }
        });

        android = findViewById(R.id.android);
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()){
                    case R.id.android:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/list/job-category?cat_key=40702"));
                        startActivity(intent);
                        break;
                }
            }
        });

        game = findViewById(R.id.game);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()){
                    case R.id.game:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/list/job-category?cat_cd=405&panel_type=&search_optional_item=n&search_done=y&panel_count=y"));
                        startActivity(intent);
                        break;
                }
            }
        });

        webprogramming = findViewById(R.id.webprogramming);
        webprogramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()){
                    case R.id.webprogramming:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/list/job-category?cat_cd=404"));
                        startActivity(intent);
                        break;
                }
            }
        });

        security = findViewById(R.id.security);
        security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()){
                    case R.id.security:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/list/job-category?cat_key=40226"));
                        startActivity(intent);
                        break;
                }
            }
        });





    }
}