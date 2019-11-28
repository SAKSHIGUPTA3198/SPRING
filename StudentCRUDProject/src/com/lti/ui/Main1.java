package com.lti.ui;

import com.lti.model.Student;
import com.lti.service.StdentServiceImpl;
import com.lti.service.StudentService;

public class Main1 {
 private static StudentService service = null;
 static{
	 
	 service = new StdentServiceImpl();
	 
 }
	public static void main(String[] args) {
		Student student = new Student(100,"shalene",70.5);
   boolean result = service.addStudent(student);
   if(result)
	   System.out.println("student is added in database");
   
   Student student2 = service.findStudentByRollNumber(student.getRollNumber());
   System.out.println(student2);
	}

}
