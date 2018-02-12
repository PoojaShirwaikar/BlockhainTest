package com.psl.ques1;

import java.sql.Date;

public class Stack {

	public final static int capacity = 2;
	public Contact[] s;
	int top;
	static Contact d;

	public Stack() {
		s = new Contact[capacity];
		top = -1;
	}

	public void push(Contact c) throws CheckDetails {

		// try {

		if (c == null || top == capacity - 1) {

			throw new CheckDetails("Stack Overflow");

		} else {

			top++;
			s[top] = c;

		}

		// } catch (StackOverflowException e) {
		// e.printStackTrace();
		// }
	}

	public Contact pop() throws CheckDetails {

		// try {

		if (s == null || top == -1) {

			throw new CheckDetails("Stack Empty");
		} else {

			d = s[top];
			top--;
			return d;
		}
		// return d;

		// } catch (StackEmptyException e) {

		// e.printStackTrace();
		// }

	}

	public void display() {
		// System.out.println("hello");
		for (int i = top; i > -1; i--) {
			System.out.println(s[i].first_name + " " + s[i].last_name);
		}

	}

	public static void main(String[] args) {

		Stack obj = new Stack();
		Contact c;

		// Stack obj = null;

		try {

			if (obj != null) {
				c = new Contact("pooja", "shirwaikar", "pooja@shirwaikar.com",
						new Date(8, 11, 1995), 15798, 48747l);

				// d = obj.pop();

				c.validate();
				obj.push(c);
				obj.display();

				c = new Contact("ab", "pgrs", "pooja@shirwaikar.com", new Date(
						8, 11, 1995), 15798, 48747l);

				obj.push(c);
				obj.display();

				c = new Contact("abcd", "pqr", "pooja@shirwaikar.com",
						new Date(8, 11, 1995), 15798, 48747l);
				obj.push(c);

				obj.display();

				// d = obj.pop();
				// obj.display();

			} else {
				throw new CheckDetails("Stack uninitialised");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}