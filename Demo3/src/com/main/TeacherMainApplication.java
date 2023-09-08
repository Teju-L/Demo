package com.main;

import com.model.Teacher;

public class TeacherMainApplication {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		System.out.println(teacher.getTeacherNo());
		System.out.println(teacher.getAge());
		System.out.println(teacher.getTeacherName());
		Teacher teacher1 = new Teacher(12,"Ajitha",34);
		
		
		System.out.println("Enter the student name");
	    
		int a = Integer.parseInt(teacher.teacherName);
		System.out.println(a);
		
		
		
	}

}
