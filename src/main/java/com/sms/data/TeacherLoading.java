package com.sms.data;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import com.sms.entity.Subject;
import com.sms.entity.Teacher;

public final class TeacherLoading {
	public static Set<Teacher> loadTeacher(){
		Set<Teacher> teacher = new LinkedHashSet<Teacher>();
		teacher.add(new Teacher(1,"M K GUPTA",Arrays.asList(new Subject(12,"Physics"), new Subject(1,"Mathematics"))));
		teacher.add(new Teacher(2,"YASHODA PANDEY",Arrays.asList(new Subject(4,"Hindi"), new Subject(5,"Social Science")))); 
		 teacher.add(new Teacher(3,"SUNIL CHOWDHARY",Arrays.asList(new Subject(1,"Mathematics"), new Subject(2,"Science")))); 
		 teacher.add(new Teacher(4,"KAMYA MEHRA",Arrays.asList(new Subject(10,"Biology"), new Subject(11,"Chemistry"))));
		 teacher.add(new Teacher(5,"ANAMIKA KAPOOR",Arrays.asList(new Subject(9,"Accounts"), new Subject(8,"Economics")))); 
		 teacher.add(new Teacher(6,"YASHVARDHAN SAHANI",Arrays.asList(new Subject(3,"English"), new Subject(5,"Social Science")))); 
		 teacher.add(new Teacher(7,"AFTAB AHEMED",Arrays.asList(new Subject(6,"History"), new Subject(7,"Geography")))); 
		 teacher.add(new Teacher(8,"ROSY GRACE",Arrays.asList(new Subject(13,"Computers"), new Subject(1,"Mathematics"))));
		 teacher.add(new Teacher(9,"KK BIHARI",Arrays.asList(new Subject(5,"Social Science"), new Subject(3,"English")))); 
		 teacher.add(new Teacher(10,"RAM CHATURVEDI",Arrays.asList(new Subject(13,"Computers"), new Subject(2,"Science"))));
		 
		return teacher;
		
	}

}
