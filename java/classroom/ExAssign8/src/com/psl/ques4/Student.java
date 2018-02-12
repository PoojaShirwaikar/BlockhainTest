package com.psl.ques4;

import java.io.Serializable;

public class Student  implements Serializable{

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", standard="
				+ standard + ", grade=" + grade + "]";
	}
	private int rollNo;
	private String name;
	private int standard;
	private char grade;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}

}
