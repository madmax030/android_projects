package com.skru.businesscomputer56.sklhalal.prayerpage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.skru.businesscomputer56.sklhalal.R;
import com.skru.businesscomputer56.sklhalal.activity.PlaceActivity;


/**
 * Created by MUHAMMAD on 16/9/2559.
 */

public class Place5 extends Activity {
    Button btnBack;
    Button  btn;
    RatingBar  ratingBar;
    Button btnMap;
    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_5);

        btn = (Button) findViewById(R.id.button);
        ratingBar = (RatingBar) findViewById(R.id.idratingBar);
        btnMap = (Button) findViewById(R.id.idbtnMap);

        btnBack = (Button) findViewById(R.id.idbtnBack);

        btnShare= (Button) findViewById(R.id.idbtnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "รัสยิดบ้านด่าน  https://goo.gl/maps/Qtontvo93w12");
                startActivity(Intent.createChooser(intent, "Share with"));

            }
        });

    }

    public void onBtnClick(View view){
        float ratingvalue=ratingBar.getRating();
        Toast.makeText(getApplication(), "Rating is: "+ratingvalue, Toast.LENGTH_SHORT).show();

    }

    public void onBtnClickMap(View view) {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=7.103972, 100.632956");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    //   public void Onclick1(View view) {
    //
    //       Intent intent = new Intent(Food1.this, MapsActivity.class);
    //       startActivity(intent);
    //    }

    public void btnClickBack(View view) {
        Intent intent = new Intent(Place5.this, PlaceActivity.class);
        startActivity(intent);
    }
}
