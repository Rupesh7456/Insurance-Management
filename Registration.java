package com.ims.Customer.client;

import java.util.Scanner;

import com.ims.admin.client.HomePage;
import com.ims.dao.impl.UserDAOImpl;

public class Registration {


    static UserDAOImpl userDAO = new UserDAOImpl();

    public static void CustomerClientmenu() {


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======================================================  ");
            System.out.println("                1)Register                              ");
            System.out.println("                2)VerificationEmailAndPassword       ");
            System.out.println("                3)forgotPassword                                  ");
            System.out.println("                4)BackHomePage                                  ");
            System.out.println("========================================================");
            System.out.print("Enter the choice=");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    userDAO.addCustomer();
                    break;
                case 2:
                    System.out.print("Enter email=");
                    String email = sc.next();
                    System.out.print("Enter User password=");
                    String psw = sc.next();
                    if(userDAO.AuthenticationEmailandPassword(email, psw)!=false);
                    System.out.println(" User verified");
                    break;
                case 3:

                    System.out.print("Enter  email for password recovery=");
                    String un = sc.next();
                    if (userDAO.getPassword(un) != null)
                        System.out.println("Your Password=" + userDAO.getPassword(un));
                    break;

                case 4:
                    HomePage.main(null);
                    break;

                default:
                    System.out.println("Enter 1 to 4 ");

            }
        }
    }
}





