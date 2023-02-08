package com.sms.controller;

import com.sms.entity.Student;
import com.sms.service.StudentService;
import com.sms.service.impl.StudentServiceImpl;

public class StudentController {
	public void showMyDetails() {
		//take ID as input
		int id =2;
		StudentService studentService= new StudentServiceImpl();
		Student detail=studentService.showMyDetails(id);
		System.out.println(detail);
		}
}
