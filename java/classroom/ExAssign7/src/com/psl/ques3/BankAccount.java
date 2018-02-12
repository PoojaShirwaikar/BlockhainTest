package com.psl.ques3;

public class BankAccount {
	float balance;
	float amt;
	String type;

	// BankAccount acc=new BankAccount();

	public BankAccount(float a, String b) {
		// TODO Auto-generated constructor stub
		balance = a;
		type = b;
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	float getBalance() {
		return balance;
	}

	void deposit(float amt) throws InvalidAmount {

		if (amt < 0) {
			throw new InvalidAmount();
		}
		balance = balance + amt;

	}

	void withdraw(float amt) throws InvalidAmount, InsufficientFunds,
			LowBalanceException {

		if( (this.type == "savings" && this.balance < 1000.0f)|| (this.type == "current" && this.balance < 5000.0f) ){
			throw new InsufficientFunds();
		}

		if (amt < 0) {
			throw new InvalidAmount();
		}
		balance = balance - amt;

		if (this.balance < 1000.0f) {
			throw new LowBalanceException();
		}

	}

	public static void main(String[] args) {
		 BankAccount acc = new BankAccount(100.0f,"savings");
		BankAccount acc1 = new BankAccount(5000.0f, "current");

		try {
			// acc.deposit(-10);
		//	acc1.withdraw(4500.0f);
			 acc.withdraw(10);
		} catch (InvalidAmount | InsufficientFunds | LowBalanceException e) {
			e.printStackTrace();

		}

	}

}
