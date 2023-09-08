package com.main;

import com.model.Student;
import com.service.StudentService;

public class StudentMainApplication {
	public static void main(String[] args) {
	
	Student student1 = new Student();
	student1.setId(1);
	student1.setName("Teju");
	student1.setClgName("GATE");
	student1.setDept("CSE");
	student1.setGender('F');
	student1.setMarks(800f);
	
	
	Student student2 = new Student();
	student2.setId(2);
	student2.setName("Ajitha");
	student2.setClgName("GATE");
	student2.setDept("MCA");
	student2.setGender('F');
	student2.setMarks(86f);
	
	Student student3 = new Student();
	student3.setId(3);
	student3.setName("Jashu");
	student3.setClgName("JUNTUA");
	student3.setDept("ECE");
	student3.setGender('M');
	student3.setMarks(96f);
	
	StudentService studentService = new StudentService();
	System.out.println("Student1 ID is: "+ studentService.getStudentId(student1));
	
	
	Student[] students = new Student[3];
	students[0] = student1;
	students[1] = student2;
	students[2] = student3;
	System.out.println(students[0]);
	
	System.out.println(studentService.studDept(students,"Ajitha"));
	System.out.println(studentService.studMaxMarks(students));
	//Student student5 = new Student();
	Student student4 = new Student();
	
	     student4 =  studentService.login(students,"Teju",1);
	     
	     
	     System.out.println(studentService.totalMarks(students));
	     
	     
	
}
}