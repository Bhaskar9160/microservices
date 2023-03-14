package com.akhm.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.akhm.clients.CustomerClient;
import com.akhm.exception.MyClientCustomException;
import com.akhm.service.CustomerService;
import com.akhm.service.dto.CustomerDTO;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerClient customerClient;
	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Integer insertCustomer(CustomerDTO customerDTO) {
		log.info("{}-CustomerServiceImpl insertCustomer() started");
		try {
			log.info("{}-CustomerServiceImpl insertCustomer() saving");
			return customerClient.saveCustomer(customerDTO);
		} catch (Exception e) {
			log.error("{}-CustomerServiceImpl insertCustomer()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}

	}

	@Override
	public CustomerDTO getCustomer(CustomerDTO customerDTO) {
		log.info("{}-CustomerServiceImpl getCustomer() started");
		try {
			log.info("{}-CustomerServiceImpl getCustomer() save");
			return restTemplate.postForObject("http://localhost:8080/customer/v1/login", customerDTO, CustomerDTO.class);
		} catch (Exception e) {
			log.error("{}-CustomerServiceImpl getCustomer()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
		
	}

	@Override
	public Boolean isUserExist(String emailId) {
		log.info("{}-CustomerServiceImpl isUserExist() started");
		try {
			log.info("{}-CustomerServiceImpl isUserExist() save");
			return customerClient.isUserExist(emailId);
		} catch (Exception e) {
			log.error("{}-CustomerServiceImpl isUserExist()-exception occured-{}",e.getMessage());
			throw new MyClientCustomException(e.getMessage());
		}
	}

}
