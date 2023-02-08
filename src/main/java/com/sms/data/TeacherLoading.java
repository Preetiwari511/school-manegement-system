package com.sms.data;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import com.sms.entity.Subject;
import com.sms.entity.Teacher;

public final class TeacherLoading {
	public static Set<Teacher> loadTeacher(){
		Set<Teacher> teacher = new LinkedHashSet<Teacher>();
		teacher.add(new Teacher(1,"M K GUPTA",Arrays.asList(new Subject(4,"Hindi"), new Subject(1,"Mathematics"))));
		/*
		 * /teacher.add(new Teacher(2,"YASHODA PANDEY",)); teacher.add(new
		 * Teacher(3,"SUNIL CHOWDHARY",)); teacher.add(new Teacher(4,"KAMYA MEHRA",));
		 * teacher.add(new Teacher(5,"ANAMIKA KAPOOR",)); teacher.add(new
		 * Teacher(6,"YASHVARDHAN SAHANI",)); teacher.add(new
		 * Teacher(7,"AFTAB AHEMED",)); teacher.add(new Teacher(8,"ROSY GRACE",));
		 * teacher.add(new Teacher(9,"KK BIHARI",)); teacher.add(new
		 * Teacher(10,"RAM CHATURVEDI",));
		 */
		return teacher;
		
	}

}
