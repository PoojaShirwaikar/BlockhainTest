package com.psl.ques1;

import java.util.Scanner;

public class SumCalculator {

	public double sumOfFirstNOdd(int n) {
		double sum = 0.0;

		if (n < 0 || n != Math.ceil(n)) {
			try {
				throw new IllegalArgumentException();

			} catch (IllegalArgumentException | NumberFormatException e) {
				e.printStackTrace();
			}
		} else {
			sum = n * n;
			System.out.println(sum);


			/*
			 * for (int i = 0; i < 2*n; i++) { if(i%2==0) continue; else
			 * sum=sum+i; }
			 */

		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SumCalculator s = new SumCalculator();

		System.out.println("Enter n");
		int n = sc.nextInt();

		Double d = s.sumOfFirstNOdd(n);
	}

}
