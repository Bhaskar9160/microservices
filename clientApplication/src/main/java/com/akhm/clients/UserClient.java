package com.akhm.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.akhm.service.dto.UserDTO;

@FeignClient(value = "userClient")
public interface UserClient {
	@PostMapping(value="/registration")
	public Integer saveUser(UserDTO userDTO);
	@GetMapping(value="/isuserexist")
	public Boolean isUserExist(String emailId);
	@PostMapping(value="/login")
	public UserDTO getUser(UserDTO userDTO);
}
