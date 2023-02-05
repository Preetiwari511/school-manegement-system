package com.sms.config;

import java.util.Set;

import com.sms.data.SubjectsLoading;
import com.sms.entity.Subject;

public class Application {
	public static Set<Subject> SUBJECTS;

	public static void main(String[] args) {
		System.out.println("**** School Management System ****");
		System.out.println("Loading Data....");
		loadData();
		printData();
		System.out.println("**** Thankyou for visiting us. ****");
		
	}

	private static void loadData() {
		SUBJECTS = SubjectsLoading.loadSubjects();
	}
	
	private static void printData() {
		System.out.println("Printing all the subjects....");
		SUBJECTS.forEach(subject->{
			System.out.println(subject);
		});
	}

}
