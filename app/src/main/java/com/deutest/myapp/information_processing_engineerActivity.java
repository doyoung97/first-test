package com.deutest.myapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class information_processing_engineerActivity extends Activity {

    ImageView x, information_processing_engineer_book1, information_processing_engineer_book2, information_processing_engineer_book3, information_processing_engineer_book4;
    Button btn_tip;
    EditText edit_tip;
    TextView text_tip;
    String text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_processing_engineer);

        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        information_processing_engineer_book1 = findViewById(R.id.information_processing_engineer_book1);
        information_processing_engineer_book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()){
                    case R.id.information_processing_engineer_book1:
                        intent.setData(Uri.parse("https://book.naver.com/bookdb/price.nhn?bid=17769459#book_price"));
                        startActivity(intent);
                        break;
                }
            }
        });

        information_processing_engineer_book2 = findViewById(R.id.information_processing_engineer_book2);
        information_processing_engineer_book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()){
                    case R.id.information_processing_engineer_book2:
                        intent.setData(Uri.parse("https://book.naver.com/bookdb/price.nhn?bid=17591349#book_price"));
                        startActivity(intent);
                        break;
                }
            }
        });

        information_processing_engineer_book3 = findViewById(R.id.information_processing_engineer_book3);
        information_processing_engineer_book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()){
                    case R.id.information_processing_engineer_book3:
                        intent.setData(Uri.parse("https://book.naver.com/bookdb/price.nhn?bid=17769431#book_price"));
                        startActivity(intent);
                        break;
                }
            }
        });

        information_processing_engineer_book4 = findViewById(R.id.information_processing_engineer_book4);
        information_processing_engineer_book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()){
                    case R.id.information_processing_engineer_book4:
                        intent.setData(Uri.parse("https://book.naver.com/bookdb/price.nhn?bid=17134434#book_price"));
                        startActivity(intent);
                        break;
                }
            }
        });

        btn_tip = findViewById(R.id.btn_tip);
        edit_tip = findViewById(R.id.edit_tip);
        text_tip = findViewById(R.id.text_tip);

        btn_tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = edit_tip.getText().toString();

                if(text != null)
                    text_tip.setText(text);
                edit_tip.setText("");

                Toast.makeText(getApplicationContext(),"???????????? ?????? ?????????????????????.", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onPause() { // Activity??? ????????? ????????? ?????? ????????????.
        super.onPause();
        saveState();
    }

    @Override
    protected void onStart() {  // Activity??? ????????? ???????????? ?????? ????????????.
        super.onStart();
        restoreState();
        if(text != null)
            text_tip.setText(text);
    }

    protected void saveState(){ // ???????????? ????????????.
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("text", text);

        editor.commit();
    }

    protected void restoreState(){  // ???????????? ????????????.
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        if((pref!=null) && (pref.contains("text"))){
            text = pref.getString("text", "");
        }

    }

    protected void clearPref(){  // sharedpreference??? ????????? ????????? ?????????
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        text = null;
        editor.commit();
    }


}
