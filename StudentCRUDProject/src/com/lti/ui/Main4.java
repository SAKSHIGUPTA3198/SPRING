package com.lti.ui;

import java.util.List;

import com.lti.model.Student;
import com.lti.service.StdentServiceImpl;
import com.lti.service.StudentService;

public class Main4 {
 private static StudentService service = null;
 static{
	 
	 service = new StdentServiceImpl();
	 
 }
	public static void main(String[] args) {
	List<Student> list = service.findStudentByScore(80, 90);
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
