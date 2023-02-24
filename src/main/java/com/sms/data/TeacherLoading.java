package com.sms.data;

import java.util.LinkedHashSet;
import java.util.Set;
import com.sms.entity.Teacher;
import com.sms.service.SubjectsService;
import com.sms.service.impl.SubjectsServiceImpl;

public final class TeacherLoading {
	public static Set<Teacher> loadTeacher(){
		Set<Teacher> teacher = new LinkedHashSet<Teacher>();
		SubjectsService subjects = new SubjectsServiceImpl();
		teacher.add(new Teacher(1,"M.K.GUPTA",subjects.getSubjects(12)));
		teacher.add(new Teacher(2,"B.K.GUPTA",subjects.getSubjects(1)));
		teacher.add(new Teacher(3,"C.K.GUPTA",subjects.getSubjects(9)));
//		teacher.add(new Teacher(4,"H K GUPTA",subjects.getSubjects(3)));
//		teacher.add(new Teacher(5,"L K GUPTA",subjects.getSubjects(6)));
//		teacher.add(new Teacher(6,"V K GUPTA",subjects.getSubjects(7)));
//		teacher.add(new Teacher(7,"G K GUPTA",subjects.getSubjects(11)));
//		teacher.add(new Teacher(8,"V K GUPTA",subjects.getSubjects(13)));
//		teacher.add(new Teacher(8,"C K GUPTA",subjects.getSubjects(2)));
//		teacher.add(new Teacher(8,"O K GUPTA",subjects.getSubjects(8)));
//		teacher.add(new Teacher(8,"W K GUPTA",subjects.getSubjects(10)));
		return teacher;	
	}

}
