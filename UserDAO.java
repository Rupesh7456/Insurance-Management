package com.ims.dao;


import java.util.List;

import com.ims.model.UserList;


public interface UserDAO {
    public void addCustomer();

    public List<UserList> viewAllUserInfo();

    public boolean AuthenticationEmailandPassword(String email, String password);

    String getPassword(String Username);

    public List<UserList> policyActivate(String email, int policyID);

    public List<UserList> PolicyRequest(String email, int policyID);

    public List<UserList> PolicyCancel(String email, int policyID);

    public boolean AuthonticationAdmin(String email, String password);

}