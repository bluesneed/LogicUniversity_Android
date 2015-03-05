package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

/**
 * Created by student on 4/3/15.
 */
public class Employee {
    private int emp_id;
    private String type;
    private String name;
    private String gender;
    private String emp_number;
    private String email;
    private String phone;
    private String password;

    public int getEmpId(){
        return emp_id;
    }

    public void setEmpId(int emp_id){
        this.emp_id = emp_id;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getEmpNumber(){
        return emp_number;
    }

    public void setEmpNumber(String emp_number){
        this.emp_number = emp_number;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
