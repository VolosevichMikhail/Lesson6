package com.belhard.university;

import java.util.Date;

public class Teacher extends Employee{

	private static long counter;
	private long id;
	private String subject;
	private Address adress;
	private boolean academicDegree;
	
	public Teacher (String firstName, String lastName) {
		super(firstName, lastName);
		id = ++counter;
	}
	


	public long getid() {
		return id;
	}


	
	public String getsubject () {
		return subject;
	}
	
	public void setsubject (String subject) {
		this.subject = subject;
	}
	
	public boolean getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(boolean academicDegree) {
		this.academicDegree = academicDegree;
	}
}
