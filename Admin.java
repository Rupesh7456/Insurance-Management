package com.ims.admin.client;


import java.util.Scanner;

import com.ims.dao.impl.UserDAOImpl;
import com.ims.model.UserList;

public class Admin {
	static UserDAOImpl userDAO = new UserDAOImpl();

    public static void adminPage() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======================================================  ");
            System.out.println("                1)UserList                              ");
            System.out.println("                2)Category                              ");
            System.out.println("                3)SubCategory                           ");
            System.out.println("                4)Policy                                ");
            System.out.println("                5)Buyer's Policy Request                        ");
            System.out.println("                6)BackHomePage                                 ");
            System.out.println("========================================================");
            System.out.print("Enter the choice=");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:

                    for (UserList user :userDAO.viewAllUserInfo()) {
                        System.out.println("User ID: " + user.getUid());
                        System.out.println("User Name: " + user.getUname());
                        System.out.println("User Address: " + user.getAddress());
                        System.out.println("User Phone: " + user.getPhone());
                        System.out.println("User Email: " + user.getEmail());
                        System.out.println("User Password: " + user.getPassword());
                        System.out.println("----------------------");
                    }
                    break;

                case 2:

                    Category.categoryDetails();

                    break;

                case 3:
                    SubCategory.subCategoryDetails();

                    break;

                case 4:
                    Policy.policyDetails();

                    break;
                case 5:
                    BuyerPolicyRequest.CustomerStatus();
                    break;

                case 6:
                    HomePage.main(null);
                    break;
                default:
                    System.out.println("Choose 1 to 6 Between");

            }
        }
    }

}



