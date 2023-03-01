package com.sms.data;
import java.util.LinkedHashSet;
import java.util.Set;
import com.sms.entity.Classes;

public final class ClassesLoading {
	public static Set<Classes> loadClasses(){
		Set<Classes> classInfo = new LinkedHashSet<Classes>();
		classInfo.add(new Classes("I",20));
		classInfo.add(new Classes("II",20));
		classInfo.add(new Classes("III",20));
		classInfo.add(new Classes("IV",20));
		classInfo.add(new Classes("V",20));		
		return classInfo;
		
	}
}
