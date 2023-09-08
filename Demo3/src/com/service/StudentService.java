package com.service;

import com.model.Student;

public class StudentService {

	public int getStudentId(Student student) {
		return student.getId();
	}

	public String getStudentName(Student student) {
		return student.getName();
	}

	public char getStudentGender(Student student) {
		return student.getGender();
	}

	public float getStudentMarks(Student student) {
		return student.getMarks();
	}

	public String getStudentClg(Student student) {
		return student.getClgName();
	}

	public String getStudentDept(Student student) {
		return student.getDept();
	}

	String res = "";

	public String studDept(Student[] students, String name) {
		for (Student student : students) {
			if (student.getName() == name) {
				res = (student.getName() + " dept is:" + student.getDept());
				break;
			} else {
				res = (student.getName() + " is not available");
			}
		}
		return res;
	}

	float max = 0f;
	String maxName = "";

	public String studMaxMarks(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getMarks() > max) {
				max = students[i].getMarks();
				maxName = students[i].getName();

			}
		}
		return maxName + " got highest marks: " + max;
	}
	
	Student student4 ;
	public Student login(Student[] students,String name,int pwd) {
		System.out.println("------------------------------------------------");
		System.out.println("*************  User Login Form   **************");
		System.out.println("------------------------------------------------");
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equalsIgnoreCase(name)  && students[i].getId() == pwd) {
				System.out.println("User name is: "+ students[i].getName());
				System.out.println("UserID is: "+ students[i].getId());
				System.out.println("User gender is: "+ students[i].getGender());
				
			}
			else if(students[i].getName().equalsIgnoreCase(name)  && students[i].getId() == pwd) {
				System.out.println("User name is: "+ students[i].getName());
				System.out.println("UserID is: "+ students[i].getId());
				System.out.println("User gender is: "+ students[i].getGender());
				
			}
			else if(students[i].getName().equalsIgnoreCase(name)  && students[i].getId() == pwd)
			{
				System.out.println("User name is: "+ students[i].getName());
				System.out.println("UserID is: "+ students[i].getId());
				System.out.println("User gender is: "+ students[i].getGender());
				
			}
			
		 if(students[i].getName() != name  && students[i].getId() == pwd) {
				System.out.println("Warning...");
				System.out.println();
				System.out.println("!!!!Please enter valid usernam and password!!!!");
				System.out.println();
				
			}
			
				
			}
		System.out.println();
		System.out.println("------------------------------------------------");
		
		
		return student4;
		}
	float total=0.0f;

	public float totalMarks(Student []students) {
		for (int i = 0; i < students.length; i++) {
		total = total+students[i].getMarks();
		
		}
		System.out.print("All students marks are : ");
		return total;
		
	}
	
	}
	

	

