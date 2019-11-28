package com.lti.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lti.config.AppConfig;
import com.lti.model.Users;
import com.lti.service.UserService;
import com.lti.service.UserServiceImpl;



public class Main3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	  UserService service = context.getBean("service",UserService.class);
	 List<Users> list = service.findAllUsers();
	for(Users user :list){
		System.out.println(user);
	}
	

	}
}
