package com.akhm.repository;

import org.springframework.stereotype.Repository;

import com.akhm.repository.enity.AdminEntity;

@Repository
public interface AdminRepository {
	public AdminEntity findByEmailIdAndPassword(String emailId,String password);
}
