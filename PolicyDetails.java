package com.ims.model;

public class PolicyDetails {
    private int categoryid;
    private int Subcategoryid;
    private String categoryname;
    private String subCategoryname;
    private String description;
    private String policyName;
    private int sumAssured;
    private int premium;
    public int getPolicyid() {
        return policyid;
    }

    public void setPolicyid(int policyid) {
        this.policyid = policyid;
    }

    private int policyid;
    public int getSubcategoryid() {
        return Subcategoryid;
    }

    public void setSubcatagoryid(int subcatagoryid) {
        Subcategoryid = subcatagoryid;
    }



    public int getCatagoryid() {
        return categoryid;
    }

    public void setCatagoryid(int catagoryid) {
        this.categoryid = catagoryid;
    }

    public String getCatagoryname() {
        return categoryname;
    }

    public void setCatagoryname(String catagoryname) {
        this.categoryname = catagoryname;
    }

    public String getSubCatagoryname() {
        return subCategoryname;
    }

    public void setSubCatagoryname(String subCatagoryname) {
        this.subCategoryname = subCatagoryname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPolicName() {
        return policyName;
    }

    public void setPolicName(String policName) {
        this.policyName = policName;
    }

    public int getSumAssured() {
        return sumAssured;
    }

    public void setSumAssured(int sumAssured) {
        this.sumAssured = sumAssured;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public PolicyDetails(int policyid, String categoryname, String subCategoryname,
                    String policName, int sumAssured, int premium,String description) {
        this.policyid = policyid;
        this.categoryname = categoryname;
        this.subCategoryname = subCategoryname;
        this.policyName = policName;
        this.sumAssured = sumAssured;
        this.premium = premium;
        this.description = description;
    }

    public PolicyDetails(int categoryid, String categoryname,String description) {
        this.categoryid = categoryid;
        this.categoryname = categoryname;
        this.description = description;
    }

    public PolicyDetails(int subcategoryid, String categoryname, String subCategoryname, String description) {

        this.Subcategoryid = subcategoryid;
        this.categoryname = categoryname;
        this.subCategoryname = subCategoryname;
        this.description = description;
    }
    @Override
    public String toString() {
        if (this.policyid != 0) {
            return "PolicyDetails{" +
                    "policyid=" + policyid +
                    ", categoryname='" + categoryname + '\'' +
                    ", subCategoryname='" + subCategoryname + '\'' +
                    ", policyName='" + policyName + '\'' +
                    ", sumAssured=" + sumAssured +
                    ", premium=" + premium +
                    ", description='" + description + '\'' +
                    '}';
        } else if (this.Subcategoryid != 0) {
            return "SubCategoryDetails{" +
                    "Subcategoryid=" + Subcategoryid +
                    ", categoryname='" + categoryname + '\'' +
                    ", subCategoryname='" + subCategoryname + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        } else if (this.categoryid != 0) {
            return "CategoryDetails{" +
                    "categoryid=" + categoryid +
                    ", categoryname='" + categoryname + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        } else {
            return "Policy details is invalid ";
       }
    }

}




