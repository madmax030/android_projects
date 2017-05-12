package com.skru.businesscomputer56.sklhalal.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.skru.businesscomputer56.sklhalal.MainActivity;
import com.skru.businesscomputer56.sklhalal.R;

/**
 * Created by MUHAMMAD on 3/3/2560.
 */

public class Walcame extends MainActivity {
    Button idbtnHome;
    TextView idSkip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        idbtnHome = (Button) findViewById(R.id.idbtnHome);
        idSkip = (TextView) findViewById(R.id.idSkip);

        idbtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walcame.this, MainActivity.class);
                startActivity(intent);
            }
        });

        idSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walcame.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
    }
}
