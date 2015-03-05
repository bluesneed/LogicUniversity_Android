package com.android_test.zmh.lu_stationerystoreinventorysystem.StoreScreens;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import com.android_test.zmh.lu_stationerystoreinventorysystem.MainScreens.ClerkMainScreen;
import com.android_test.zmh.lu_stationerystoreinventorysystem.R;


public class CheckLowStockMain extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_low_stock_main);
        TabHost th = (TabHost)findViewById(R.id.tabHost);
        th.setup();

        TabHost.TabSpec ts =  th.newTabSpec("LowStockItems");
        // ts.setContent(R.id.lowStockItems);
        ts.setIndicator("Low Stock Items");
        Intent i = new Intent(this, ClerkMainScreen.class);
       // ts.setContent(i);
        th.addTab(ts);

        ts =  th.newTabSpec("allStockItems");
       // ts.setContent(R.id.allItems);
        ts.setIndicator("All Stock Items");
        th.addTab(ts);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_check_low_stock_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
