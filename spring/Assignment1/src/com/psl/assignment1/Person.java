package com.psl.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	@Value("pooja")
	private String pname;
	@Value("22")
	private String age;
	@Autowired
	@Qualifier("ticket2")
	private Ticket ticket;

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + ", ticket=" + ticket
				+ "]";
	}

	public Person(String pname, String age, Ticket ticket) {
		System.out.println("person parametrised constructor");
		this.pname = pname;
		this.age = age;
		this.ticket = ticket;
	}

	public Person() {
		System.out.println("person default constructor");

	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}