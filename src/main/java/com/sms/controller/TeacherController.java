package com.sms.controller;

import java.util.List;
import java.util.Scanner;

import com.sms.config.Application;
import com.sms.entity.Student;
import com.sms.service.TeacherService;
import com.sms.service.impl.TeacherServiceImpl;

public class TeacherController {
	Scanner s;
	public void showStudentList() {
		s = new Scanner(System.in);
		System.out.println("Please enter the class from the following list to see the stundents of it. ");
		Application.CLASSES.forEach(classes -> {
			System.out.println(classes.getName());
		});
		String classInput = s.next();
		TeacherService teacherService = new TeacherServiceImpl();
		 List<Student> selectedStudent= teacherService.showStudentList(classInput);
		 if(selectedStudent!=null && selectedStudent.size()>0)
		 {
			 selectedStudent.forEach(student -> {
					System.out.println(student.getFullName());
				});
		 }
		 else {
			 System.out.println("No record found.");
		 }
		
		//s.close();		
	}
	
}
