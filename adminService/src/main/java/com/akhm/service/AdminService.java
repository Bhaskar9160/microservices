package com.akhm.service;

import com.akhm.repository.enity.AdminEntity;

public interface AdminService {
	public AdminEntity getAdmin(String emailId,String password);
	

}
