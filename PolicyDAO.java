package com.ims.dao;

import java.util.List;

import com.ims.model.PolicyDetails;


	public interface PolicyDAO {
	    void addPolicy();

	    List<PolicyDetails> viewPolicy();

	    PolicyDetails viewPolicy(int pid);

	    void updatePolicy(int pid);

	    void deletePolicy(int pid);

	    void addCategory();

	    List<PolicyDetails> viewCategory();

	    void updateCategory(int pid);

	    void deleteCategory(int pid);

	    void addSubCategory();

	    List<PolicyDetails> viewSubCategory();

	    void updateSubCategory(int pid);

	    void deleteSubCategory(int pid);
	}

	
