package com.belhard.university;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee extends Person {
	
	int expirience;
	int hoursWorked;
	BigDecimal salary;
	BigDecimal salaryBonus;
	int vacation;
	String division;
	
	public Employee (String firstName, String lastName) {
		super(firstName, lastName);
	}
		
	
	public Employee(String firstName, String lastName, LocalDate dateOfBirth, String nationality) {
		super(firstName, lastName, dateOfBirth, nationality);
	}

	public Employee(String firstName, String lastName, LocalDate dateOfBirth, String nationality, int expirience, int hoursWorked, int vacation, String division) {
		super(firstName, lastName, dateOfBirth, nationality);
		this.expirience = expirience;
		this.hoursWorked = hoursWorked;
		this.vacation = vacation;
		this.division = division;
	}

	public int getExpirience() {
		return expirience;
	}


	public void setExpirience(int expirience) {
		this.expirience = expirience;
	}


	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	private int getVacation() {
		return vacation;
	}


	private void setVacation(int vacation) {
		this.vacation = vacation;
	}


	private String getDivision() {
		return division;
	}


	private void setDivision(String division) {
		this.division = division;
	}



	
	
	
	

}
