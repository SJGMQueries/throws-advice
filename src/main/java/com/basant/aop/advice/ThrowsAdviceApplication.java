package com.basant.aop.advice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ThrowsAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThrowsAdviceApplication.class, args);
	}
}
