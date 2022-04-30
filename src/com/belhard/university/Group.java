package com.belhard.university;

public class Group {
	private Teacher teacher;
	private final Student[] students = new Student[8];
	private int number;
	private int numberOfStudents;
	private double averageScore;

	
	

	public int getnumber() {
		return number;
	}

	public void setnumber(int number) {
		this.number = number;
	}

	public Teacher getteacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public boolean addStudent(Student student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents] = student;
			numberOfStudents++;
			return true;
		}
		return false;
	}

	public void removeTeacher(Teacher teacher) {
		this.teacher = null;
		this.setTeacher(teacher);
	}

	public boolean removeStudent(Student student) {
		boolean removed = false;
		for (int i = 0; i < numberOfStudents; i++) {
			Student elm = students[i];
			if (elm.getId() == student.getId()) {
				students[i] = null;
				removed = true;
			}
			if (removed) {
				if (i != numberOfStudents - 1) {
					students[i] = students[i + 1];
				} else {
					students[i] = null;
				}
			}
		}
		if (removed) {
			numberOfStudents--;
		}
		return removed;
	}

	public String getList() {
		String list = "*****Group #*****" + number + "\n";
		list += "Teacher: ";
		if (teacher != null) {
			list += "[id:" + teacher.getid() + "] " + teacher.getFirstName() + " " + teacher.getLastName() + "\n";
		} else {
			list += "TEACHER NOT APPOINTED\n";
		}
		list += "*****Students:*****\n";
		for (int i = 0; i < students.length; i++) {
				Student student = students[i];
				if (student == null) {
					break;
					
				} else {
				list += (i + 1) + ". [id:" + student.getId() + "] " + student.getfirstName() + " "	+ student.getlastName() + "\n";
		}
		}
		return list;
	}
	
	
	public String getFullListInformation() {
		String fullListInformation = "*****Group #*****" + number + "\n";
		fullListInformation += "Teacher: ";
		if (teacher != null) {
			fullListInformation += "[id:" + teacher.getid() + "] " + teacher.getFirstName() + " " + teacher.getLastName() + "\n";
		} else {
			fullListInformation += "TEACHER NOT APPOINTED\n";
		}
		fullListInformation += "*****Students:*****\n";
		for (int i = 0; i < students.length; i++) {
				Student student = students[i];
				if (student == null) {
					break;
					
				} else {
				fullListInformation += (i + 1) + ". [id:" + student.getId() + "] " + student.getfirstName() + " " + " "	+ student.getlastName() + " ";
				fullListInformation += student.getAddress() + " " + "Nationality: " + student.getNationality() + " " + "Years of study is: " + student.getyearOfStudy() + " " + "Budget: " + student.getisBudget() + "\n";
		}
		}
		return fullListInformation;
	}
	
	public String getAverageScore() {
		String list = "Average score of group# " + number + ":\n";
		double counter = 0;
		int counterStudent = 0;
		for (int i=0; i < students.length; i++) {
			Student student = students[i];
			if (student == null) {
				break;
			} else {
				counterStudent ++;
				counter += student.getAverageScore();
			}
			
		}
		averageScore = counter/counterStudent ;
		list += averageScore;
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
