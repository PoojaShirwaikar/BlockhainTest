package com.psl.beans;

public class User {

	private int id;
	private String name;
	private int accno;
	private int balance;

	public User() {
		System.out.println("user default");

	}

	public User(int id, String name, int accno, int balance) {
		System.out.println("user parametrized");
		this.id = id;
		this.name = name;
		this.accno = accno;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", accno=" + accno
				+ ", balance=" + balance + "]";
	}

}
