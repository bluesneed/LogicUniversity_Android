package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.util.Date;

/**
 * Created by student on 5/3/15.
 */
public class DeliveryOrderDetail {
    private String id;
    private Date date;
    private String status;
    private String remark;

    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }

    private String getStatus(){
        return status;
    }

    private void setStatus(String status){
        this.status = status;
    }

    private String getRemark(){
        return remark;
    }

    private void setRemark(String remark){
        this.remark = remark;
    }
}
