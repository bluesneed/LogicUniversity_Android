package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;




/**
 * Created by student on 4/3/15.
 */
public class Item {
    private String id;
    private String category;
    private String description;
    private int reorderLevel;
    private int reorderQty;
    private int virtualBalance;
    private String status;
    private String uom;

    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private String getCategory(){
        return category;
    }

    private void setCategory(String category){
        this.category = category;
    }

    private String getDescription(){
        return description;
    }

    private void setDescription(String description){
        this.description = description;
    }

    private int getReorderLevel(){
        return reorderLevel;
    }

    private void setReorderLevel(int reorderLevel){
        this.reorderLevel = reorderLevel;
    }

    private int getReorderQty(){
        return reorderQty;
    }

    private void setReorderQty(int reorderQty){
        this.reorderQty = reorderQty;
    }

    private int getVirtualBalance(){
        return virtualBalance;
    }

    private void setVirtualBalance(int remark){
        this.virtualBalance = virtualBalance;
    }

    private String getStatus(){
        return status;
    }

    private void setStatus(String status){
        this.status = status;
    }

    private String getUOM(){
        return uom;
    }

    private void setUOM(String uom){
        this.uom = uom;
    }

}
