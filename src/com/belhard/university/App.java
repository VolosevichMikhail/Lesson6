package com.belhard.university;


import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		Student st1 = new Student ("Mike", "Jordan");
		st1.setAddress(new Address("Belarus", "Minsk", "Bahdanovicha", "29"));
		Student st2 = new Student ("Julia", "Andersson");
		st2.setAddress(new Address("Belarus", "Minsk", "Bahdanovicha", "40A", 13));
		Student st3 = new Student ("Mike", "Vazovskii");
		st3.setAddress(new Address("Belarus", "Minsk", "Nezavisimosti", "214", 46));
		Student st4 = new Student ("Migel", "Nova");
		st4.setAddress(new Address("Belarus", "Minsk", "Surganova", "1", 5));
		Student st5 = new Student ("Sanya", "Barzoi");
		st5.setAddress(new Address("Belarus", "Minsk", "Rublevka", "1"));
		
		Teacher th1 = new Teacher("Leonard", "Davinchi");
		Teacher th2 = new Teacher("Arnold", "Shvarc");
		Teacher th3 = new Teacher("Ntalia", "Averboox");
		Teacher th4 = new Teacher("Yugin", "Beer");
		Cleaner cl1 = new Cleaner("Tamara", "Ivanova");
		
		Group group = new Group();
		group.setnumber(123);
		group.setTeacher(th1);
		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addStudent(st4);
		st1.setisBudget(true);
		st1.setyearOfStudy(3);
		st1.setNationality("Belarus");
		System.out.println(group.getList());
		group.removeStudent(st2);
		System.out.println("checking for student removal\n");
		System.out.println(group.getList());
		System.out.println("checking for teacher removal\n");
		group.removeTeacher(th2);
		System.out.println(group.getList());
		System.out.println("checking for the output of all information about students\n");
		System.out.println(group.getFullListInformation());
		st1.setAverageScore(7.5);
		st2.setAverageScore(2.3);
		st3.setAverageScore(4.8);
		st4.setAverageScore(5.6);
		st5.setAverageScore(6.8);
		System.out.println("Adding information about students' current academic performance\n");
		System.out.println(Student.printAverageScore(st1));
		System.out.println("\n");
		th1.setExpirience(25);
		th1.setHoursWorked(50);
		th2.setExpirience(25);
		th2.setHoursWorked(50);
		th3.setExpirience(25);
		th3.setHoursWorked(50);
		th4.setExpirience(25);
		th4.setHoursWorked(50);
		th1.setAcademicDegree(true);
		th1.setSalary(BigDecimal.valueOf(1350.15));
		
		
		Department department = new Department();
		department.setDepartmentName("Department of IT Technologies");
		department.setHeadDepartment(th1);
		department.setViceHeadDepartment(th2);
		department.setCleaner(cl1);
		department.addTeacher(th3);
		System.out.println("creating a department and filling it with employees\n");
		System.out.println(department.getList());
		System.out.println("\n");
		System.out.println("adding information about the current staffing of the department\n");
		System.out.println(department.departmentStaffing());
		System.out.println("adding information about the current progress of the group\n");
		System.out.println(group.getAverageScore());
		System.out.println("\n");
		cl1.setSalary(BigDecimal.valueOf(1350.2));
		System.out.println("setting employee salaries");
		System.out.println("Salary cleaner " + cl1.salary + "\n");
		System.out.println("setting bonuses to employees through a separate class");
		System.out.println("Salary bonus teacher#1 " + AccountantUtil.SalaryBonus(th1) + "\n");
		System.out.println("Salary bonus cleaner#1 " + AccountantUtil.SalaryBonus(cl1) + "\n");
		System.out.println("Ñalculation of vacation pay cleaner#1 " + AccountantUtil.VacationPayEmployee(cl1) + "\n");
		th2.setSalary(BigDecimal.valueOf(1350.2));
		th3.setSalary(BigDecimal.valueOf(1350.2));
		th4.setSalary(BigDecimal.valueOf(1350.2));
		System.out.println("calculation of all costs for the department");
		System.out.println(department.allCostsForTheDepartment());
		
	
	
	
	
	}	
	





}
