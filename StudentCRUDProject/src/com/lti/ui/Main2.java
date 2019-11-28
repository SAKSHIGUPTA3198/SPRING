package com.lti.ui;

import com.lti.model.Student;
import com.lti.service.StdentServiceImpl;
import com.lti.service.StudentService;
import java.util.*;
public class Main2 {
	private static StudentService service = null;
	 static{
		 
		 service = new StdentServiceImpl();
		 
	 }

	public static void main(String[] args) {
	//int ch=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("1:Add Student  2:Read Student 3:Modify Student 4:Delete Student");

	System.out.println("Enter your choice");
	
	int ch= sc.nextInt();
	switch(ch)
	{

	case 1:
		
		System.out.println("Enter RollNumber");
		int rollNumber=sc.nextInt();
		System.out.println("Enter Name");
		String studentName = sc.next();
		System.out.println("Enter Avg Score");
	double avgScore =sc.nextDouble();
		Student student = new Student(rollNumber, studentName, avgScore);
	 boolean result = service.addStudent(student);
		break;
		
	case 2:
		System.out.println("enter rollno");
		 int rollno=sc.nextInt();
		 Student student2 = service.findStudentByRollNumber(rollno);
		   System.out.println(student2);
		break;
		
	case 3:
		System.out.println("enter rollno to modify");
		 rollno= sc.nextInt();
		student2 = service.findStudentByRollNumber(rollno);
		System.out.println(" enter name n score to update");
		studentName = sc.next();
		avgScore = sc.nextDouble();
		student = new Student(rollno, studentName, avgScore);
		student = service.modifyStudent(student);
		System.out.println(student);
		
		
		
		break;
		
	case 4:
		System.out.println("Enter Rollno");
		rollNumber=sc.nextInt();
		boolean student3 = service.removeStudent(rollNumber);

		break;
		
		
	
	}
	}

}
