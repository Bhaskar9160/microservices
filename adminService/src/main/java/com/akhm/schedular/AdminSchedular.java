package com.akhm.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AdminSchedular {
	@Scheduled(fixedRate=1000)
	public void doMessage() {
		System.out.println("Happy Sivaratri");
		
	}
	public void doSendMessage() {
		System.out.println("Teshu");
	}

}
