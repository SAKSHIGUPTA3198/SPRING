package com.lti.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.lti.model.Users;

import com.lti.service.UserService;



public class Main {
	  public static void main(String[] args) {

	
		
		
	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	  UserService service = context.getBean("service",UserService.class);
      Users user = context.getBean("user",Users.class);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("1:Add User  2:Read User 3:Modify User 4:Delete User");

			System.out.println("Enter your choice");
			
			int ch= sc.nextInt();
			String username;
			switch(ch)
			{

			case 1:
				
				System.out.println("Enter Username");
				user.setUsername(sc.next());
	
				System.out.println("Enter Password");
				user.setPassword(sc.next());
				System.out.println("Enter FirstName");
				user.setFirstname(sc.next());
				System.out.println("Enter LastName");
				user.setLastname(sc.next());
				System.out.println("Enter Mobilenumber");
				user.setMobilenumber(sc.next());
				
				service.addUser(user);
				 System.out.println(user);
				System.out.println("user added successfully");
				
			
				break;
				
			case 2:
				System.out.println("enter username");
				username= sc.next();
				System.out.println("enter password");
				String password = sc.next();
				boolean result2= service.checkLogin(username, password);
				if
				(result2){
				System.out.println("up");
			}
			else{
				System.out.println("failed");
			
			}
				   System.out.println(user);
				break;
				
			case 3:
				System.out.println("enter username to modify");
				user.setUsername(sc.next());
				System.out.println("Enter FirstName");
				user.setFirstname(sc.next());
				System.out.println("Enter LastName");
				user.setLastname(sc.next());
				System.out.println("Enter Mobilenumber");
				user.setMobilenumber(sc.next());
				
				boolean result = service.updateUser(user);
				if(result){
					System.out.println("updated");
				}
				else{
					System.out.println("failed");
				}		
				break;
				
			case 4:
				System.out.println("Enter USERNAME");
				username = sc.next();
				boolean result1=service.removeUser(username);
				if
				(result1){
				System.out.println("deleted");
			}
			else{
				System.out.println("failed");
			
			}
				break;
				
				
			
			}
	  
	  
	  
	  
	  
	}
}
