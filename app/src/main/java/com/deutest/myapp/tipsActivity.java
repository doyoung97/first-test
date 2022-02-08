package com.deutest.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class tipsActivity extends Activity {

    ImageView x;
    // 한 단대당 Button 2개, Edit 2개 Text 1개씩
    Button insert_it, delete_it;
    EditText et_name_it, et_text_it;
    TextView tv_it;
    String text_it;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips);

        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        insert_it = findViewById(R.id.insert_it);
        et_text_it = findViewById(R.id.et_text_it);
        tv_it = findViewById(R.id.tv_it);

        insert_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_it = et_text_it.getText().toString();

                if(text_it != null)
                    tv_it.setText(text_it);
                et_text_it.setText("");

                Toast.makeText(getApplicationContext(),"작성하신 글이 등록되었습니다.", Toast.LENGTH_LONG).show();
            }
        });

    }
}