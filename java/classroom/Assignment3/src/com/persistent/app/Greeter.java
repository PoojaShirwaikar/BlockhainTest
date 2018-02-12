package com.persistent.app;

public class Greeter extends Advisor {
	
	String name="xyz";
	
	public  Greeter(String name)
	{	
		this.name=name;
	}
	
	public void sayHello(){	
		System.out.println("Hello "+name);		
	}
	
	public void sayGoodBye(){
		System.out.println("GoodBye "+name);
	}
}
