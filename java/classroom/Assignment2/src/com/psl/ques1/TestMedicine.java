package com.psl.ques1;

public class TestMedicine {
	
	
	public static void main(String[] args){
				int choice;
		Medicine[] a = new Medicine[10];
		
		for(int i=0; i<10;i++)
		{
			 choice=1+(int)(Math.random()*3);
			
			switch(choice)
			{
			case 1:
				a[i]=new Tablet("crocine","verna");
				a[i].displayLabel();
				break;
				
			case 2:
				a[i]=new Tablet("Benadryl","verna");
				a[i].displayLabel();
				break;
				
			case 3:
				a[i]=new Tablet("volini","verna");
				a[i].displayLabel();					
			}			
		}		
	}
}
