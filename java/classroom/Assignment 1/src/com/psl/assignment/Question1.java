package com.psl.assignment;

public class Question1 {
	
	private boolean result;
	static String productNames[]; 
	
	static String[] initProductNames(){
		 productNames=new String[5];
		
		
		 productNames[0]="samsung";
		 productNames[1]="motorola";
		 productNames[2]="nokia";
		 productNames[3]="vivo";
		 productNames[4]="redmi";
		 
		 return productNames;
	}

	static boolean isPresent(String[] productNames, String keyword){
		int count=0, c=0;
		
		while(count<productNames.length){
			if(productNames[count].equals(keyword)){
				c=1;
				break;
			}
			count++;
		}
		
		if(c==1)	
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		
		Question1 obj=new Question1();

		obj.result=Question1.isPresent(Question1.initProductNames(),"sony");
		
		
		if(obj.result)
			System.out.println("Available");
		else 
			System.out.println("Not Available");
		
		
	}
	
}
