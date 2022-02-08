package com.deutest.myapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class categories_humanities_childActivity extends Activity {

    ImageView x, ic_categories_humanities_child_company1;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories_humanities_child);

        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ic_categories_humanities_child_company1 = findViewById(R.id.ic_categories_humanities_child_company1);
        ic_categories_humanities_child_company1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_humanities_child_company1:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40310816&recommend_ids=eJxtj8ERwzAIBKvJH9ABxzuFqP8uIju20WTyXJbTIQjUEjmj%2BMo3Npw4B5Yjg2sQP3j5MWhhMxE%2F%2BPiSiM3feHtN1fZQL%2BH08q%2BtArnZYdisJ7UWXm%2FzCHdVlEtnFRzQXs4Q8T943rV6mVq2pVOBXq%2F1UTZC4fagUTC6yoaUblkhJQ%2F8AKWFU3c%3D&view_type=list&gz=1&t_ref_content=focus_recruit&t_ref=area_recruit&t_ref_area=202#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
