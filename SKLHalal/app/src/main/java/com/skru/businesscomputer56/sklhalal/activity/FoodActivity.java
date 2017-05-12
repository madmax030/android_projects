package com.skru.businesscomputer56.sklhalal.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.skru.businesscomputer56.sklhalal.MainActivity;
import com.skru.businesscomputer56.sklhalal.R;
import com.skru.businesscomputer56.sklhalal.foodpage.Food1;
import com.skru.businesscomputer56.sklhalal.foodpage.Food10;
import com.skru.businesscomputer56.sklhalal.foodpage.Food2;
import com.skru.businesscomputer56.sklhalal.foodpage.Food3;
import com.skru.businesscomputer56.sklhalal.foodpage.Food4;
import com.skru.businesscomputer56.sklhalal.foodpage.Food5;
import com.skru.businesscomputer56.sklhalal.foodpage.Food6;
import com.skru.businesscomputer56.sklhalal.foodpage.Food7;
import com.skru.businesscomputer56.sklhalal.foodpage.Food8;
import com.skru.businesscomputer56.sklhalal.foodpage.Food9;


/**
 * Created by MUHAMMAD on 16/9/2559.
 */

public class FoodActivity extends Activity {
    Button btnBack;

    Button btnPage1;
    Button btnPage2;
    Button btnPage3;
    Button btnPage4;
    Button btnPage5;
    Button btnPage6;
    Button btnPage7;
    Button btnPage8;
    Button btnPage9;
    Button btnPage10;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_activity);
        //////////////////findViewById ButtonList ///////
        btnPage1 = (Button) findViewById(R.id.idbtnPage1);
        btnPage2 = (Button) findViewById(R.id.idbtnPage2);
        btnPage3 = (Button) findViewById(R.id.idbtnPage3);
        btnPage4 = (Button) findViewById(R.id.idbtnPage4);
        btnPage5 = (Button) findViewById(R.id.idbtnPage5);
        btnPage6 = (Button) findViewById(R.id.idbtnPage6);
        btnPage7 = (Button) findViewById(R.id.idbtnPage7);
        btnPage8 = (Button) findViewById(R.id.idbtnPage8);
        btnPage9 = (Button) findViewById(R.id.idbtnPage9);
        btnPage10 = (Button) findViewById(R.id.idbtnPage10);
        ////////////////////////////////////////////////////
        btnBack = (Button) findViewById(R.id.idbtnBack);

        btnPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food1.class);
                startActivity(intent);
            }
        });
        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food2.class);
                startActivity(intent);
            }
        });
        btnPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food3.class);
                startActivity(intent);
            }
        });
        btnPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food4.class);
                startActivity(intent);
            }
        });
        btnPage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food5.class);
                startActivity(intent);
            }
        });
        btnPage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food6.class);
                startActivity(intent);
            }
        });
        btnPage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food7.class);
                startActivity(intent);
            }
        });
        btnPage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food8.class);
                startActivity(intent);
            }
        });
        btnPage9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food9.class);
                startActivity(intent);
            }
        });
        btnPage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,Food10.class);
                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    ////////////////////////////////////////////

}