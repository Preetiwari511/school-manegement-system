package com.sms.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.sms.config.Application;
import com.sms.entity.Subject;
import com.sms.entity.Teacher;
import com.sms.service.AdminService;
import com.sms.service.ClassService;
import com.sms.service.impl.AdminServiceImpl;
import com.sms.service.impl.ClassServiceImpl;

public class AdminController {
	Scanner s;
	public void allotClassTeacher() {
		s = new Scanner(System.in);
		System.out.println("Please enter the class from the following classes");
		Application.CLASSES.forEach(classes -> {
			System.out.println(classes.getName());
		});
		String assignClass = s.next();
		System.out.println("Please enter the name of a teacher from the following teacher list to assign the above class.");
		Application.TEACHER.forEach(teacher -> {
			System.out.println(teacher.getFirstName()+ teacher.getLastName());
		});
		String teacher = s.next();
		AdminService adminService = new AdminServiceImpl();
		adminService.allotClassTeacher(assignClass, teacher);
	}
	
	public void getSubjectOfTeacher() {
		s= new Scanner(System.in);
		System.out.println("Please select teacher to get the teaching subject");
		Application.TEACHER.forEach(teacher -> {
			System.out.println(teacher.getFirstName()+ teacher.getLastName());
		});
		String teacher = s.next();
		AdminService adminService = new AdminServiceImpl();
		Set<Subject> requiredSub= adminService.findSubject(teacher);
		System.out.println("The teacher "+teacher +" teaches "+ requiredSub);
	}
	
	public void getTotalStrength() {
		ClassService classService = new ClassServiceImpl();
		// take class name as input and print the strength of that
		System.out.println("The total strength of the school is "+ classService.getTotalStrength());
		
	}
	
	public void allotSubjectTeacherToClass() {
		s= new Scanner(System.in);
		System.out.println("Please choose the class.");
		
		Application.CLASSES.forEach(classes -> {
			System.out.println(classes.getName());
		});
		String selectedClass= s.next();
		
		System.out.println("Please select the subject");
		Application.SUBJECTS.forEach(subject ->{System.out.println(subject.getName());});
		String subject = s.next();
		
		System.out.println("Please select the teacher.");
		Application.TEACHER.forEach(teachers ->{
						System.out.println(teachers.getFullName());			
		});
		String teacher = s.next();
		
	}
	
	
}
