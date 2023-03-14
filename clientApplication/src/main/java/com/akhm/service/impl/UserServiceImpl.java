package com.akhm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.clients.UserClient;
import com.akhm.exception.MyClientCustomException;
import com.akhm.service.UserService;
import com.akhm.service.dto.UserDTO;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class UserServiceImpl implements UserService{
	@Autowired
	private UserClient userClient;
	@Override
	public Integer insertUser(UserDTO userDTO) {
		log.info("{}-UserServiceImpl insertUser() started");
		try {
			log.info("{}-UserServiceImpl insertUser() getting Category details is UserClient");
			return userClient.saveUser(userDTO);
		} catch (Exception e) {
			log.error("{}-UserServiceImpl  insertUser()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
		
	}

	@Override
	public UserDTO getUser(UserDTO userDTO) {
		log.info("{}-UserServiceImpl getUser() started");
		try {
			log.info("{}-UserServiceImpl getUser() getting Category details is UserClient");
			return userClient.getUser(userDTO);
		} catch (Exception e) {
			log.error("{}-UserServiceImpl  getUser()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}

	}

	@Override
	public Boolean isUserExist(String emailId) {
		log.info("{}-UserServiceImpl isUserExist() started");
		try {
			log.info("{}-UserServiceImpl isUserExist() getting Category details is UserClient");
			return userClient.isUserExist(emailId);
		} catch (Exception e) {
			log.error("{}-UserServiceImpl  isUserExist()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
		
	}

}
