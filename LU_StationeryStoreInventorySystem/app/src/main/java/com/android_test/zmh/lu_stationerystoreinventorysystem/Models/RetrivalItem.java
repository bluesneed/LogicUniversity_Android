package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by JiawenHuang on 6/3/15.
 */
public class RetrivalItem extends HashMap<String,String> {
    public RetrivalItem(String description,String qty){
        put("description",description);
        put("qty",qty);
    }

    public static List<RetrivalItem> parseJSONArray(JSONArray ja){

        List<RetrivalItem> list = new ArrayList<RetrivalItem>();
        for (int i = 0; i<ja.length();i++){
            try {
                JSONObject jo = ja.getJSONObject(i);
                list.add(new RetrivalItem(jo.getString("id"),jo.getString("server")));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
