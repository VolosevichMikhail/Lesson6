package com.belhard.university;

import java.time.LocalDate;



public class Student {
	private static long counter;
	private long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private int yearOfStudy;
	private boolean isBudget;
	private Address address;
	private String nationality;
	private double averageScore;


	public Student (String firstName, String lastName) {
		id = ++counter;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student (String firstName, String lastName, LocalDate dateOfBirth, int yearOfStudy, boolean isBudget, Address address, String nationality) {
		this(firstName, lastName);
		this.dateOfBirth = dateOfBirth;
		this.yearOfStudy = yearOfStudy;
		this.isBudget = isBudget;
		this.address = address;
		this.nationality = nationality;
	}
	
	

	
	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getyearOfStudy() {
		return yearOfStudy;
	}
	
	public void setyearOfStudy  (int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
	public boolean getisBudget() {
		return isBudget;
	}
	
	public void setisBudget(boolean isBudget) {
		this.isBudget = isBudget;
	}
	
	public LocalDate getdateOfBirth () {
		return dateOfBirth;
	}
	
	public void setdateOfBirth (LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public static String printAverageScore (Student student) {
		String list = "Average score of student " + student.getfirstName() + " " + student.getlastName() + " is " + student.getAverageScore();
		return list;
	}
	
	
	
}
