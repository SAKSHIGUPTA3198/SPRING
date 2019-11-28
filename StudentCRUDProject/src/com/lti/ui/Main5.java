package com.lti.ui;

import java.util.List;
import java.util.Scanner;

import com.lti.model.Student;
import com.lti.service.StdentServiceImpl;
import com.lti.service.StudentService;

public class Main5 {
 private static StudentService service = null;
 static{
	 
	 service = new StdentServiceImpl();
	 
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enters the character");
		String name = sc.next();
		
	List<Student> list = service.findStudentByName(name);
	
	if(list != null && list.size()>0){
		
	
	 for(Student s:list){
	    	System.out.println(s);
	}
	}
	else{
		System.out.println("there is no student found");

	}

}
}
