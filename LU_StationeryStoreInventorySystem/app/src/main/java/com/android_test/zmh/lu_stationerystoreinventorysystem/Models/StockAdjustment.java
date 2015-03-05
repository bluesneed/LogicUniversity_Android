package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.util.Date;

/**
 * Created by student on 5/3/15.
 */
public class StockAdjustment {
    private String id;
    private String voucherId;
    private String itemName;
    private int qty;
    private double price;
    private String status;
    private String reason;
    private Date date;

    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private String getVoucherId(){
        return voucherId;
    }

    private void setVoucherId(String voucherId){
        this.voucherId = voucherId;
    }

    private String getItemName() {
        return itemName;
    }

    private void setItemName(String itemName) {
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

    private String getStatus(){
        return status;
    }

    private void setStatus(String status){
        this.status = status;
    }

    private String getReason(){
        return reason;
    }

    private void setReason(String reason){
        this.reason = reason;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }
}
