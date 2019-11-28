package com.lti.ui;

import java.util.List;

import com.lti.model.Student;
import com.lti.service.StdentServiceImpl;
import com.lti.service.StudentService;

public class Main3 {
 private static StudentService service = null;
 static{
	 
	 service = new StdentServiceImpl();
	 
 }
	public static void main(String[] args) {
		Student student = new Student(600,"tejas",50);
   boolean result = service.addStudent(student);
   if(result)
	   System.out.println("student is added in database");
   
    List <Student> list = service.findAllStudents();
    
    }
 
	}


