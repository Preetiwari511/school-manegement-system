package com.sms.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import com.sms.config.Application;
import com.sms.entity.Student;
import com.sms.service.TeacherService;

public class TeacherServiceImpl implements TeacherService{
	@Override
	public List<Student> showStudentList(String className) {
		Set<Student> students = Application.STUDENT;
		List<Student> selectedStudents = new ArrayList<Student>();
		Iterator<Student> itr = students.iterator();
	    while(itr.hasNext()) {
	    	Student student = itr.next();
	    		if(student.getStd().getName().equalsIgnoreCase(className)) {
	    		  selectedStudents.add(student);
	    		}
	    	}
	    return selectedStudents;
	}
}

