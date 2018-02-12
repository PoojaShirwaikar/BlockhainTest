package com.psl.exception;

public class UserDefException {

	private void validateAge(int age) throws InvalidAgeException {
		// TODO Auto-generated method stub

		// try {

		if (age < 18) {

			throw new InvalidAgeException("invalid age");
		} else {

			System.out.println("else");

		}
		/*
		 * } catch (InvalidAgeException e) { // TODO: handle exception
		 * e.printStackTrace(); }
		 */

	}

	public static void main(String[] args) {
		int age = 17;
		UserDefException obj = new UserDefException();

		System.out.println("before");
		
		assert age>18 :"Invalid age";
		
		System.out.println("after");

		
		try {
			obj.validateAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("All looks good");

	}

}
