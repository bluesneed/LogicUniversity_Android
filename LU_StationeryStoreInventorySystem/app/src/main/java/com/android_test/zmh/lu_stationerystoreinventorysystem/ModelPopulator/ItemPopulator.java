package com.android_test.zmh.lu_stationerystoreinventorysystem.ModelPopulator;

import com.android_test.zmh.lu_stationerystoreinventorysystem.IPopulator.IItemPopulator;
import com.android_test.zmh.lu_stationerystoreinventorysystem.Models.Item;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 7/3/15.
 */
public class ItemPopulator implements IItemPopulator{
    @Override
    public ArrayList<Item> populateItemList(JSONArray ja) {

        ArrayList<Item> list = new ArrayList<Item>();
        for (int i = 0; i<ja.length();i++){
            try {
                JSONObject jo = ja.getJSONObject(i);
                Item item = new Item();
                item.setCategory(jo.getString("id"));
                item.setDescription(jo.getString("id"));
                item.setReorderLevel(jo.getInt("server"));
                item.setBalance(jo.getInt("server"));
                list.add(item);
                // list.add(new (jo.getString("id"),jo.getString("server"),jo.getString("server")));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return list;

    }

    @Override
    public ArrayList<Item> populatePendingProcessedItem(JSONArray ja) {
        ArrayList<Item> list = new ArrayList<Item>();
        for (int i = 0; i<ja.length();i++){
            try {
                JSONObject jo = ja.getJSONObject(i);
                Item item = new Item();
                item.setDescription(jo.getString("id"));
                item.setBalance(jo.getInt("server"));
                list.add(item);
                // list.add(new (jo.getString("id"),jo.getString("server"),jo.getString("server")));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public Item populateItemDetail(JSONObject jo) throws JSONException {
        Item i = new Item();
        i.setCategory(jo.getString("id"));
        i.setDescription(jo.getString("id"));
        i.setReorderLevel(jo.getInt("server"));
        i.setBalance(jo.getInt("farm"));
        return i;
    }
}
