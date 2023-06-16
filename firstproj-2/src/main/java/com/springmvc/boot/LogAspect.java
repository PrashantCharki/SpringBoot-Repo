package com.springmvc.boot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	// object for Logger
	private static final Logger LOGGER=LoggerFactory.getLogger(LogAspect.class);
     @Before("execution(public * com.springmvc.boot.EmployeeController.getEmployee())")
	 public void BeforeLog()
	 {
		LOGGER.info("getEmployee method called");
	 }
     
     
    // @After("execution(public * com.springmvc.boot.EmployeeController.getEmployee())")
     @AfterReturning("execution(public * com.springmvc.boot.EmployeeController.getEmployee())")
	 public void AfterLog()
	 {
		LOGGER.info("getEmployee method executed");
	 }
     //it will execute we get exception
     @AfterThrowing("execution(public * com.springmvc.boot.EmployeeController.getEmployee())")
	 public void LogException()
	 {
		LOGGER.info("Getting exception");
	 }
}
