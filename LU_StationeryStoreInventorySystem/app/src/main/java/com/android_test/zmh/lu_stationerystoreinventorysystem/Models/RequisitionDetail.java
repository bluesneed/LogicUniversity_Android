package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

/**
 * Created by student on 5/3/15.
 */
public class RequisitionDetail {
    private String id;
    private String itemName;
    private int qty;
    private int actualQty;

    private String getID() {
        return id;
    }

    private void setID(String id) {
        this.id = id;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    private int getQty() {
        return qty;
    }

    private void setQty(int qty) {
        this.qty = qty;
    }

    private int getActualQty() {
        return actualQty;
    }

    private void setActualQty(int actualQty) {
        this.actualQty = actualQty;
    }
}
