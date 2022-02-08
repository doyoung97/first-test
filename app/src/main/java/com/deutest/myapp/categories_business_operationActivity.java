package com.deutest.myapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class categories_business_operationActivity extends Activity {

    ImageView x, ic_categories_business_operation_company1, ic_categories_business_operation_company2, ic_categories_business_operation_company3;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories_business_operation);

        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ic_categories_business_operation_company1 = findViewById(R.id.ic_categories_business_operation_company1);
        ic_categories_business_operation_company1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_business_operation_company1:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40236527&recommend_ids=eJxdkMkRAzEIBKPxX8BwzNuBKP8srK3VVX42Ay0QmkkJoyfyk19c2PEWSG1tFOJFC1Z250wLiDrpxjktgNrTPvM0yTrTZDX0YfzDOd28KvPkqU4%2FMirdztsb1%2BaNaXraN85cKVXRPeRdlQZioxEKXPaF%2B188za984cpDrPzSGeXWLVztCfdLl1LJcfmDwzPcEvOUGzt%2BEItjBg%3D%3D&view_type=list&gz=1&t_ref_content=grand_fix&t_ref=area_recruit&t_ref_area=102#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });

        ic_categories_business_operation_company2 = findViewById(R.id.ic_categories_business_operation_company2);
        ic_categories_business_operation_company2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_business_operation_company2:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40379462&recommend_ids=eJxdkDEWBCEIQ0%2BzPWCAUM9BvP8t1kIZ35TfJBCEDHiYTC%2F88sGFcz8QCM5EfPDoVSbSugTMOKOixzkW8oMnbUiJV2%2Fs6RT1d3vj1qErwlXXtw4DLvvBtnvJZae4XXYmqY1aGfQ%2BRWugLnPC%2FWqmJmGNVkpGI1RtlTh7dayfGG8WpWVLjT9Gn1cj&view_type=list&gz=1&t_ref_content=grand_fix&t_ref=area_recruit&t_ref_area=104#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });

        ic_categories_business_operation_company3 = findViewById(R.id.ic_categories_business_operation_company3);
        ic_categories_business_operation_company3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                switch (v.getId()) {
                    case R.id.ic_categories_business_operation_company3:
                        intent.setData(Uri.parse("https://www.saramin.co.kr/zf_user/jobs/relay/view?isMypage=no&rec_idx=40399724&recommend_ids=eJxt0MkNAzEMA8Bq8qdone8U4v67yJ7yYpHniBAoWzGUYjJD4xNffXDqOQhV%2BjSXFzsXwLYFP%2BkMRlOByPzDe7vKOKaVv3jlLA3fB292%2B%2FCq1d68c9S%2B0Hmz%2B1n2yJvr9UD2fSpWB%2B3ioC6CHKb9VSBSYtHgktPBk04ZcnF7dzpypZIpR9F1hhr94A9gjl6S&view_type=list&gz=1&t_ref_content=grand_fix&t_ref=area_recruit&t_ref_area=205#seq=0"));
                        startActivity(intent);
                        break;
                }
            }
        });




    }
}
