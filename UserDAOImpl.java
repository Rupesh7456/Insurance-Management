package com.ims.dao.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.UserDAO;
import com.ims.model.UserList;

public class UserDAOImpl implements UserDAO {
	

	Scanner sc=new Scanner (System.in);
	static List<UserList>activeUserList;

	static List<UserList>cancelUser;

	static List<UserList> PolicyRequestList;
	
	static List<UserList>addUser=new LinkedList<>();
	
	static List<UserList> policyActivate=new LinkedList<>();
	
	static List<UserList>PolicyRequest=new LinkedList<>();
	
	static List<UserList>PolicyCancel=new LinkedList<>();

	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		int r=1;
		while(r==1) {
			System.out.print("Enter User ID"); 
			int uid=sc.nextInt();
			System.out.print("Enter User Name");
			String uname=sc.next();
			System.out.print("Enter User Address");
			String add=sc.next();
			System.out.print("Enter User Phone");
			Long phone=sc.nextLong();
			System.out.print("Enter User Email ");
			String uemail=sc.next();
			System.out.print("Enter User Password");
			String upass=sc.next();
			UserList user=new UserList(uid,uname,add,phone,uemail,upass);
			addUser.add(user);
			System.out.println("add Customer Successfully");
			System.out.println("Do you want to register more Customer 1 for Yes/2 for No");
			r=sc.nextInt();
			
		}
		
		
		
		
	}

	@Override
	public List<UserList> viewAllUserInfo() {
		// TODO Auto-generated method stub
		return addUser;
	}
	@Override
    public boolean AuthenticationEmailandPassword(String email, String password) {
        int r= 0;
        for (UserList pro : addUser) {

            if ((pro.getEmail().equals(email)) && (pro.getPassword().equals(password))) {
                r++;
                return true;
            } else if
            ((pro.getEmail().equals(email)) || (pro.getPassword().equals(password)))
                System.out.println("You Enter wrong User name  or password");
            r++;
            return false;

        }
        if (r == 0)
            System.out.println("User not found");

        return false;
    }


    @Override
    public String getPassword(String email) {
        int r = 0;
        for (UserList pro : addUser) {
            if ((pro.getEmail().equals(email))) {
                String getpsw = pro.getPassword();
                r++;
                return getpsw;
            }

        }
        if (r == 0)
            System.out.println("User not Exit");

        return null;

    }


    @Override
    public List<UserList> PolicyRequest(String email, int policyID) {

        for (UserList pro : addUser) {
            if (pro.getEmail().equals(email)) {
                int id = pro.getUid();
                String name = pro.getUname();
                String address = pro.getAddress();
                long phone = pro.getPhone();
                String mail = pro.getEmail();
                String ss = "Requested";
                UserList RequestUser = new UserList(id, policyID, name, address, phone, mail, ss);
                PolicyRequestList.add(RequestUser);

            }
        }
        return PolicyRequestList;
    }


    public void PolicyRequestList() {

        for (UserList tt : PolicyRequest) {
            System.out.println("User ID: " + tt.getUid());
            System.out.println("Policy ID: " + tt.getPolicyID());
            System.out.println("User Name: " + tt.getUname());
            System.out.println("User Address: " + tt.getAddress());
            System.out.println("User Phone: " + tt.getPhone());
            System.out.println("User Email: " + tt.getEmail());
            System.out.println("Status: " + tt.getStatus());
            System.out.println("----------------------");
        }
    }

    @Override
    public List<UserList> policyActivate(String email, int policyID) {
        int r = 0;
        for (UserList pro : PolicyRequestList) {
            if (pro.getEmail().equals(email) && (pro.getPolicyID() == policyID)) {
                int id = pro.getUid();
                String name = pro.getUname();
                String address = pro.getAddress();
                long phone = pro.getPhone();
                String mail = pro.getEmail();
                UserList ActiveUser = new UserList(id, policyID, name, address, phone, mail, "Active");
                activeUserList.add(ActiveUser);
                r++;  //this block code create active user list
                return activeUserList;
            }}


               if (r == 0)
               System.out.println("User not Exit");
               return null;
               }

    public void policyActiveUserList() {

        for (UserList pupesh : activeUserList) {
            System.out.println("User ID: " + pupesh.getUid());
            System.out.println("Policy ID: " + pupesh.getPolicyID());
            System.out.println("User Name: " + pupesh.getUname());
            System.out.println("User Address: " + pupesh.getAddress());
            System.out.println("User Phone: " + pupesh.getPhone());
            System.out.println("User Email: " + pupesh.getEmail());
            System.out.println("Status: " + pupesh.getStatus());
            System.out.println("----------------------");
        }
    }

    public void policyHold(int userID) {
        int r= 0;
        for (UserList au : activeUserList) {
            if (au.getUid() == userID) {
                System.out.println("User ID: " + au.getUid());
                System.out.println("Policy ID: " + au.getPolicyID());
                System.out.println("User Name: " + au.getUname());
                System.out.println("User Address: " + au.getAddress());
                System.out.println("User Phone: " + au.getPhone());
                System.out.println("User Email: " + au.getEmail());
                System.out.println("Status: " + au.getStatus());
                System.out.println("----------------------");
                r++;
            }
        }
        if (r == 0)
            System.out.println("not Exit");
    }


    public boolean AuthonticationAdmin(String email, String password) {

        if (UserList.Remail.equals(email) && (UserList.Rpassword.equals(password))) {
            return true;

            } else if (UserList.Remail.equals(email) || (UserList.Rpassword.equals(password))) {
            System.out.println("You Enter wrong Admin email or password");
            return false;
            } else
            System.out.println("You Enter invalid  admin email and password");
        return false;
            }

    @Override
    public List<UserList> PolicyCancel(String email, int policyID) {
        int r = 0;
        for (UserList pro : activeUserList) {
            if (pro.getEmail().equals(email) && (pro.getPolicyID() == policyID)) {

                int id = pro.getUid();
                String name = pro.getUname();
                String address = pro.getAddress();
                long phone = pro.getPhone();
                String mail = pro.getEmail();
                String ca = "Cancel";
                UserList cUser = new UserList(id, policyID, name, address, phone, mail, ca);
                cancelUser.add(cUser);
                activeUserList.remove(pro);
                r++;
                return cancelUser;
               }}


                if (r == 0)
               System.out.println("User not Exit");
               return null;
    }

    public void policyCancelUserList() {

        for (UserList au : cancelUser) {
            System.out.println("User ID: " + au.getUid());
            System.out.println("Policy ID: " + au.getPolicyID());
            System.out.println("User Name: " + au.getUname());
            System.out.println("User Address: " + au.getAddress());
            System.out.println("User Phone: " + au.getPhone());
            System.out.println("User Email: " + au.getEmail());
            System.out.println("Status: " + au.getStatus());
            System.out.println("----------------------");

        }
    }
}
	