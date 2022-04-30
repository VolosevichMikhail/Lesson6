package com.belhard.university;

import java.time.LocalDate;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationality;
	
public Person (String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
}
	
	
public Person (String firstName, String lastName, LocalDate dateOfBirth, String nationality) {
		this(firstName, lastName);
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
	}

public String getFirstName() {
	return firstName;
}

private void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

private void setLastName(String lastName) {
	this.lastName = lastName;
}

public LocalDate getDateOfBirth() {
	return dateOfBirth;
}

private void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getNationality() {
	return nationality;
}

private void setNationality(String nationality) {
	this.nationality = nationality;
}
	
	
	
	
	
	
	
	
	
}
