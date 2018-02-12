package com.psl.dao;

import java.util.List;

import com.psl.beans.Transaction;
import com.psl.beans.User;

public interface ITransactionDAO {

	public void createUser(User u);

	public void withdraw(User u, int amount);

	public void deposit(User u, int amount);

	public List<Transaction> ministatement(User u);
}
