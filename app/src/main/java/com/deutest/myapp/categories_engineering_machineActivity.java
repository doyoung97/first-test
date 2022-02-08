package com.deutest.myapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class categories_engineering_machineActivity extends Activity {

    ImageView x, ic_categories_engineering_machine_company1, ic_categories_engineering_machine_company2, ic_categories_engineering_machine_company3;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories_engineering_machine);

        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ic_categories_engineering_machine_company1 = findViewById(R.id.ic_categories_engineering_machine_company1);
        ic_categories_engineering_machine_company1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_engineering_machine_company1:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40387687&recommend_ids=eJxdkMkRQzEIQ6vJnUVs5xTi%2FruI%2FwoTc3rIiBEgtUTWsvJPfDFw4WzsYj4adiMreAX8D%2B%2FvakHkw%2B7B1gP2ziucdbs7XxgGqVaLhSeWljRGCWljwgLvZjmCtLofU1vtTALvVMxqOkKag4ZK6RNzu60gvZwryXOF5T3roue9fqDtS3I%3D&view_type=list&gz=1&t_ref_content=grand&t_ref=area_recruit&t_ref_area=104#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });

        ic_categories_engineering_machine_company2 = findViewById(R.id.ic_categories_engineering_machine_company2);
        ic_categories_engineering_machine_company2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_engineering_machine_company2:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40373512&recommend_ids=eJxdj8kBwzAIBKvJn3vhnULUfxfBsSMcP4dBK9ZIoWy1ovKFt5E6iGJ58AOXfQc9CucFiwdeXktEfPvBnxeyqJ1v7EW5vPy0wZrz2ljFbhYlpJMdLQfZIcBcDgTislqVndI1SU7bR%2BTUkHSk9UdXVEpobRSvTrt1NnPbVw1ORdTfOkQO%2FAC2HU9p&view_type=list&gz=1&t_ref_content=grand&t_ref=area_recruit&t_ref_area=205#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });

        ic_categories_engineering_machine_company3 = findViewById(R.id.ic_categories_engineering_machine_company3);
        ic_categories_engineering_machine_company3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_engineering_machine_company3:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40290400&recommend_ids=eJxdj8sRAyAIRKvJnc8Cck4h9t9FcEbFyXHl7UeQwlxoWvonvnjkxH4IEXnuR567GafMwLpruvvQjmNAvXDnP7ndIvVE2%2F3Kk57VZvfe8vgTxrh1La%2BfhbP9RXDHgS1pFG4bTr1fWWEKpwdWQcNVFTGeZSvrDqlkJt5w5Q4b3r21ycLfGUy64B%2F691bi&view_type=list&gz=1&t_ref_content=premium_recruit&t_ref=area_recruit&t_ref_area=102#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });




    }
}
