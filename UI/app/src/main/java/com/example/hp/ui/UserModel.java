package com.example.hp.ui;

import com.google.gson.annotations.SerializedName;

import java.util.Date;


public class UserModel {

    @SerializedName("name")
    String name;
    @SerializedName("email")
    String email;
    @SerializedName("password")
    String password;
    @SerializedName("division")
    String division;
    @SerializedName("rollno")
    int rollno;

    @SerializedName("date")
    Date date;
    @SerializedName("reason")
    String reason;

    @SerializedName("month")
    String month;

    @SerializedName("classrooms")
    float classrooms;

    @SerializedName("labs")
    float labs;

    @SerializedName("corridors")
    float corridors;

    @SerializedName("washrooms")
    float washrooms;

    @SerializedName("library")
    float library;

    @SerializedName("canteen")
    float canteen;


    public void setRollno(int rollno){
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setMonth(String month) {
        this.month = month;
    }




    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getDivision(){
        return this.division;
    }

    public int getRollno(){
        return this.rollno;
    }

    public Date getDate(){ return this.date; }

    public String getReason() { return  this.reason; }

    public String getMonth() { return this.month;    }


    public float getClassrooms() { return classrooms; }

    public float getLabs() { return labs;    }

    public float getCorridors() {  return corridors;  }

    public float getWashrooms() {        return washrooms;    }

    public float getLibrary() {  return library;    }

    public float getCanteen() {  return canteen;   }


}
