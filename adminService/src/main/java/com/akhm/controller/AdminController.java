package com.akhm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhm.repository.enity.AdminEntity;
import com.akhm.service.AdminService;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j

public class AdminController {
	@Autowired
	private AdminService adminService;
	@PostMapping("/login")
	public ResponseEntity<AdminEntity> logIn(@RequestBody Map<String, String> admin){
		log.info("{}-AdminController logIn() method started");
		try {
			log.info("{}-AdminController logIn()method Deatiles Successfully executed");
			String emailId=admin.get("emailId");
			String password=admin.get("password");
			AdminEntity adminEntity=adminService.getAdmin(emailId, password);
			if(adminEntity!=null) {
				return new ResponseEntity<AdminEntity>(adminEntity,HttpStatus.OK);
			}else {
				return new ResponseEntity<AdminEntity>(HttpStatus.UNAUTHORIZED);
			}
		} catch (Exception e) {
			log.error("{}-AdminController logIn() method Error message is:"+e.getMessage());
			return new ResponseEntity<AdminEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
}
