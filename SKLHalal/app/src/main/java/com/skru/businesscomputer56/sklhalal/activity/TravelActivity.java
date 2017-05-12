package com.skru.businesscomputer56.sklhalal.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.skru.businesscomputer56.sklhalal.MainActivity;
import com.skru.businesscomputer56.sklhalal.R;
import com.skru.businesscomputer56.sklhalal.travelpage.Travel1;
import com.skru.businesscomputer56.sklhalal.travelpage.Travel2;
import com.skru.businesscomputer56.sklhalal.travelpage.Travel3;
import com.skru.businesscomputer56.sklhalal.travelpage.Travel4;
import com.skru.businesscomputer56.sklhalal.travelpage.Travel5;
import com.skru.businesscomputer56.sklhalal.travelpage.Travel6;
import com.skru.businesscomputer56.sklhalal.travelpage.Travel7;
import com.skru.businesscomputer56.sklhalal.travelpage.Travel8;

public class TravelActivity extends AppCompatActivity {
    Button btnBack;

    Button btnPage1, btnPage2, btnPage3, btnPage4, btnPage5, btnPage6, btnPage7, btnPage8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        btnPage1 = (Button) findViewById(R.id.idbtnPage1);
        btnPage2 = (Button) findViewById(R.id.idbtnPage2);
        btnPage3 = (Button) findViewById(R.id.idbtnPage3);
        btnPage4 = (Button) findViewById(R.id.idbtnPage4);
        btnPage5 = (Button) findViewById(R.id.idbtnPage5);
        btnPage6 = (Button) findViewById(R.id.idbtnPage6);
        btnPage7 = (Button) findViewById(R.id.idbtnPage7);
        btnPage8 = (Button) findViewById(R.id.idbtnPage8);


        btnBack = (Button) findViewById(R.id.idbtnBack);

        btnPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,Travel1.class);
                startActivity(intent);
            }
        });
        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,Travel2.class);
                startActivity(intent);
            }
        });
        btnPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,Travel3.class);
                startActivity(intent);
            }
        });
        btnPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,Travel4.class);
                startActivity(intent);
            }
        });
        btnPage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,Travel5.class);
                startActivity(intent);
            }
        });
        btnPage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,Travel6.class);
                startActivity(intent);
            }
        });
        btnPage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,Travel7.class);
                startActivity(intent);
            }
        });
        btnPage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,Travel8.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
