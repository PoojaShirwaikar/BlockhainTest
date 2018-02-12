package com.psl.testdemo;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.psl.demo.Calculator;

public class TestCalculator {
	static Calculator c;
	
	@BeforeClass
	public static void Setup() {
		// TODO Auto-generated method stub
		c = new Calculator();
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		int actual=c.add(10, 10);
		
		Assert.assertEquals(20, actual);
		
	}
	
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		
		int actual=c.divide(10, 10);
		
		Assert.assertEquals(1, actual);
		
	}
	
	@AfterClass
	public static void tearDown() {
		// TODO Auto-generated method stub
		System.out.println("hello");

	}
	

}
