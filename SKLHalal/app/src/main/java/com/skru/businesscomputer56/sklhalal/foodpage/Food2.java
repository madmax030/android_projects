package com.skru.businesscomputer56.sklhalal.foodpage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.skru.businesscomputer56.sklhalal.R;
import com.skru.businesscomputer56.sklhalal.activity.FoodActivity;

/**
 * Created by MUHAMMAD on 16/9/2559.
 */

public class Food2 extends Activity {
    Button btnBack;
    Button  btn;
    RatingBar  ratingBar;
    Button btnMap;

    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_2);

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
                intent.putExtra(Intent.EXTRA_TEXT, "ร้านชาวเกาะ https://goo.gl/maps/d56oRRruJr22");
                startActivity(Intent.createChooser(intent, "Share with"));

            }
        });

    }

    public void onBtnClick(View view){
        float ratingvalue=ratingBar.getRating();
        Toast.makeText(getApplication(), "Rating is: "+ratingvalue, Toast.LENGTH_SHORT).show();

    }

    public void onBtnClickMap(View view) {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=7.172800, 100.611442");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
//        Uri gmmIntentUri = Uri.parse("google.navigation:q=Taronga+Zoo,+Sydney+Australia&avoid=tf");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//        mapIntent.setPackage("com.google.android.apps.maps");
//        startActivity(mapIntent);
//    }

//        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//        mapIntent.setPackage("com.google.android.apps.maps");
//        startActivity(mapIntent);
//    }

//        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//        mapIntent.setPackage("com.google.android.apps.maps");
//        if (mapIntent.resolveActivity(getPackageManager()) != null) {
//            startActivity(mapIntent);
//        }
//    }

//        Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//        mapIntent.setPackage("com.google.android.apps.maps");
//        startActivity(mapIntent);


        // intent.addMarker(new MarkerOptions().position(Bading).title("ร้านแบดิง"));
       // intent.setData(Uri.parse("geo:7.171345, 100.611424"));
      //  Intent chooser = Intent.createChooser(intent, "แผนที่");
      //  startActivity(chooser);


    //   public void Onclick1(View view) {
    //
    //       Intent intent = new Intent(Food1.this, MapsActivity.class);
    //       startActivity(intent);
    //    }

    public void btnClickBack(View view) {
        Intent intent = new Intent(Food2.this, FoodActivity.class);
        startActivity(intent);
    }
}
