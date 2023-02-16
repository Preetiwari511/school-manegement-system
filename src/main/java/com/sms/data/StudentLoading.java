package com.sms.data;

import java.util.LinkedHashSet;
import java.util.Set;

import com.sms.entity.Classes;
import com.sms.entity.Student;
import com.sms.service.ClassService;
import com.sms.service.impl.ClassServiceImpl;

public class StudentLoading {
	public static Set<Student> loadStudents() {
		ClassService classService = new ClassServiceImpl();
		Set<Student>students = new LinkedHashSet<Student>();
		students.add(new Student(11,"Aman Gupta",12,"Male",classService.getClass("I")));
//		students.add(new Student(12,"Kishina Dubey",12,"Female",new Classes("I",20)));
//		students.add(new Student(21,"Binod Ala",13,"Male",new Classes("II",20)));
//		students.add(new Student(22,"AS WW",13,"Female",new Classes("II",20)));
//		students.add(new Student(31,"Jigisha Mehra",14,"Male",new Classes("III",20)));
//		students.add(new Student(32,"Oshi Sharma",14,"Female",new Classes("III",20)));
//		students.add(new Student(41,"Vishal M",15,"Male",new Classes("IIV",20)));
//		students.add(new Student(42,"Zoya Shekh",15,"Female",new Classes("IV",20)));
//		students.add(new Student(51,"Mahesh Bongale",12,"Male",new Classes("V",20)));
//		students.add(new Student(52,"Mahesh Bongale",12,"Female",new Classes("V",20)));
//		students.add(new Student(61,"Mahesh Bongale",12,"Male",new Classes("VI",20)));
//		students.add(new Student(62,"Mahesh Bongale",12,"Female",new Classes("VI",20)));
//		students.add(new Student(71,"Mahesh Bongale",12,"Male",new Classes("VII",20)));
//		students.add(new Student(72,"Mahesh Bongale",12,"Female",new Classes("VII",20)));
//		students.add(new Student(81,"Mahesh Bongale",12,"Male",new Classes("VIII",20)));
//		students.add(new Student(82,"Mahesh Bongale",12,"Female",new Classes("VIII",20)));
//		students.add(new Student(91,"Mahesh Bongale",12,"Male",new Classes("IX",20)));
//		students.add(new Student(92,"Mahesh Bongale",12,"Female",new Classes("IX",20)));
//		students.add(new Student(101,"Mahesh Bongale",12,"Male",new Classes("X",20)));
//		students.add(new Student(102,"Mahesh Bongale",12,"Female",new Classes("X",20)));
//		students.add(new Student(111,"Mahesh Bongale",12,"Male",new Classes("XI",20)));
//		students.add(new Student(112,"Mahesh Bongale",12,"Female",new Classes("XI",20)));
//		students.add(new Student(121,"Mahesh Bongale",12,"Male",new Classes("XII",20)));
//		students.add(new Student(122,"Mahesh Bongale",12,"Female",new Classes("XII",20)));
		
		return students;
	}
}
