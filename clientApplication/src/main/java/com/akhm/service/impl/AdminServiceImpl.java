package com.akhm.service.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.akhm.exception.MyClientCustomException;
import com.akhm.service.AdminService;
import com.akhm.service.dto.AdminDTO;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class AdminServiceImpl implements AdminService{
	@Autowired
	private RestTemplate restTemplate;
	public AdminDTO getAdmin(String emailId, String password) {
		log.info("{}-AdminServiceImpl getAdmin() started");
		try {
			log.info("{}-AdminServiceImpl getAdmin() saving Admindeatiles is restTemplate");
			Map<String, String> admin=new LinkedHashMap<String, String>();
			admin.put("emailId",emailId );
			admin.put("password", password);
			return restTemplate.postForObject("http://localhost:8088/admin/v0/login",admin ,AdminDTO.class);
		} catch (Exception e) {
			log.error("{}-AdminServiceImpl is getAdmin()exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
		
	}

}
