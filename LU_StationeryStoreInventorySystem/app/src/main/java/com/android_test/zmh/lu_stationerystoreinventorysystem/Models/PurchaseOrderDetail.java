package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

/**
 * Created by student on 5/3/15.
 */
public class PurchaseOrderDetail {
    private String id;
    private String itemName;
    private int qty;
    private double price;

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

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

}
