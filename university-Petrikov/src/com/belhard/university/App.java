package com.belhard.university;


public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student("James", "DiGreez");
		Student s2 = new Student("Bolivar", "DiGreez");
		Student s3 = new Student("Mark","Brown");
		Student s4 = new Student("Stiv","Hampton");
		Student s5 = new Student("Tom", "Anderson");
		Student s6 = new Student("John", "Smith");
		Student s7 = new Student("Ann","White");
		Student s8 = new Student("Mary","Green");
		Teacher t1 = new Teacher("Jim", "DiGreez");
		Teacher t2 = new Teacher("Robert","Stark");
		
		Group group = new Group();
		
		group.setNumber(113);
		
		group.addStudent(s1);
		group.addStudent(s2);
		group.addStudent(s3);
		group.setTeacher(t1);
		group.setTeacher(t2);
		
		System.out.println(group.getList());
		
		group.removeStudent(s2);
		
		System.out.println(group.getList());
		
		group.addStudent(s4);
		group.addStudent(s5);
		group.addStudent(s6);
		group.addStudent(s7);
		
		System.out.println(group.getList());
		
		
		
		
	}
}