package com.psl.vehicle;

public class Vehicle {

	public Vehicle() {
		// TODO Auto-generated constructor stub

		System.out.println("vehicle");
	}

}

class FourWheeler extends Vehicle {

	public FourWheeler() {
		// TODO Auto-generated constructor stub
		System.out.println("FourWheeler");

	}

}

class TwoWheeler extends Vehicle {

	public TwoWheeler() {
		// TODO Auto-generated constructor stub
		System.out.println("TwoWheeler");

	}

}

class AudiQ7 extends FourWheeler {

	public AudiQ7() {
		// TODO Auto-generated constructor stub
		System.out.println("AudiQ7");

	}

}
