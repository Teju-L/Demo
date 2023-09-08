package com.model;

public class Teacher {
	private long teacherNo;
	public String teacherName;
	public int age;
	
	public long getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(long teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher(long teacherNo, String teacherName, int age) {
		super();
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
		this.age = age;
		System.out.println("Teacher No is: " +this.teacherNo +","+"Teacher Name is: "+this.teacherName+","+"Teacher age is: " +this.age);
	}
	public Teacher(int age) {
		super();
		this.age = age;
	}
	public Teacher(long teacherNo, String teacherName) {
		super();
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
	}
	public Teacher() {
		this.teacherNo = 145;
		this.teacherName = "Teju";
		this.age = 22;
		
	}
	

}
