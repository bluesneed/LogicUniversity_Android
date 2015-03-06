package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by JiawenHuang on 5/3/15.
 */
public class StockItem extends HashMap<String,String> {

    public StockItem(String description, String reorderlevel, String balance) {
        put("description", description);
        put("reorderlevel", reorderlevel);
        put("balance", balance);
    }

    public static List<StockItem> parseJSONArray(JSONArray ja){

        List<StockItem> list = new ArrayList<StockItem>();
        for (int i = 0; i<ja.length();i++){
            try {
                JSONObject jo = ja.getJSONObject(i);
                list.add(new StockItem(jo.getString("id"),jo.getString("server"),jo.getString("server")));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return list;
    }







}
