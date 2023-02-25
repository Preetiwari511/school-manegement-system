package com.sms.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.sms.config.Application;
import com.sms.entity.Subject;
import com.sms.service.AdminService;
import com.sms.service.ClassService;
import com.sms.service.impl.AdminServiceImpl;
import com.sms.service.impl.ClassServiceImpl;

public class AdminController {
	Scanner s;
	public void allotTeacher() {
		s = new Scanner(System.in);
		System.out.println("Please enter the class from the following classes");
		Application.CLASSES.forEach(classes -> {
			System.out.println(classes.getName());
		});
		String assignClass = s.next();
		System.out.println("Please enter the name of a teacher from the following teacher list to assign the above class.");
		Application.TEACHER.forEach(teacher -> {
			System.out.println(teacher.getName());
		});
		String teacher = s.next();
		// not useful if stored in local collection, use global collection here
		// this should be part of AdminService
		List<String> classTeacherData = new LinkedList<>();
		classTeacherData.add(assignClass);
		classTeacherData.add(teacher);
	}
	
	public void getSubjectOfTeacher() {
		s= new Scanner(System.in);
		System.out.println("Please select teacher to get the teaching subject");
		Application.TEACHER.forEach(teacher -> {
			System.out.println(teacher.getName());
		});
		String teacher = s.next();
		AdminService adminService = new AdminServiceImpl();
		Subject requiredSub= adminService.findSubject(teacher);
		System.out.println("The teacher "+teacher +" teaches "+ requiredSub.getName());
	}
	
	public void getTotalStrength() {
		ClassService classService = new ClassServiceImpl();
		// take class name as input and print the strength of that
		System.out.println("The total strength of the school is "+ classService.getTotalStrength());
		
	}
	
	
}
