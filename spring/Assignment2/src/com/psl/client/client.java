package com.psl.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Transaction;
import com.psl.beans.User;
import com.psl.service.TransactionService;

public class client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		TransactionService t = context.getBean("service",
				TransactionService.class);
		User u = context.getBean("user", User.class);
		// t.createUser(u);
		 t.deposit(u, 10000);
		 t.withdraw(u, 10000);
		List<Transaction> list = t.ministatement(u);
		for (Transaction transaction : list) {
			System.out.println(transaction);
		}

	}

}