package com.persistent.app1;
import esg.itp.shape.*;

public class Question2 {
	
	public static void main(String[] args){
		
		Square s = new Square(8.0f);
		Rectangle r = new Rectangle(8.0f,4.0f);
		
		s.calcArea();
		s.calcPeri();
		s.display();
		
		r.calcArea();
		r.calcPeri();
		r.display();
	}
}
