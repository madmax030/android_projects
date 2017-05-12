package com.skru.businesscomputer56.sklhalal.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.skru.businesscomputer56.sklhalal.MainActivity;
import com.skru.businesscomputer56.sklhalal.R;
import com.skru.businesscomputer56.sklhalal.prayerpage.Place1;
import com.skru.businesscomputer56.sklhalal.prayerpage.Place2;
import com.skru.businesscomputer56.sklhalal.prayerpage.Place3;
import com.skru.businesscomputer56.sklhalal.prayerpage.Place4;
import com.skru.businesscomputer56.sklhalal.prayerpage.Place5;
import com.skru.businesscomputer56.sklhalal.prayerpage.Place6;
import com.skru.businesscomputer56.sklhalal.prayerpage.Place7;


/**
 * Created by MUHAMMAD on 16/9/2559.
 */

public class PlaceActivity extends Activity {
    Button btnBack;

    Button btnPage1;
    Button btnPage2;
    Button btnPage3;
    Button btnPage4;
    Button btnPage5;
    Button btnPage6;
    Button btnPage7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_activity);

        btnPage1 = (Button) findViewById(R.id.idbtnPage1);
        btnPage2 = (Button) findViewById(R.id.idbtnPage2);
        btnPage3 = (Button) findViewById(R.id.idbtnPage3);
        btnPage4 = (Button) findViewById(R.id.idbtnPage4);
        btnPage5 = (Button) findViewById(R.id.idbtnPage5);
        btnPage6 = (Button) findViewById(R.id.idbtnPage6);
        btnPage7 = (Button) findViewById(R.id.idbtnPage7);


        btnBack = (Button) findViewById(R.id.idbtnBack);

        btnPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this,Place1.class);
                startActivity(intent);
            }
        });
        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this,Place2.class);
                startActivity(intent);
            }
        });
        btnPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this,Place3.class);
                startActivity(intent);
            }
        });
        btnPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this,Place4.class);
                startActivity(intent);
            }
        });
        btnPage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this,Place5.class);
                startActivity(intent);
            }
        });
        btnPage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this,Place6.class);
                startActivity(intent);
            }
        });
        btnPage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this,Place7.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
