package com.ims.admin.client;

import java.util.Scanner;

import com.ims.dao.impl.PolicyDetailsDAOImpl;
import com.ims.model.PolicyDetails;

public class Policy {
	static PolicyDetailsDAOImpl policyDAOp = new PolicyDetailsDAOImpl();

    public static void policyDetails() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("====================================================== ");
            System.out.println("                1)AddPolicy                            ");
            System.out.println("                2)ViewPolicy                           ");
            System.out.println("                3)UpdatePolicy                         ");
            System.out.println("                4)Delete                               ");
            System.out.println("                5)BackAdminPage                               ");
            System.out.println("=======================================================");
            System.out.print("Enter the choice=");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    policyDAOp.addPolicy();
                    break;
                case 2:
                    for (PolicyDetails policy : policyDAOp.viewPolicy()) {
                        System.out.println("Policy ID: " + policy.getPolicyid());
                        System.out.println("Category: " + policy.getCatagoryname());
                        System.out.println("SubCategory: " + policy.getSubCatagoryname());
                        System.out.println("Policy Name: " + policy.getPolicName());
                        System.out.println("Amount Assured: " + policy.getSumAssured());
                        System.out.println("Premium: " + policy.getPremium());
                        System.out.println("Description: " + policy.getDescription());
                        System.out.println("----------------------");
                    }
                    break;

                case 3:
                    System.out.print("Enter police ID to update =");
                    int sid = sc.nextInt();
                    policyDAOp.updatePolicy(sid);
                    break;
                case 4:

                    System.out.print("Enter police Id to delete =");
                    int did = sc.nextInt();
                    policyDAOp.deletePolicy(did);
                    break;
                case 5:
                    Admin.adminPage();
                    break;
                default:
                    System.out.println("Choose 1 to 5 Between");

            }
        }
    }
}









