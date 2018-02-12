package com.psl.ques4;

public class ReverseEachWord
{
	static void reverseEachWord(String input)
	{
		String[] words = input.split("\\s+");
		
		//String reverse = null;
		String reverse = "";

		
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			
			//String reverseWord = null;
			String reverseWord = "";

			
			for (int j = word.length()-1; j >= 0; j--) 
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			
			reverse = reverse + reverseWord + " ";
		}
		
		System.out.println("Input:");
		System.out.println(input);
		
		System.out.println("Output:");
		System.out.println(reverse);
		
	}
	
    public static void main(String[] args) 
    {
		
		reverseEachWord("To be or not to be ");
	}
}