package com.belhard.university;


public class Student {
	private static long counter;
	private int age;
	private long id;
	private int group;
	private String name;
	private String surname;
	private String faculty;

	public Student(String name, String surname) {
		id = ++counter;
		this.name = name;
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public long getId() {
		return id;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getGroup() {
		return group;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}
}
