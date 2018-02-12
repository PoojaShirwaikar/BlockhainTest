package com.psl.service;

import java.util.List;

import com.psl.beans.Transaction;
import com.psl.beans.User;
import com.psl.dao.ITransactionDAO;

public class TransactionService {
	private ITransactionDAO dao;

	public ITransactionDAO getDao() {
		return dao;
	}

	public void setDao(ITransactionDAO dao) {
		this.dao = dao;
	}

	public void createUser(User u) {
		// TODO Auto-generated method stub
		dao.createUser(u);

	}

	public void withdraw(User u, int amount) {
		// TODO Auto-generated method stub
		dao.withdraw(u, amount);

	}

	public void deposit(User u, int amount) {
		// TODO Auto-generated method stub
		dao.deposit(u, amount);

	}

	public List<Transaction> ministatement(User u) {
		// TODO Auto-generated method stub
		return dao.ministatement(u);
	}

}
