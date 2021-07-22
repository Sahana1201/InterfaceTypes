package com.xworkz.cloneinterface.Example;

import java.util.Arrays;

public class Student implements Cloneable {

	String stdName = "sahana";
	int stdAge = 15;
	public static final Subject subject1 = new Subject();
	public static final Subject2 subject2 = new Subject2();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	

}
