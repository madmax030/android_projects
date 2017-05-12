package com.skru.businesscomputer56.sklhalal.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.skru.businesscomputer56.sklhalal.MainActivity;
import com.skru.businesscomputer56.sklhalal.R;


/**
 * Created by MUHAMMAD on 16/9/2559.
 */

public class AboutActivity extends Activity {
    TextView tvHello;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);
        btnBack = (Button) findViewById(R.id.idbtnBack);

        tvHello = (TextView) findViewById(R.id.tvAbout);
        tvHello.setMovementMethod(LinkMovementMethod.getInstance());
        //Hello world
       // tvHello.setText(Html.fromHtml("<b>He<u>ll</u>o</b> <i>world</i> <font color=\"#fafafa\">la la</font> <a href=\"http://facebook.com\">http://www.facebook.com </a>"));
        tvHello.setText(Html.fromHtml("&nbsp แอพพลิเคชั่นนี้จัดทำขึ้นเพื่ออำนวยความสะดวกแก่นักท่องเที่ยวที่ได้มาเที่ยวในเมืองสงขลา <p>Application &nbsp:&nbsp SongkhlaHalal</p> <p>Version &nbsp:&nbsp 2.0</p>  <p>Developer</p>  <a href=\"https://www.facebook.com/muhammad.salaeh.285\">Muhammad Slaeh</a> <p> <a href=\"https://www.facebook.com/warintron.surakamheang\">Warintron Surakamheang</a></p>" ));
    }
    public void btnClickBack(View view) {
        Intent intent = new Intent(AboutActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
