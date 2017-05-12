package com.skru.businesscomputer56.sklhalal;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.skru.businesscomputer56.sklhalal.activity.AboutActivity;
import com.skru.businesscomputer56.sklhalal.activity.FoodActivity;
import com.skru.businesscomputer56.sklhalal.activity.PlaceActivity;
import com.skru.businesscomputer56.sklhalal.activity.TimeActivity;
import com.skru.businesscomputer56.sklhalal.activity.TravelActivity;
import com.skru.businesscomputer56.sklhalal.adapter.ContectListAdapter;
import com.skru.businesscomputer56.sklhalal.adapter.ShareListAdapter;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    Button btnTime, btnFood, btnPrayer, btnAbout;

//////////////////////////////////////////////////

    ListView list, shalist;
    String[] itemname ={ "Facebook", "Google+", "Line"};
    Integer[] imgid={ R.drawable.ic_f, R.drawable.ic_gp, R.drawable.ic_line2};
    //================================================//
    String[] shaitemname ={ "ShareApp"};
    Integer[] shaimgid={ R.drawable.ic_action_share };
    //=================================================//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////////////////////////////////////////////////
        initInstances();
        /////////////////////////////////////////////////
        btnTime = (Button) findViewById(R.id.btnTime);
        btnFood = (Button) findViewById(R.id.btnFood);
        btnPrayer = (Button) findViewById(R.id.btnPrayer);
        btnAbout = (Button) findViewById(R.id.btnAbout);
        //============Drawble======================//


        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TimeActivity.class);
                startActivity(intent);
            }
        });
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FoodActivity.class);
                startActivity(intent);
            }
        });
        btnPrayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlaceActivity.class);
                startActivity(intent);
            }
        });
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TravelActivity.class);
                startActivity(intent);
            }
        });

        //========================ContactListView====================================//
        ContectListAdapter adapter=new ContectListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(),
//                        AboutActivity.class);
//                startActivity(intent);
//
//                String Slecteditem= itemname[+position];
//                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

                String[] links = getResources().getStringArray(R.array.link);

                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //========================ShareListAddater====================================//
        ShareListAdapter shareListAdapter =new ShareListAdapter(this, shaitemname, shaimgid);
        shalist=(ListView)findViewById(R.id.sharelist);
        shalist.setAdapter(shareListAdapter);

        shalist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
//                String Slecteditem= shaitemname[+position];
//                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "แอพพลิเคชั่นนี้เป็นแอพท่องเที่ยว เหมาะสำหรับทุกคนที่มาเที่ยวในตัวเมืองสงขลา https://goo.gl/1a7i4Q");
                startActivity(Intent.createChooser(intent, "Share with"));

            }
        });
        //============================================================================//
//        initButtomBar();
    }



    //============Drawble======================//
    private void initInstances() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ////////////////สร้างปุ่มบน ActionBar
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(
                MainActivity.this,
                drawerLayout,
                R.string.open_drawer,
                R.string.close_drawer
        );
        /////////ผูก drawer layout ให้กับ drawertoggle
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //////////ทำ Actionbar ให้เป็น hamberger
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }
    //////////////////////////////////////////////////////////
    ////////////ทำให้คลิกปุ่ม hamberger ได้
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;


        switch (item.getItemId()) {
            case R.id.action_about:
                Intent i = new Intent(this,AboutActivity.class);
                this.startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


//    private void initButtomBar() {
//        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
//        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
//
//            @Override
//            public void onTabSelected(@IdRes int tabId) {
//                if (tabId == R.id.buttom_nav_item_share) {
//                    Toast toast = Toast.makeText(MainActivity.this, getString(R.string.menu_bottom_nav_title_share),
//                            Toast.LENGTH_SHORT);
//                    toast.show();
//                }
//            }
//        });
//    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
   // present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
}
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}

