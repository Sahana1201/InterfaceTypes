package com.xworkz.cloneinterface.Example;

import java.util.Arrays;

public class Subject extends Student{
	
	String subjectName = "physics";
	int chapterNum = 2;
	
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", chapterNum=" + chapterNum + "]";
	}
	
	
	
	

}
