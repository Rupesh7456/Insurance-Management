package com.ims.dao.impl;

import java.util.List;

import com.ims.model.PolicyDetails;

public class SubCategoryDAOImpl extends PolicyDetailsDAOImpl {
	 public void addSubCategory() {
	        int r= 1;
	        while (r == 1) {
	            System.out.println("Enter SubCategory ID ");
	            int sid = sc.nextInt();
	            System.out.println(addCategory);
	            System.out.println("Choose Category from above list ");
	            String cname = sc.next();
	            System.out.println("Enter SubCategory ");
	            String csname = sc.next();
	            System.out.println("Enter description ");
	            String ds = sc.next();
	            PolicyDetails sub = new PolicyDetails(sid, cname, csname, ds);
	            addSubCategory.add(sub);
	            System.out.println("SubCategory add successfully");
	            System.out.println("Do you want add more Category 1 for Yes / 2 for No");
	            r = sc.nextInt();
	        }



	    }

	    @Override
	    public List<PolicyDetails> viewSubCategory() {
	        return addSubCategory;
	    }

	    @Override
	    public void updateSubCategory(int sid) {
	        int r = 0;
	        for (PolicyDetails pro : addSubCategory) {
	            if (pro.getSubcategoryid() == sid) {
	                System.out.println("Do you want modify 1)Name 2)Description ");
	                int choice = sc.nextInt();
	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter SubCategory name=");
	                        String pname = sc.next();
	                        pro.setSubCatagoryname(pname);
	                        System.out.println("SubCategory is Update");
	                        break;
	                    case 2:
	                        System.out.print("Enter Description=");
	                        String add = sc.next();
	                        pro.setDescription(add);
	                        System.out.println("Description Update");
	                        break;
	                    default:
	                        System.out.println(" please Choose 1 to 2");
	                }
	                ++r;
	            }
	        }
	        if (r == 0) {
	            System.out.println(" Given record not exit");
	        }
	    }

	    @Override
	    public void deleteSubCategory(int sbid) {
	        int r = 0;
	        for (PolicyDetails pro : addSubCategory) {
	            if (pro.getCatagoryid() == sbid)
	                addSubCategory.remove(pro);
	            System.out.println("SubCategory Deleted successfully");

	            r++;
	            break;
	        }
	        if (r== 0)
	            System.out.println(" Given ID is not exit");

	    }
	}

