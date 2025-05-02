package com.javaex.ex18;

public class Student {

	//필드
	private String name;
	private int age;
	private String schoolname;
	
	//생성자
	public Student() {
	}
	public Student(String name, int age, String schoolname) {
		this.name = name;
		this.age = age;
		this.schoolname = schoolname;
		
	}
	
	
	//메소드 gs
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	//
	
}
