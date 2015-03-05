package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;



import java.util.Date;
import java.util.List;

/**
 * Created by student on 4/3/15.
 */
public class PurchaseOrder {
    private String id;
    private String number;
    private Date date;
    private String supplierName;
    private String orderBy;
    private String approvedBy;
    private String status;
    private List<PurchaseOrderDetail> purchaseOrderDetail;

    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private String getNumber(){
        return number;
    }

    private void setNumber(String number){
        this.number = number;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }

    private String getSupplierName(){
        return supplierName;
    }

    private void setSupplierName(String supplierName){
        this.supplierName = supplierName;
    }

    private String getOrderBy(){
        return orderBy;
    }

    private void setOrderBy(String orderBy){
        this.orderBy = orderBy;
    }

    private String getApprovedBy(){
        return approvedBy;
    }

    private void setApprovedBy(String approvedBy){
        this.approvedBy = approvedBy;
    }

    private String getStatus(){
        return status;
    }

    private void setStatus(String status){
        this.status = status;
    }

    private List<PurchaseOrderDetail> getDeliveryOrderDetail(){
        return purchaseOrderDetail;
    }

    private void setDeliveryOrderDetail(List<PurchaseOrderDetail> purchaseOrderDetail){
        this.purchaseOrderDetail = purchaseOrderDetail;
    }
}
