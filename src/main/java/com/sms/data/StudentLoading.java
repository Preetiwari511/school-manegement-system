package com.sms.data;

import java.util.LinkedHashSet;
import java.util.Set;
import com.sms.entity.Student;
import com.sms.service.ClassService;
import com.sms.service.impl.ClassServiceImpl;

public class StudentLoading {
	public static Set<Student> loadStudents() {
		ClassService classService = new ClassServiceImpl();
		Set<Student>students = new LinkedHashSet<Student>();
		//use map instead of calling classService.getClass 
		students.add(new Student(11,"Aman Gupta",6,"Male",classService.getClass("I")));
		students.add(new Student(12,"Kishina Dubey",6,"Female",classService.getClass("I")));
		students.add(new Student(21,"Binod Ala",7,"Male",classService.getClass("II")));
		students.add(new Student(22,"AS WW",7,"Female",classService.getClass("II")));
		students.add(new Student(31,"Jigisha Mehra",8,"Male",classService.getClass("III")));
		students.add(new Student(32,"Oshi Sharma",8,"Female",classService.getClass("III")));
		students.add(new Student(41,"Vishal M",9,"Male",classService.getClass("IV")));
		students.add(new Student(42,"Zoya Shekh",9,"Female",classService.getClass("IV")));
		students.add(new Student(51,"Riyan Mehra",10,"Male",classService.getClass("V")));
		students.add(new Student(52,"Suhani Mishra",10,"Female",classService.getClass("V")));
		students.add(new Student(61,"Krish Gupta",11,"Male",classService.getClass("VI")));
		students.add(new Student(62,"Khushi Mittal",11,"Female",classService.getClass("VI")));
		students.add(new Student(71,"Anup Kajol",12,"Male",classService.getClass("VII")));
		students.add(new Student(72,"Binni Chattarji",12,"Female",classService.getClass("VII")));
		students.add(new Student(81,"Mohit manjha",13,"Male",classService.getClass("VIII")));
		students.add(new Student(82,"Moena Mishthi",13,"Female",classService.getClass("VIII")));
		students.add(new Student(91,"Himesh Mehra",14,"Male",classService.getClass("IX")));
		students.add(new Student(92,"Mukesh Otwani",14,"Male",classService.getClass("IX")));
		students.add(new Student(101,"Ridhdhi Purohit",15,"Female",classService.getClass("X")));
		students.add(new Student(102,"Dipak Sharma",15,"Male",classService.getClass("X")));
		students.add(new Student(111,"Ishan Avasthi",16,"Male",classService.getClass("XI")));
		students.add(new Student(112,"Rupali Gonsen",16,"Female",classService.getClass("XI")));
		students.add(new Student(121,"Sourabh Sharma",17,"Male",classService.getClass("XII")));
		students.add(new Student(122,"Surbhi Sharma",17,"Female",classService.getClass("XII")));
		
		return students;
	}
}
