package com.sms.controller;

import java.util.Scanner;
import java.util.Set;
import com.sms.config.Application;
import com.sms.entity.Classes;
import com.sms.entity.Subject;
import com.sms.entity.Teacher;
import com.sms.service.AdminService;
import com.sms.service.ClassService;
import com.sms.service.impl.AdminServiceImpl;
import com.sms.service.impl.ClassServiceImpl;

public class AdminController {
	private Scanner s;
	private AdminService adminService;
	private ClassService classService;

	public AdminController() {
		this.adminService = new AdminServiceImpl();
		this.classService = new ClassServiceImpl();
	}

	public void allotClassTeacher() {
		s = new Scanner(System.in);
		System.out.println("Please enter the class from the following classes");
		Application.CLASSES.forEach(classes -> {
			System.out.println(classes.getName());
		});
		String assignClass = s.next();
		System.out.println(
				"Please enter the name of a teacher from the following teacher list to assign the above class.");
		Application.TEACHER.forEach(teacher -> {
			System.out.println(teacher.getFirstName() + teacher.getLastName());
		});
		String teacher = s.next();

		adminService.allotClassTeacher(assignClass, teacher);
	}

	public void getSubjectOfTeacher() {
		s = new Scanner(System.in);
		System.out.println("Please select teacher to get the teaching subject");
		Application.TEACHER.forEach(teacher -> {
			System.out.println(teacher.getFirstName() + teacher.getLastName());
		});
		String teacher = s.next();
		AdminService adminService = new AdminServiceImpl();
		Set<Subject> requiredSub = adminService.findSubject(teacher);
		System.out.println("The teacher " + teacher + " teaches " + requiredSub);
	}

	public void getTotalStrength() {
		// take class name as input and print the strength of that
		System.out.println("The total strength of the school is " + classService.getTotalStrength());

	}

	public void allotSubjectTeacherToClass() {
		s = new Scanner(System.in);
		System.out.println("Please choose the class.");

		Application.CLASSES.forEach(classes -> {
			System.out.println(classes.getName());
		});
		String selectedClass = s.next();

		System.out.println("Please select the subject ID.");
		Application.SUBJECTS.forEach(subject -> {
			System.out.println(" " + subject.getId() + " " + subject.getName());
		});
		int subjectID = s.nextInt();

		System.out.println("Please select the teacher.");
		Application.TEACHER.forEach(teachers -> {
			System.out.println(teachers.getFullName());
		});
		String teacher = s.next();

		Classes subjectTeacherofClass = adminService.allotSubjectTeacherToClass(teacher, subjectID, selectedClass);

		System.out.println("The Subject teacher for given subject is set" + subjectTeacherofClass.getSubjectTeacher());

	}
	
	public void allotSubjectToTeacher() {
		s = new Scanner(System.in);
		System.out.println("Please select the teacher to assign the subject.");
		Application.TEACHER.forEach(teachers -> {
			System.out.println(teachers.getFullName());
		});
		String teacher = s.next();
		
		System.out.println("Please select the id of the subject to be assigned");
		Application.SUBJECTS.forEach(subjects->{
			System.out.println(subjects.getId() + " "+ subjects.getName());
		});
		int subjectID = s.nextInt();
		
		Teacher teacherUpdated = adminService.allotSubjectToTeacher(subjectID, teacher);
		System.out.println("The subjects tought by " + teacherUpdated.getFullName() + "are " + teacherUpdated.getSubject());
		
	}
	
	public void listTeachersBySubjectId() {
		s = new Scanner(System.in);
		System.out.println("Please select the subject Id to get the subject teacher for the respective subject");
		Application.SUBJECTS.forEach(subjects->{
			System.out.println(subjects.getId() + " " + subjects.getName());
		});
		int subjectID = s.nextInt();
		Set<Teacher> subjectTeachers = adminService.listTeachersBySubjectId(subjectID);
		for(Teacher obj :subjectTeachers) {
			System.out.println(obj.getFullName());
		}
		
	}

}
