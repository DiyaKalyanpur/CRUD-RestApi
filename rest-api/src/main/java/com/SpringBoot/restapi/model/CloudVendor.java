package com.SpringBoot.restapi.model;

public class CloudVendor {

    private String vendorId;
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }


    private String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String phoneNo;
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public CloudVendor(String vendorId,String name,String email,String phoneNo) {
        this.email = email;
        this.vendorId = vendorId;
        this.name = name;
        this.phoneNo = phoneNo;
    }




        public CloudVendor() {
        }







    }

