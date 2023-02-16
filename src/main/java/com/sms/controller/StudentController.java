package com.sms.controller;

import java.util.Scanner;

import com.sms.entity.Student;
import com.sms.service.StudentService;
import com.sms.service.impl.StudentServiceImpl;

public class StudentController {
	Scanner s;
	public void showMyDetails() {
		System.out.println("Please enter the ID of the student.");
		s = new Scanner(System.in);
		int id = s.nextInt();
		StudentService studentService= new StudentServiceImpl();
		Student detail=studentService.showMyDetails(id);
		System.out.println(detail);
		}
}
