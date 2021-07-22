package com.xworkz.cloneinterface.Example;

public class StudentTester {

	public static void main(String[] args) throws CloneNotSupportedException {

		Subject subject1 = new Subject();
		System.out.println("Subject1 details" + subject1.subject1);
		subject1.stdName = "sahana";
		System.out.println("Student name:-" + subject1.stdName);
		subject1.stdAge = 15;
		System.out.println("Student age :-" + subject1.stdAge);
		System.out.println("Hashcode of Student1:-" + subject1.hashCode());

		Subject2 subject2 = new Subject2();
		System.out.println("Subject2 details" + subject2.subject2);
		subject2.stdName = "teju";
		System.out.println("Student name:-" + subject2.stdName);
		subject2.stdAge = 16;
		System.out.println("Student age :-" + subject2.stdAge);
		System.out.println("Hashcode of Student2:-" + subject2.hashCode());

		Subject subject3 = subject1;
		System.out.println("Hashcode of subject 3:-" + subject3.hashCode());

	}

}