package com.psl.beans;

public class Transaction {
	// private int id;
	// private int tid;
	private User user;
	private int amt;
	private String action;

	public User getU() {
		return user;
	}

	public void setU(User user) {
		this.user = user;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Transaction() {
		System.out.println("default transaction");

	}

	public Transaction(User user, int amt, String action) {
		System.out.println("parametrized transaction");
		this.user = user;
		this.amt = amt;
		this.action = action;
	}

	@Override
	public String toString() {
		return "Transaction [u=" + user + ", amt=" + amt + ", action=" + action
				+ "]";
	}

}
