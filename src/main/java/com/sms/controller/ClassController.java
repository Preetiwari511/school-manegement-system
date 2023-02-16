package com.sms.controller;

import java.util.Set;

import com.sms.config.Application;
import com.sms.entity.Classes;
import com.sms.service.ClassService;
import com.sms.service.impl.ClassServiceImpl;

public class ClassController {
	private ClassService classService;
	public ClassController() {
		classService = new ClassServiceImpl();
	}
	public static void main(String[] args) {
		Set<Classes> classes = Application.CLASSES;	
		ClassController classController = new ClassController();
		Classes obj= new ClassController().classService.getClass("I");
		obj.setStrength(30);
		Set<Classes> classes1 = Application.CLASSES;
		Classes obj1= classController.classService.getClass("I");
		System.out.println(obj1.getStrength());
	}

}
