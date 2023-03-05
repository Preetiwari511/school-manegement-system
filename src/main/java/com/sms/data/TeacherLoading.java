package com.sms.data;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import com.sms.entity.Address;
import com.sms.entity.Teacher;
import com.sms.enums.AddressType;
import com.sms.enums.Gender;
import com.sms.service.SubjectsService;
import com.sms.service.impl.SubjectsServiceImpl;

public final class TeacherLoading {
	public static Set<Teacher> loadTeacher(){
		Set<Teacher> teacher = new LinkedHashSet<Teacher>();
		SubjectsService subjects = new SubjectsServiceImpl();
		
		teacher.add(new Teacher(1L, "Mohan", "Gupta", "mohan@sms.com", "1209334489", new Date(1991,11,9), true,Gender.MALE.getGender(), 
				new LinkedHashSet<>(Arrays.asList(new Address(9L, "Mini Lane", "Kolkata", "W.Bengal", "India", 223390,AddressType.PERMANENT.getAddressType()))),
				new LinkedHashSet<>(Arrays.asList(subjects.getSubjects(1),subjects.getSubjects(5)))));
		
		teacher.add(new Teacher(2L, "Bina", "Sharma", "bina@sms.com", "1209444489", new Date(1989,7,9), true,Gender.FEMALE.getGender(), 
				new LinkedHashSet<>(Arrays.asList(new Address(10L, "Lane-8", "Mumbai", "Maharashtra", "India",789654 ,AddressType.PERMANENT.getAddressType()))),
				new LinkedHashSet<>(Arrays.asList(subjects.getSubjects(1),subjects.getSubjects(4)))));
		
		teacher.add(new Teacher(3L, "Chinnappa", "Venkatesh", "ch.venktesha@sms.com", "3309334489", new Date(1987,1,10), true,Gender.MALE.getGender(), 
				new LinkedHashSet<>(Arrays.asList(new Address(11L, "Kirupanna", "Hyderabad", "Telangana", "India", 208090,AddressType.PERMANENT.getAddressType()))),
				new LinkedHashSet<>(Arrays.asList(subjects.getSubjects(2),subjects.getSubjects(3)))));
		
		teacher.add(new Teacher(4L, "Yamini", "Mehra", "yamini@sms.com", "1209556677", new Date(1990,8,13), true,Gender.FEMALE.getGender(), 
				new LinkedHashSet<>(Arrays.asList(new Address(12L, "CocoonLane", "Kolkata", "W.Bengal", "India", 223390,AddressType.PERMANENT.getAddressType()))),
				new LinkedHashSet<>(Arrays.asList(subjects.getSubjects(2),subjects.getSubjects(3)))));
		
		teacher.add(new Teacher(5L, "Pankaj", "Mishra", "pankaj@sms.com", "1280334489", new Date(1991,1,28), true,Gender.MALE.getGender(), 
				new LinkedHashSet<>(Arrays.asList(new Address(13L, "BandukGali", "Patna", "Bihar", "India", 300300,AddressType.PERMANENT.getAddressType()))),
				new LinkedHashSet<>(Arrays.asList(subjects.getSubjects(4),subjects.getSubjects(5)))));
		
		return teacher;	
	}

}
