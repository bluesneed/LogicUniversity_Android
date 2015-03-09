package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 4/3/15.
 */
public class Disbursement implements Serializable{
    private String id;
    private Date date;
    private String itemName;
    private String departmentName;
    private int qty;
    private int actualQty;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getActualQty() {
        return actualQty;
    }

    public void setActualQty(int actualQty) {
        this.actualQty = actualQty;
    }
}
