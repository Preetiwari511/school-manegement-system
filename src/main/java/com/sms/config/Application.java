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
	public static Set<School> SCHOOL_INFO; // change it to SCHOOL_INFO
	public static Set<Classes> CLASSES;
	public static Set<Teacher> TEACHER;
	public static Set<Student> STUDENT;
	private static Scanner s;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("**************************WELCOME**************************** ");
		System.out.println("**** School Management System ****");
		System.out.println("Loading Data....");
		s = new Scanner(System.in);
		loadData();
		printData();
		showMenu();
		System.out.println("**** Thankyou for visiting us. ****");
		s.close();
	}

	private static void loadData() {
		SCHOOL_INFO = SchoolLoading.loadSchool();
		SUBJECTS = SubjectsLoading.loadSubjects();
		CLASSES = ClassesLoading.loadClasses();
		TEACHER = TeacherLoading.loadTeacher();
		STUDENT = StudentLoading.loadStudents();
	}
	
	private static void printData() {
		System.out.println("Printing the details of the school");
		System.out.println(SCHOOL_INFO);
		
//		System.out.println("Printing all the subjects....");
//		SUBJECTS.forEach(subject->{
//			System.out.println(subject.getName());});

	}
	
	public static void showMenu() throws InterruptedException {
		  boolean isActive = true;
		 while(isActive) {
			 int num = showMainMenu();
			 switch(num) {
			 	case 1: 
			 		StudentController studentController = new StudentController();
			 		studentController.showMyDetails();
			 		break;
			 	case 2: 
			 		TeacherController teacherController = new TeacherController();
			 		teacherController.showStudentList();
			 		break;
			 	case 3:
			 		showAdminHandleMenu();
			 	case 0:
			 		isActive= false;
			 		break;
				// add a case to exit
			 	default: {
					// not useful until this is not part of while loop
			 		System.out.println("Please enter the valid option.>>>>>>>..");
			 	}
			 
		 }
		 
		 }
		 
	}
	public static int showMainMenu() throws InterruptedException {

		System.out.println("**********************************************************************************************************");
		 System.out.println("Please select an option from the following list given below to access the further options.  ");
		 System.out.println("Press 1, if you are an student.");
		 System.out.println("Press 2, if you are a teacher.");
		 System.out.println("Press 3, if you are the Admin");
		 System.out.println("Press 0 to exit");
		  //s= new Scanner(System.in);
		 int num = Integer.parseInt(s.next());
		 System.out.println("Loading........");
		// Thread.sleep(2000);
		 return num;
	}
	
	public static void showAdminHandleMenu() throws InterruptedException {
		AdminController adminController = new AdminController();
		 System.out.println("Press 1,to get the details of student.");
		 System.out.println("Press 2,to get the name of stundents in the class.");
		 System.out.println("Press 3,to allot a classteacher.");
		 System.out.println("Press 4,to get the teaching subject of a teacher.");
		 System.out.println("Press 5,to get the total strength of the students in the school. ");
		 System.out.println("Press 6, to allot a subject teacher for a class.");
		 System.out.println("Press 7, to allot a subject to a teacher");
		 System.out.println("Press 8, to get list of subject teachers for selected subject");
		 System.out.println("Please enter '9' to go back to the main menu");
		 int code = s.nextInt();
		 switch(code) {
		 
		 	case 1:
		 		StudentController studentController1 = new StudentController();
		 		studentController1.showMyDetails();
		 		showAdminHandleMenu();
		 		break;
		 	case 2: 
		 		TeacherController teacherController1 = new TeacherController();
		 		teacherController1.showStudentList();
		 		showAdminHandleMenu();
		 		 break;
		 	case 3:
		 		adminController.allotClassTeacher();
		 		showAdminHandleMenu();
		 		break;
		 	case 4:
		 		adminController.getSubjectOfTeacher();
		 		showAdminHandleMenu();
		 	case 5:
		 		adminController.getTotalStrength();
		 		showAdminHandleMenu();
		 		break;
			// add a case to go back to the main menu
		 	case 6: 
		 		adminController.allotSubjectTeacherToClass();
		 		showAdminHandleMenu();
		 		break;
		 	case 7 : 
		 		adminController.allotSubjectToTeacher();
		 		showAdminHandleMenu();
		 		break;
		 	case 8 :
		 		adminController.listTeachersBySubjectId();
		 		showAdminHandleMenu();
		 		break;
		 	case 9: 
		 		showMenu();
		 }

	}
	
}
