package com.akhm.util;

import lombok.Data;

@Data
public class EmailDetails {
	private String recipient;
	private String messegeBody;
	private String subject;
	private String attachment;


}
