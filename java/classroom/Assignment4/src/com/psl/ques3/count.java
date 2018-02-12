package com.psl.ques3;

public class count {

	static void check(String sentence, String word) {
		int count = 0;

		String[] str = sentence.split("\\s+");

		for (int i = 0; i < str.length; i++) {

			if (word.equals(str[i])) {
				count++;
				//System.out.println(count);
			}
		}
		System.out.println("Frequency of   : " + count);
		// return count;
	}

	public static void main(String[] args) {

		String s = "i have a cat my cat is black in color";
		String w = "cat";
		System.out.println(s);
		check(s, w);

	}

}
