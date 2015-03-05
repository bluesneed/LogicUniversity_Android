package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by student on 4/3/15.
 */
public class Requisition {
    private String id;
    private String madeBy;
    private Date date;
    private String departmentName;
    private String status;
    private String remark;
    private String approvedBy;
    private Date processDate;
    private List<RequisitionDetail> requisitionDetails = new ArrayList<RequisitionDetail>();

    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private String getMadeBy(){
        return madeBy;
    }

    private void setMadeBy(String madeBy){
        this.madeBy = madeBy;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }

    private String getDepartmentName(){
        return departmentName;
    }

    private void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
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

    private String getApprovedBy(){
        return approvedBy;
    }

    private void setApprovedBy(String approvedBy){
        this.approvedBy = approvedBy;
    }

    private Date getProcessDate(){
        return processDate;
    }

    private void setProcessDate(Date processDate){
        this.processDate = processDate;
    }

    private List<RequisitionDetail> getRequisitionDetails(){
        return requisitionDetails;
    }

    private void setRequisitionDetails(List<RequisitionDetail> requisitionDetails){
        this.requisitionDetails = requisitionDetails;
    }
}
