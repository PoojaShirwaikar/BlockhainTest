package com.persistent.app1;
import com.persistent.app.Greeter;


public class GreeterTest {
	
	public static void main(String[] args){
	
		Greeter a=null;

		for(int i=0; i<args.length;i++)
		{
			a= new Greeter(args[i]);
			a.sayHello();
		}
		
			String t=a.getAdvice();
			System.out.println(t);
			
			for(int i=args.length-1; i>=0; i--)
			{
				a=new Greeter(args[i]);
				a.sayGoodBye();
			}
				
		
		
	}
	
}
