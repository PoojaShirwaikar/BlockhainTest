package com.psl.ques5;

public class Question5 {

	String[][] a =  { { "x", "o", "o" }, { "o", "x", "o" },
			{ "x", "o", "x" } };
	
	
	public void checkwinner()
	{
		if(a[0][0]=="o" && a[0][1]=="o" && a[0][2]=="o")
			System.out.println("o wins");
		else if(a[1][0]=="o" && a[1][1]=="o" && a[1][2]=="o")
			System.out.println("o wins");
		else if(a[2][0]=="o" && a[2][1]=="o" && a[2][2]=="o")
			System.out.println("o wins");
		
		else if(a[0][0]=="o" && a[1][0]=="o" && a[2][0]=="o")
			System.out.println("o wins");
		else if(a[0][1]=="o" && a[1][1]=="o" && a[2][1]=="o")
			System.out.println("o wins");
		else if(a[0][2]=="o" && a[1][2]=="o" && a[2][2]=="o")
			System.out.println("o wins");
		
		else if(a[0][0]=="o" && a[1][1]=="o" && a[2][2]=="o")
			System.out.println("o wins");
		else if(a[0][2]=="o" && a[1][1]=="o" && a[2][0]=="o")
			System.out.println("o wins");
		
		
		
		else if(a[0][0]=="x" && a[0][1]=="x" && a[0][2]=="x")
			System.out.println("x wins");
		else if(a[1][0]=="x" && a[1][1]=="x" && a[1][2]=="x")
			System.out.println("x wins");
		else if(a[2][0]=="x" && a[2][1]=="x" && a[2][2]=="x")
			System.out.println("x wins");
		
		else if(a[0][0]=="x" && a[1][0]=="x" && a[2][0]=="x")
			System.out.println("x wins");
		else if(a[0][1]=="x" && a[1][1]=="x" && a[2][1]=="x")
			System.out.println("x wins");
		else if(a[0][2]=="x" && a[1][2]=="x" && a[2][2]=="x")
			System.out.println("x wins");
		
		else if(a[0][0]=="x" && a[1][1]=="x" && a[2][2]=="x")
			System.out.println("x wins");
		else if(a[0][2]=="x" && a[1][1]=="x" && a[2][0]=="x")
			System.out.println("x wins");
		
		else
			System.out.println("draw");
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Question5 obj= new Question5();	
		obj.checkwinner();
		
		
		

	}

}
