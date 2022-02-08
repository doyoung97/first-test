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

                Toast.makeText(getApplicationContext(),"작성하신 글이 등록되었습니다.", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onPause() { // Activity가 보이지 않을때 값을 저장한다.
        super.onPause();
        saveState();
    }

    @Override
    protected void onStart() {  // Activity가 보이기 시작할때 값을 저장한다.
        super.onStart();
        restoreState();
        if(text != null)
            text_tip.setText(text);
    }

    protected void saveState(){ // 데이터를 저장한다.
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("text", text);

        editor.commit();
    }

    protected void restoreState(){  // 데이터를 복구한다.
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        if((pref!=null) && (pref.contains("text"))){
            text = pref.getString("text", "");
        }

    }

    protected void clearPref(){  // sharedpreference에 쓰여진 데이터 지우기
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        text = null;
        editor.commit();
    }


}
