package com.belhard.university;

import java.math.BigDecimal;

public class Department {
	
	private Teacher headDepartment;
	private Teacher viceHeadDepartment;
	private Cleaner cleaner;
	private final Teacher[] teachers = new Teacher[8];
	private String DepartmentName;
	private int numberOfTeachers;

	
	
	
	public Teacher getHeadDepartment() {
		return headDepartment;
	}
	public void setHeadDepartment(Teacher headDepartment) {
		this.headDepartment = headDepartment;
	}
	public Teacher getViceHeadDepartment() {
		return viceHeadDepartment;
	}
	public void setViceHeadDepartment(Teacher viceHeadDepartment) {
		this.viceHeadDepartment = viceHeadDepartment;
	}
	public Cleaner getCleaner() {
		return cleaner;
	}
	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.DepartmentName = departmentName;
	}
	

	public boolean addTeacher(Teacher teacher) {
		if (numberOfTeachers < teachers.length) {
			teachers[numberOfTeachers] = teacher;
			numberOfTeachers++;
			return true;
		}
		return false;
	}
	
	public String getList() {
		String list = "**********" + DepartmentName + "**********" + "\n";
		
		list += "Head department: ";
		if (headDepartment != null) {
			list += "[id:" + headDepartment.getid() + "] " + headDepartment.getFirstName() + " " + headDepartment.getLastName() + "\n";
		} else {
			list += "Head department NOT APPOINTED\n";
		}
		
		list += "Vice head department: ";
		if (viceHeadDepartment != null) {
			list += "[id:" + viceHeadDepartment.getid() + "] " + viceHeadDepartment.getFirstName() + " " + viceHeadDepartment.getLastName() + "\n";
		} else {
			list += "Vice head department NOT APPOINTED\n";
		}
		
		list += "Cleaner department: ";
		if (cleaner != null) {
			list += cleaner.getFirstName() + " " + cleaner.getLastName() + "\n";
		} else {
			list += "Cleaner department NOT APPOINTED\n";
		}
		
		list += "*****Teachers:*****\n";
		for (int i = 0; i < teachers.length; i++) {
				Teacher teacher = teachers[i];
				if (teacher == null) {
					break;
					
				} else {
				list += (i + 1) + ". [id:" + teacher.getid() + "] " + teacher.getFirstName() + " "	+ teacher.getLastName() + "\n";
		}
		}
		return list;
	}
	
	
	public String departmentStaffing() {
		String list = "**********" + DepartmentName + "**********" + "\n";
		list += "current staffing of the department: " + "\n";
		if (headDepartment != null) {
		list += "Head department: Assigned" + "\n";
		} else {
		list += "Head department: NOT Assigned" + "\n";
		}
		
		if (viceHeadDepartment != null) {
		list += "Vice Head department: Assigned" + "\n";
		} else {
		list += "Vice Head department: NOT Assigned" + "\n";
		}
		
		if (cleaner != null) {
		list += "Cleaner: Assigned" + "\n";
		} else {
		list += "Cleaner: NOT Assigned" + "\n";
		}
		
		list += "*****Teachers:*****\n";
		for (int i = 0; i < teachers.length; i++) {
			Teacher teacher = teachers[i];
			if (teacher == null) {
				break;
				
			} else {
			list += (i + 1) + "/8";
	}
	}
		
		return list;
	}
	
	
	public String allCostsForTheDepartment() {
		BigDecimal cost = new BigDecimal(0);
		String list = "**********" + "All costs for the department" + "**********" + "\n";
		list += "**********" + DepartmentName + "**********" + "\n";
		if (headDepartment != null) {
			cost = headDepartment.getSalary().add(AccountantUtil.SalaryBonus(headDepartment));
		} else {
			
		}
		list += cost;
		
		if (viceHeadDepartment != null) {
			BigDecimal ssss = new BigDecimal(0);
			ssss = viceHeadDepartment.getSalary().add(AccountantUtil.SalaryBonus(viceHeadDepartment));
			cost = cost.add(ssss);
		} else {
			
		}
		list += cost;
		
		for (int i = 0; i < teachers.length; i++) {
			Teacher teacher = teachers[i];
			if (teacher == null) {
				break;
			} else {
				cost = cost.add(teacher.getSalary().add(AccountantUtil.SalaryBonus(teacher)));
			}
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
