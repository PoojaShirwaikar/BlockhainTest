package com.psl.demo;
import com.psl.Employee.Developer;
import com.psl.Vehicle.AudiR;


public class Client {

	public static void main(String[] args){
		Printable p = new Developer();
		AmirKhan a = new Developer();
		a.Acting();
		p.print();
		p = new AudiR();
		p.print();
	}
	
}
