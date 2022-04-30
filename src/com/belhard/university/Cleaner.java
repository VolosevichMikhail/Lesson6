package com.belhard.university;


import java.time.LocalDate;

public class Cleaner extends Employee {

	int officeForCleaning;
	
	public Cleaner(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Cleaner(String firstName, String lastName, LocalDate dateOfBirth, String nationality) {
		super(firstName, lastName, dateOfBirth, nationality);
	}
	
	public Cleaner(String firstName, String lastName, LocalDate dateOfBirth, String nationality, int expirience, int hoursWorked, int vacation, String division) {
		super(firstName, lastName, dateOfBirth, nationality, expirience, hoursWorked, vacation, division);
		this.officeForCleaning = officeForCleaning;
	}

	private int getOfficeForCleaning() {
		return officeForCleaning;
	}

	private void setOfficeForCleaning(int officeForCleaning) {
		this.officeForCleaning = officeForCleaning;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
