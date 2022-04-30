package com.belhard.university;

import java.math.BigDecimal;

public class AccountantUtil {
	private static Employee employee;
	
	
	public static double CooficentOfExpirience (int expirience) {
		double cooficentOfExpirience;
		if (expirience < 24) {
			cooficentOfExpirience = 1.01;
		} else if (expirience < 48) {
			cooficentOfExpirience = 1.15;
		} else {
			cooficentOfExpirience = 1.3;
		}
		return cooficentOfExpirience;
	}
	
	public static double CooficentOfHoursWorked (int hoursWorked) {
		double cooficentOfhoursWorked;
		if (hoursWorked < 30) {
			cooficentOfhoursWorked = 1.01;
		} else if (hoursWorked < 60) {
			cooficentOfhoursWorked = 1.15;
		} else {
			cooficentOfhoursWorked = 1.3;
		}
		return cooficentOfhoursWorked;
	}
	
	public static double CooficentOfAcademicDegree (boolean academicDegree) {
		double cooficentOfAcademicDegree;
		if (academicDegree == false) {
			cooficentOfAcademicDegree = 1.0;
		} else {
			cooficentOfAcademicDegree = 1.2;
		}
		return cooficentOfAcademicDegree;
	}
	
	public static BigDecimal FinalCooficent (int expirience, int hoursWorked) {
		double cooficent = CooficentOfExpirience(expirience) + CooficentOfHoursWorked(hoursWorked) ;
		BigDecimal finalCooficent = new BigDecimal(cooficent);
		return finalCooficent;
	}
	
	
	public static BigDecimal SalaryBonus(Employee employee) {
			BigDecimal bonus = employee.salary.multiply(FinalCooficent(employee.getExpirience(), employee.getHoursWorked()));
			return bonus;
	}
	
	public static BigDecimal VacationPayEmployee (Employee employee) {
		BigDecimal VacationPayEmployee = employee.salary.multiply(BigDecimal.valueOf(2.5));
		return VacationPayEmployee;
	}
	

	
	
	
	
	
}
