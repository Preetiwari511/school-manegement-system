package com.sms.service.impl;

import java.util.Iterator;
import java.util.Set;

import com.sms.config.Application;
import com.sms.entity.Student;
import com.sms.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public Student showMyDetails(int id) {
		Set<Student> students = Application.STUDENT;
		Iterator<Student> itr = students.iterator();
	    while(itr.hasNext()) {
	    	Student student = itr.next();
	    	if(student.getId()==id) {
	    		return student;
	    	}
	    }
		return null;
	}

}
