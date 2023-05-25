package com.ims.admin.client;

import java.util.Scanner;

import com.ims.dao.impl.UserDAOImpl;

public class BuyerPolicyRequest {
	 static UserDAOImpl userDAO = new UserDAOImpl();

	    public static void CustomerStatus() {
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("======================================================  ");
	            System.out.println("                1)View                                  ");
	            System.out.println("                2)Activate                               ");
	            System.out.println("                3)Cancel                                 ");
	            System.out.println("                4)BackAdminPage                                 ");
	            System.out.println("======================================================== ");
	            System.out.print("Enter the choice=");
	            int choice = sc.nextInt();
	            switch (choice) {

	                case 1:
	                    //userDAO.policyActiveUserList();
	                    userDAO.PolicyRequestList();
	                    //userDAO.policyCancelUserList();



	                    break;
	                case 2:
	                    System.out.print("Enter User email ");
	                    String email = sc.next();
	                    System.out.print("Enter policy Id= ");
	                    int id = sc.nextInt();
	                    userDAO.policyActivate(email, id);
	                    System.out.println("User Activate Successfully");
	                    break;

	                case 3:
	                    System.out.println("Enter User email ");
	                    String cmail = sc.next();
	                    System.out.println("Enter policy Id= ");
	                    int cid = sc.nextInt();
	                    userDAO.PolicyCancel(cmail, cid);
	                    System.out.println("User Cancel successfully");
	                    break;

	                case 4:
	                    Admin.adminPage();
	                    break;
	                default:
	                    System.out.println("Choose 1 to 5 Between");

	            }
	        }
	    }

	}








}
