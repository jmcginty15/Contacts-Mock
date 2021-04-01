package com.example.contactsmock;

import java.io.Serializable;

public class FormData implements Serializable {
    private String nameText;
    private String phoneText;
    private String areaText;
    private String addressText;
    private String cityText;
    private String stateText;
    private String zipText;
    private String emailText;
    private String birthdayText;

    public FormData() {

    }

    public FormData(String name, String phone, String area, String address, String city, String state, String zip, String email, String birthday) {
        this.nameText = name;
        this.phoneText = phone;
        this.areaText = area;
        this.addressText = address;
        this.cityText = city;
        this.stateText = state;
        this.zipText = zip;
        this.emailText = email;
        this.birthdayText = birthday;
    }

    public String getNameText() {
        return nameText;
    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
    }

    public String getPhoneText() {
        return phoneText;
    }

    public void setPhoneText(String phoneText) {
        this.phoneText = phoneText;
    }

    public String getAreaText() {
        return areaText;
    }

    public void setAreaText(String areaText) {
        this.areaText = areaText;
    }

    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }

    public String getCityText() {
        return cityText;
    }

    public void setCityText(String cityText) {
        this.cityText = cityText;
    }

    public String getStateText() {
        return stateText;
    }

    public void setStateText(String stateText) {
        this.stateText = stateText;
    }

    public String getZipText() {
        return zipText;
    }

    public void setZipText(String zipText) {
        this.zipText = zipText;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getBirthdayText() {
        return birthdayText;
    }

    public void setBirthdayText(String birthdayText) {
        this.birthdayText = birthdayText;
    }
}