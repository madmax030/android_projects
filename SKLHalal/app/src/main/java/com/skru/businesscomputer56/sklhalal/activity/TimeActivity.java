package com.skru.businesscomputer56.sklhalal.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.skru.businesscomputer56.sklhalal.MainActivity;
import com.skru.businesscomputer56.sklhalal.R;

;

/**
 * Created by MUHAMMAD on 16/9/2559.
 */

public class TimeActivity extends Activity {
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_activity);

        btnBack = (Button) findViewById(R.id.idbtnBack);
    }
    public void btnClickBack(View view) {
        Intent intent = new Intent(TimeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
