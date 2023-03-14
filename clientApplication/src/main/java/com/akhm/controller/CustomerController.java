package com.akhm.controller;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.akhm.service.CustomerService;
import com.akhm.service.dto.CustomerDTO;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/customer/v1")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping(name="/customerlogin2",method=RequestMethod.GET)	
	public String showCustomerLogin() {
		return "customerLogin";
	}
	@PostMapping("/login")
	public String submitCustomerLogin(HttpServletRequest request,@RequestBody CustomerDTO customerDTO)
	{
		customerDTO=customerService.getCustomer(customerDTO);
		if(customerDTO!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("AUTH_CUSTOMER", customerDTO);
			return "redirect:customerHome";
			
		}
		return "customerLogin";
	}
	@GetMapping("/registration")
	public String submitCustomerRegistration(HttpServletRequest request,@RequestBody CustomerDTO customerDTO)
	{
		Integer userId=customerService.insertCustomer(customerDTO);
		if(userId!=null) {
		HttpSession session=request.getSession();
		session.setAttribute("AUTH_CUSTOMER", customerDTO);
		return "redirect:customerHome";
		
	}
	return "customerRegistration";
	
}
	

}
