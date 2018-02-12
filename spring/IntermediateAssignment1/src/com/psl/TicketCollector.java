package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;

public class TicketCollector {
	public void checkTickets() {
		System.out.println("checking the tickets");
	}

	public void printList() {
		System.out.println("printing passenger list");
	}

	public void collectFine() {
		System.out.println("collecting fine from defaulters");
	}

	public void record(ProceedingJoinPoint jp) {
		// before
		System.out.println("printing passenger list");

		// during
		try {
			jp.proceed();
			System.out.println("checking the tickets");
			// throw new Exception("defaulters ");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("collecting fine from defaulters");
			e.printStackTrace();
		}

		// after
		System.out.println("Train reaches Destination");

	}

}
