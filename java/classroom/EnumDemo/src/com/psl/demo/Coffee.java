package com.psl.demo;

public enum Coffee {

	small(50), regular(80), large(100);

	int price;

	private Coffee(int p) {
		// TODO Auto-generated method stub
		price = p;
	}
	
	public int getPrice(){
		return price;
	}
}
