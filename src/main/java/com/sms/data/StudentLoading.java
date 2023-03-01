package com.sms.data;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import com.sms.entity.Address;
import com.sms.entity.Student;
import com.sms.entity.User;
import com.sms.enums.Gender;
import com.sms.service.ClassService;
import com.sms.service.impl.ClassServiceImpl;

public class StudentLoading {
	public static Set<Student> loadStudents() {
		ClassService classService = new ClassServiceImpl();
		Set<Student>students = new LinkedHashSet<Student>();
		//use map instead of calling classService.getClass 
		// Adding student using fourth method (optimized)
		students.add(new Student(1L,1001 ,"Aman", "Gupta", "aman@gmail.com", "1234567890", new Date(2007, 02, 20), true,
				Gender.MALE.getGender(),
				new LinkedHashSet<>(
						Arrays.asList(new Address(1L, "Lane5", "Jaipur", "Rajasthan", "India", 123456, "Postal"))),
				classService.getClass("I")));
		
		students.add(new Student(2L,1002,"Kishina", "Dubey","kishina@gmail.com","5467890112",new Date(2007, 11, 06),true,
				Gender.FEMALE.getGender(),
				new LinkedHashSet<>(
						Arrays.asList(new Address(2L, "Street 2", "Jaipur", "Rajasthan", "India", 302019, "Permanent"))),
				classService.getClass("I")));
		
		// Adding student using first method.
		
		Set<Address> addresses = new LinkedHashSet<>();
		Address address1 = new Address();
		
		address1.setId(3L);
		address1.setStreet("Balevadi High Street");
		address1.setCity("Jaipur City");
		address1.setState("Rajasthan");
		address1.setCountry("India");
		address1.setPincode(302020);
		address1.setAddressType("Permanent");
		
		addresses.add(address1);
		
		students.add(new Student(3L,2001,"Binod", "Ala","binod@gmail.com","5467890442",new Date(2006, 11, 06),true,
				Gender.MALE.getGender(),addresses,
				classService.getClass("II")));
		
		
		// Adding student using Second Method
		
		Set<Address> addresses1 = new LinkedHashSet<>();
		Address address2 = new Address(4L, "StreetPink", "Jaipur", "Rajasthan", "India", 302018, "Permanent");
		Address address3 = new Address(5L, "StreetGreen", "Jaipur", "Rajasthan", "India", 302018, "Postal");
		addresses1.add(address2);
		addresses1.add(address3);
		students.add(new Student(4L,2002,"Rohini", "Arora","rohini@gmail.com","4563789201",new Date(2006, 01, 04),true,
				Gender.FEMALE.getGender(),addresses1,
				classService.getClass("II")));
		
		//Adding student using third method
		
		Address address4 = new Address(6L,"Lane ManSingh","Jaipur","Rajasthan","India",302019,"Permanent");
		students.add(new Student(5L,3001,"Ashutosh", "Tiwari","ashu@gmail.com","2890763390",new Date(2005, 01, 04),true,
				Gender.MALE.getGender(),new LinkedHashSet<>(Arrays.asList(address4)),
				classService.getClass("III")));
		
		
		students.add(new Student(6L,3002 ,"Vidushi", "Gupta", "vidu@gmail.com", "1244567890", new Date(2005, 12, 10), true,
				Gender.FEMALE.getGender(),
				new LinkedHashSet<>(
						Arrays.asList(new Address(7L, "Lane51", "Jaipur", "Rajasthan", "India", 302019, "Postal"))),
				classService.getClass("III")));
		
		students.add(new Student(7L,4001 ,"Janhvi", "Sharma", "jahnvi@gmail.com", "12567890", new Date(2004, 02, 10), true,
				Gender.FEMALE.getGender(),
				new LinkedHashSet<>(
						Arrays.asList(new Address(8L, "Lane2", "Jaipur", "Rajasthan", "India", 123456, "Postal"))),
				classService.getClass("IV")));
		
		students.add(new Student(8L,5001 ,"Amina", "Khan", "amina@gmail.com", "1234567899", new Date(2003, 3, 23), true,
				Gender.FEMALE.getGender(),
				new LinkedHashSet<>(
						Arrays.asList(new Address(9L, "Lane56", "Jaipur", "Rajasthan", "India", 123456, "Postal"))),
				classService.getClass("V")));
		
		return students;
	}
}
