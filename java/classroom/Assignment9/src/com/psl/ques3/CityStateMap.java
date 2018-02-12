package com.psl.ques3;

import java.util.Collection;
import java.util.Scanner;

public class CityStateMap {

	// static Scanner s = new Scanner(System.in);
	// static int choice = s.nextInt();

	String city, state;

	public CityStateMap(String city, String state) {
		// TODO Auto-generated constructor stub
		this.city = city;
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		// result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this.hashCode() == obj.hashCode()) {
			CityStateMap other = (CityStateMap) obj;
			this.state = other.state;
			return true;

		} else
			return false;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "City: " + city + " state: " + state;
	}

	public static void main(String[] args) {

		/*
		 * do {
		 * 
		 * System.out.println("Enter you choice");
		 * System.out.println("Enter 1.	Get all cities");
		 * System.out.println("Enter 2.	Get All states");
		 * System.out.println("Enter 3.	Get cities for a state");
		 * System.out.println("Enter 4.	Add new city state pair"); System.out
		 * .println("Enter 5.	Delete all the cities for a given state");
		 * 
		 * switch (choice) { case 1: getcity(); break; case 2: getstate();
		 * break; case 3:cityforstate(); break; case 4:addnew(); break; case 5:
		 * 
		 * }
		 * 
		 * } while (choice != 6);
		 */
	}

}
