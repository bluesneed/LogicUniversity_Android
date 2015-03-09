package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 4/3/15.
 */
public class Department implements Serializable {
    private String id;
    private String code;
    private String name;
    private String contactNumber;
    private String fax;
    private String representative;
    private String collectionPoint;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContactNumber(){
        return contactNumber;
    }

    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public String getFax(){
        return fax;
    }

    public void setFax(String fax){
        this.fax = fax;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getCollectionPoint() {
        return collectionPoint;
    }

    public void setCollectionPoint(String collectionPoint) {
        this.collectionPoint = collectionPoint;
    }


}
