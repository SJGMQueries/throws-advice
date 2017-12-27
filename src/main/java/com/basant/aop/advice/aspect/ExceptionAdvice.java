package com.basant.aop.advice.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionAdvice {

	@AfterThrowing(pointcut = "execution(* com.basant.aop.advice.Controller.*(..))", throwing = "ex")
	public void mapException(IllegalAccessException ex) {
		/*String method = jp.getSignature().getName();*/
		System.out.println("Exception raised with cause " + ex.getMessage());
	}
}
