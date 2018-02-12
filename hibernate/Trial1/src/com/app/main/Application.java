package com.app.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.app.model.Address;
import com.app.model.Student;

public class Application {
	public static void main(String[] args) {
		List<Student> stud = populateEmployee();

		SessionFactory sessionFactory = new Configuration().configure(
				"hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// update
		/*
		 * Student emp = (Student) session.get(Student.class, 3);
		 * emp.setSkills("IoT,Node.js"); session.update(emp);
		 */

		// read
		// Student emp = (Student) session.get(Student.class, 1);

		// delete
		// Student emp = (Student) session.get(Student.class, 2);
		// session.delete(emp);

		// create

		for (Student s : stud) {
			session.save(s);
		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

	private static List<Student> populateEmployee() {
		// TODO Auto-generated method stub

		List<Student> s = new ArrayList<Student>();
		Student s1 = new Student();

		return s;
	}
}
