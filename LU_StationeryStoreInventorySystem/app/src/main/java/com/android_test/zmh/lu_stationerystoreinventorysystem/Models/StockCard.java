package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.util.Date;

/**
 * Created by student on 4/3/15.
 */
public class StockCard {
    private String id;
    private String itemName;
    private String supplierName;
    private Date date;
    private int qty;
    private int balance;

    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private String getItemName() {
        return itemName;
    }

    private void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private String getSupplierName() {
        return supplierName;
    }

    private void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }

    private int getQty() {
        return qty;
    }

    private void setQty(int qty) {
        this.qty = qty;
    }

    private int getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }
}
