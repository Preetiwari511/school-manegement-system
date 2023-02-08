package com.sms.config;
import java.util.LinkedHashSet;
import java.util.Set;

import com.sms.controller.StudentController;
import com.sms.data.*;
import com.sms.entity.*;

public class Application {
	public static Set<Subject> SUBJECTS;
	public static Set<School> SCHOOLINFO;
	public static Set<Classes> CLASSES;
	public static Set<Teacher> TEACHER;
	public static Set<Student> STUDENT= new LinkedHashSet<Student>();

	public static void main(String[] args) {
		System.out.println("**** School Management System ****");
		System.out.println("Loading Data....");
		loadData();
		printData();
		StudentController studentController = new StudentController();
		studentController.showMyDetails();
		System.out.println("**** Thankyou for visiting us. ****");
		
	}

	private static void loadData() {
		SCHOOLINFO = SchoolLoading.loadSchool();
		SUBJECTS = SubjectsLoading.loadSubjects();
		CLASSES = ClassesLoading.loadClasses();
		TEACHER = TeacherLoading.loadTeacher();
		STUDENT = StudentLoading.loadStudents();
	}
	
	private static void printData() {
		System.out.println("Printing the details of the school");
		System.out.println(SCHOOLINFO);
		
		System.out.println("Printing all the subjects....");
		SUBJECTS.forEach(subject->{
			System.out.println(subject);
		});
		System.out.println("Printing the strength of each class");
		CLASSES.forEach(classes->{System.out.println(classes);});
		
		System.out.println("Printing details of the teaching staff");
		TEACHER.forEach(teacher->{System.out.println(teacher);});
	}

}
