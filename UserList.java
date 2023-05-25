package com.ims.model;


public class UserList {
    public  UserList() {
    }
    public static String Remail="admin";
    public static String Rpassword="admin";
    private int uid;
    private String uname;
    private String address;
    private long phone;
    private String email;
    private String password;
    public static String status;
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPolicyID() {
        return policyID;
    }

    public void setPolicyID(int policyID) {
        this.policyID = policyID;
    }

    public  int policyID;



    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        UserList.status = status;
    }



    public UserList(int uid, String uname, String address, long phone, String email, String password) {
        this.uid = uid;
        this.uname = uname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }


    public UserList(int id,int policyID, String uname, String address, long phone,String email,String status) {
        this.uid = uid;
        this.policyID = policyID;
        this.uname = uname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.status = status;

    }


}








