package com.sms.data;

import java.util.LinkedHashSet;
import java.util.Set;

import com.sms.entity.Classes;
import com.sms.entity.Student;

public class StudentLoading {
	public static Set<Student> loadStudents() {
		Set<Student>students = new LinkedHashSet<Student>();
		students.add(new Student(1,"Mahesh Bongale",12,"Male",new Classes("I",20)));
		return students;
	}
}
