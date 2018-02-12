package com.psl.ques7;


import java.util.ArrayList;
import java.util.List;

public class Thread100 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		long a=System.nanoTime();
		
		for(int i=1; i<=1000; i++)
		{
			list.add(i);
		}
		
		long b=System.nanoTime();
		
		long diff=b-a;
		
		System.out.println("The difference between the start time and end time of the process: "+diff);

		
	}
}
