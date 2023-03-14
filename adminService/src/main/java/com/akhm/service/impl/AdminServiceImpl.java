package com.akhm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.exception.MyCustomException;
import com.akhm.repository.AdminRepository;
import com.akhm.repository.enity.AdminEntity;
import com.akhm.service.AdminService;

import lombok.extern.slf4j.Slf4j;

/** 
 * <h2>AdminEntity
 * This Entity Class Map To AdminEntity
 * @author Teshadri
 * @version 1.0
 * @since 2022-02-12
 * */

@Service
@Slf4j
public class AdminServiceImpl implements AdminService{
	@Autowired(required = false)
	private AdminRepository adminRepository;
	/**
	 * This method is used for the AdminEntity
	 * @param AdminEntity this is the parameter to is AdminExist 
	 * @return Integer returns AdminId */
	@Override
	public AdminEntity getAdmin(String emailId, String password) {
		log.info("{}-AdminServiceImpl getAdmin() started");
		
		try {
			log.info("{}-AdminServiceImpl getAdmin() save");
			
			
			return adminRepository.findByEmailIdAndPassword(emailId, password);
		} catch (Exception e) {
			log.error("{}-AdminServiceImpl is getAdmin()exception occured-{}",e.getMessage());
			throw new MyCustomException(e.getMessage());
		}

	}
	

}
