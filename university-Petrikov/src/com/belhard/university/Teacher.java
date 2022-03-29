package com.belhard.university;

public class Teacher {
	private static long counter;
	private int age;
	private long id;
	private String name;
	private String surname;

	public Teacher(String name, String surname) {
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

	public String toString() {
		return "Teacher name is " + name + " Teacher id is " + id;
	}
}
