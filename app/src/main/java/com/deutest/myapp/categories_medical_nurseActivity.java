package com.deutest.myapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class categories_medical_nurseActivity extends Activity {

    ImageView x, ic_categories_medical_nurse_company1, ic_categories_medical_nurse_company2, ic_categories_medical_nurse_company3;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories_medical_nurse);

        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ic_categories_medical_nurse_company1 = findViewById(R.id.ic_categories_medical_nurse_company1);
        ic_categories_medical_nurse_company1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_medical_nurse_company1:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40233650&recommend_ids=eJxtj8kRAzEIBKPxH4b77UCUfxZm5V1J5fKz1QwalCACr2HOr3jrgUPngyg8dIT6Dz6%2BlCK3rzLIH7zHuURrr1NmtLOyiSQSoLtMZ9Mpczjhsaay0VL9sNw%2FYSPQ0xudOn%2FjtVk44shmF%2BsaTysrytVK1OC5LGfytN%2BLAM6whdp7Pa7sB3oAS1M%3D&view_type=list&gz=1&t_ref_content=premium_recruit&t_ref=area_recruit&t_ref_area=104#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });

        ic_categories_medical_nurse_company2 = findViewById(R.id.ic_categories_medical_nurse_company2);
        ic_categories_medical_nurse_company2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_medical_nurse_company2:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40371970&recommend_ids=eJxdzrsNAzEMA9Bp0ov6UnUG8f5bxLgL5EvKRwqEXBzRwhUdr3r7pqk%2FuAPkys6LUhUuu%2F3n8m%2BgQl%2Fld6%2FJfTIUtgcO1YMcmmUzDlsgOQS0BD%2FLPMsWldmnVZQ9lsneL87XEug4BIs91LQghiZa0NNa5z31AdD3RBI%3D&view_type=list&gz=1&t_ref_content=focus_recruit&t_ref=area_recruit&t_ref_area=104#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });

        ic_categories_medical_nurse_company3 = findViewById(R.id.ic_categories_medical_nurse_company3);
        ic_categories_medical_nurse_company3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_medical_nurse_company3:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40367717&recommend_ids=eJxV0MkNQ0EIA9BqcjcDZjmnkOm%2Fi0SJ9GWOT5YAEwjjoC%2BHr3rHl35CGdYuNKfSM6HpiRRWZQmZsLWoKETLKEwj%2Bxb7z0iyHoZNdN6CP8xZJBZPLxqFtH1VtjY68N83PjPVP%2Bw%3D&view_type=list&gz=1&t_ref_content=focus_fix&t_ref=area_recruit&t_ref_area=103#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });


    }

}
