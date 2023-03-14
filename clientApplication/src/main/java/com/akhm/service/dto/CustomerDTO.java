package com.akhm.service.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	private Integer customerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String password;


}
