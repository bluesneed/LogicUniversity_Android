package com.android_test.zmh.lu_stationerystoreinventorysystem.StoreScreens;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.android_test.zmh.lu_stationerystoreinventorysystem.R;


public class CheckLowStockSearch extends ActionBarActivity {
    Spinner spinner_category;
    Spinner spinner_description;
    private String[] category = new String[]{"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj"};
    ArrayAdapter<String> categoryAdapter = null;
    ArrayAdapter<String> descriptionAdapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_low_stock_search);
        spinner_category = (Spinner) findViewById(R.id.category);
        spinner_description = (Spinner) findViewById(R.id.description);

        categoryAdapter = new ArrayAdapter<String>(CheckLowStockSearch.this,
                android.R.layout.simple_dropdown_item_1line, category);
        spinner_category.setAdapter(categoryAdapter);
        spinner_description.setAdapter(categoryAdapter);


        spinner_category.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_check_low_stock_search, menu);
        return false;
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
