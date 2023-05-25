package com.ims.admin.client;

import java.util.Scanner;

import com.ims.dao.impl.SubCategoryDAOImpl;
import com.ims.model.PolicyDetails;

public class SubCategory {
    static SubCategoryDAOImpl subCategoryDAO = new SubCategoryDAOImpl();

    public static void subCategoryDetails() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======================================================  ");
            System.out.println("                1)AddSubCategory                        ");
            System.out.println("                2)ViewSubCategory                       ");
            System.out.println("                3)UpdateSubCategory                     ");
            System.out.println("                4)Delete                                ");
            System.out.println("                5)BackAdminPage                                 ");
            System.out.println("========================================================");
            System.out.print("Enter the choice=");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    subCategoryDAO.addSubCategory();

                    break;
                case 2:

                    for (PolicyDetails scategory : subCategoryDAO.viewSubCategory()) {
                        System.out.println("SubCategory ID: " + scategory.getSubcategoryid());
                        System.out.println("SubCategory Name: " + scategory.getSubCatagoryname());
                        System.out.println("Description: " + scategory.getDescription());
                        System.out.println("----------------------");
                    }
                    break;


                case 3:
                    System.out.print("Enter Sub Category Id to update =");
                    int pid = sc.nextInt();
                    subCategoryDAO.updateSubCategory(pid);
                    break;
                case 4:
                    System.out.print("Enter SubCategory Id to delete =");
                    int did = sc.nextInt();
                    subCategoryDAO.deleteSubCategory(did);
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







