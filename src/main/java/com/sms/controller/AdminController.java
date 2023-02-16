package com.sms.controller;

import java.util.Scanner;

import com.sms.config.Application;

public class AdminController {
	Scanner s;
	public void allotTeacher() {
		s = new Scanner(System.in);
		System.out.println("Please enter the class from the following classes");
		System.out.println(Application.CLASSES);
		String AssignClass = s.next();
		System.out.println("Please enter the id of a teacher from the following teacher list to assign the above class.");
		System.out.println(Application.TEACHER);
		Integer teacherID = s.nextInt();
		//System.out.println(AssignClass + teacherID);
		
	}
	
	
}
