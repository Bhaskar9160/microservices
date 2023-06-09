package com.akhm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.akhm.controller.command.UserCommand;
import com.akhm.service.UserService;
import com.akhm.service.dto.UserDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/v1")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(name="/userlogin1",method=RequestMethod.GET)
	public String showUserlogin() {
		return "userLogin";
	}
	@PostMapping("/login")
	public String submitUserLogin(HttpServletRequest request,@RequestBody UserDTO userDTO) {
		userDTO=userService.getUser(userDTO);
		if(userDTO!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("AUTH_USER", userDTO);
			return "redirect:userHome";
		}
		else {
			request.setAttribute("errorMessage", "invalid userId and password");
		}
		
		return "userLogin";
	}
	@GetMapping("/registration")
	public String
	submitUserRegistration(HttpServletRequest request,@RequestBody UserDTO userDTO)
	{
		Integer userId=userService.insertUser(userDTO);
		if(userId!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("AUTH_USER", userDTO);
			return "redirect:userHome";
			
		}
		return "userRegistration";
	}
}
