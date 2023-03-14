package com.akhm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdminServiceAspect {
	@Before(value = "execution(* com.akhm.service.impl.AdminServiceImpl.*(..)")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("before method"+joinPoint.getSignature());
		
	}
	@After(value = "execution(*com.akhm.service.impl.AdminServiceImpl.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("after method"+joinPoint.getSignature());
	}

}
