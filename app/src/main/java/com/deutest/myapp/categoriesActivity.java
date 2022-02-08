package com.deutest.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class categoriesActivity extends Activity {

    ImageView x, it, engineering, business, humanities, medical, art;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        it = findViewById(R.id.it);
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categories_itActivity.class);
                startActivity(intent);
            }
        });  // 이거 왜 안되지? ALl Categories 화면에서 IT 공과대학 클릭시 이 창으로 오는거

        engineering = findViewById(R.id.engineering);
        engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categories_engineeringActivity.class);
                startActivity(intent);
            }
        });

        business = findViewById(R.id.business);
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categories_businessActivity.class);
                startActivity(intent);
            }
        });

        humanities = findViewById(R.id.humanities);
        humanities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categories_humanitiesActivity.class);
                startActivity(intent);
            }
        });


        medical = findViewById(R.id.medical);
        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categories_medicalActivity.class);
                startActivity(intent);
            }
        });

        art = findViewById(R.id.art);
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), categories_artActivity.class);
                startActivity(intent);
            }
        });


    }
}