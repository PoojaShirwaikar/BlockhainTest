package com.psl.ques2;

public class Question2 {

	public static int findPosition(int num, int[] nos) {

		int length = nos.length;

		for (int i = 0; i < length; i++) {
			if (nos[i] == num)
				return i + 1;

		}

		return -1;
	}

	public static void main(String[] args) {

		int nos[] = { 12, 45, 38, 70, 77 };
		int n = 12;
		//Question2 f = new Question2();
		int r = Question2.findPosition(n, nos);

		if (r == -1)
			System.out.println("Number not available in the given array");
		else
			System.out.println("Number available at position " + r
					+ " in the given array");

	}

}
