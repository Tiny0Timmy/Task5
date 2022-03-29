package com.belhard.university;

import java.text.DecimalFormat;

public class Group {
	private int number;
	private int numberOfStudents;
	private Teacher teacher;
	private final Student[] students = new Student[8];

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents() {
		this.numberOfStudents = numberOfStudents;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public boolean addStudent(Student student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents++] = student;
			return true;
		}
		return false;
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
					students[i+1] = null;
				} else {
					students[i] = null;
				}
			}
			if (removed) {
				numberOfStudents--;
			}
		}
		return removed;
	}
	
	DecimalFormat dF = new DecimalFormat("0000");
	
	public String getList() {
		String list = "Group #" +number+ "\n";
		list+= "Teacher: "+dF.format(teacher.getId())+" "+teacher.getName()+" "+teacher.getSurname()+"\n";
		list+= "Students:\n";
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student==null) {
				break;
			}
			list +=(i+1)+" id"+ dF.format(student.getId())+" "+student.getName()+" "+student.getSurname()+"\n";
		}
		list += "Total number of students: "+getNumberOfStudents()+"\n*****************************";
		return list;
	}
}

