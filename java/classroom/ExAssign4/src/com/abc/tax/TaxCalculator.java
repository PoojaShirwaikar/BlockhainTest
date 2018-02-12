package com.abc.tax;

import java.util.Scanner;

public class TaxCalculator {

	float basicSalary, nettSalary, tax;
	boolean citizenship;
	
	public TaxCalculator(float basicSalary, boolean citizenship) {
		// TODO Auto-generated constructor stub
		this.basicSalary=basicSalary;
		this.citizenship=citizenship;
		
		System.out.println("Basic salary "+basicSalary);
		
	}

	void calculateTax() {
		
		 tax = (30.0f * basicSalary) / 100.0f;

		System.out.println("The Tax is " + tax + " for the " + basicSalary);
		//return tax;
	}

	void deductTax() {
		 nettSalary = basicSalary - tax;

		System.out.println("The nettSalary is " + nettSalary);
	}

	void validateSalary() 
	{
		if(basicSalary>100000.0f && citizenship==true)
			System.out.println("The salary and citizenship eligibility criteria is satisfied");
		else
			System.out.println("The salary or citizenship eligibility criteria is not satisfied");

		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the basic salary: ");
		float str = s.nextInt();
		
		System.out.println("Enter the citizenship status(true/false): ");
		boolean str1 = s.hasNextBoolean();

		TaxCalculator t = new TaxCalculator(str,str1);
		t.calculateTax();
		t.deductTax();
		t.validateSalary();
		
		s.close();
		
		
	}
	
}
