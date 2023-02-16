package com.sms.config;
import java.util.Scanner;
import java.util.Set;

import com.sms.controller.AdminController;
import com.sms.controller.ClassController;
import com.sms.controller.StudentController;
import com.sms.controller.TeacherController;
import com.sms.data.*;
import com.sms.entity.*;

public class Application {
	public static Set<Subject> SUBJECTS;
	public static Set<School> SCHOOLINFO;
	public static Set<Classes> CLASSES;
	public static Set<Teacher> TEACHER;
	public static Set<Student> STUDENT;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("**** School Management System ****");
		System.out.println("Loading Data....");
		loadData();
		printData();
		showMenu();
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
		
//		System.out.println("Printing all the subjects....");
//		SUBJECTS.forEach(subject->{
//			System.out.println(subject);
//		});
//		System.out.println("Printing the strength of each class");
//		CLASSES.forEach(classes->{System.out.println(classes);});
//		
//		System.out.println("Printing details of the teaching staff");
//		TEACHER.forEach(teacher->{System.out.println(teacher);});
	}
	
	public static void showMenu() throws InterruptedException {
		  Scanner s = new Scanner(System.in);
		 System.out.println("**************************WELCOME**************************** ");
		 System.out.println("Please select an option from the following list given below to access the further options.  ");
		 System.out.println("Press 1, if you are an student.");
		 System.out.println("Press 2, if you are a teacher.");
		 System.out.println("Press 3, if you are the Admin");
		 s= new Scanner(System.in);
		 int num = s.nextInt();
		 System.out.println("Loading........");
		 Thread.sleep(2000);
		 
		 switch(num) {
		 	case 1: StudentController studentController = new StudentController();
			studentController.showMyDetails();
			break;
		 	case 2: 
		 		TeacherController teacherController = new TeacherController();
		 	teacherController.showStudentList();
		 	break;
		 	case 3:AdminController adminController = new AdminController();
		 	adminController.allotTeacher();
		 	break;
		 	default: 
		 }
		 s.close();
		 
	}

}
