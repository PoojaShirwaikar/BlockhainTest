package com.psl.ques3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Contact implements Serializable, Comparable<Contact> {

	int contactID;
	String ContactName;
	String Email_Address;
	List<String> contactNumber;

	/*
	 * public Contact(int contactID,String ContactName,String
	 * Email_Address,List<String> contactNumber) { this.contactID = contactID;
	 * this.ContactName = ContactName; this.Email_Address = Email_Address;
	 * this.contactNumber = contactNumber;
	 * 
	 * }
	 */

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id " + getContactID() + " name " + getContactName();
	}

	public int getContactID() {
		return contactID;
	}

	public void setContactID(int contactID) {
		this.contactID = contactID;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public String getEmail_Address() {
		return Email_Address;
	}

	public void setEmail_Address(String email_Address) {
		Email_Address = email_Address;
	}

	public List<String> getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(List<String> contactNumber) {
		this.contactNumber = contactNumber;
	}

	ArrayList<Contact> addContact(Contact contact, ArrayList<Contact> contacts) {
		contacts.add(contact);
		System.out.println("added" + contacts);
		return contacts;
		// System.out.println(contact.toString());

	}

	List<Contact> Removecontact(Contact contact, List<Contact> contacts)
			throws ContactNotFoundException {

		if (!contacts.contains(contact)) {
			System.out.println("exception");
			throw new ContactNotFoundException();
		}

		contacts.remove(contact);
		System.out.println("After Deletion " + contacts.toString());
		return contacts;

		// System.out.println("deleted"+contacts1.ContactName);

	}

	Contact searchContactByName(String name, List<Contact> contact)
			throws ContactNotFoundException {

		Contact c2 = new Contact();
		int flag = 0;

		for (Contact contact2 : contact) {
			if (contact2.ContactName.equalsIgnoreCase(name)) {
				c2.setContactID(contact2.getContactID());
				c2.setContactName(name);
				c2.setEmail_Address(contact2.getEmail_Address());
				c2.setContactNumber(contact2.getContactNumber());
				flag = 1;
				break;
			}

		}

		if (flag == 0) {
			throw new ContactNotFoundException();
		}

		return c2;

	}

	ArrayList<Contact> SearchContactByNumber(String number,
			ArrayList<Contact> contact) throws ContactNotFoundException {

		ArrayList<Contact> contact1 = new ArrayList<Contact>();
		int flag = 0;
		for (Contact contact2 : contact) {

			contact1.add(contact2);

			if (contact2.contactNumber.contains(number)) {

				flag = 1;
				break;
			}
			if (flag == 1) {
				break;
			}

		}

		return contact1;

	}

	ArrayList<Contact> addContactNumber(int Id, String contactNo,
			ArrayList<Contact> contacts) {

		int flag = 0;
		for (Contact contact2 : contacts) {

			if (contact2.contactNumber.contains(contactNo)) {

				contact2.contactNumber.add(contactNo);
				flag = 1;
				break;
			}
			if (flag == 1) {
				break;
			}

		}

		System.out.println(contacts);

		return contacts;
	}

	void sortContactsByName(List<Contact> contacts) {
		Collections.sort(contacts, new SortByName());
		System.out.println(contacts);
	}

	void readContactsFromFile(ArrayList<Contact> contacts, String fileNAme) {
		File f = new File(fileNAme);
		Contact c = null;
		ArrayList<String> contactNumber1;
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String str = null;

			while ((str = br.readLine()) != null) {
				String[] a = str.split(",");
				c = new Contact();
				// System.out.println(a.length);
				c.setContactID(Integer.parseInt(a[0]));
				c.setContactName(a[1]);
				c.setEmail_Address(a[2]);
				System.out.println(str);
				contactNumber1 = new ArrayList<String>();

				for (int i = 3; i < a.length; i++) {

					contactNumber1.add(a[i]);

				}
				c.setContactNumber(contactNumber1);
				// System.out.println("contatc"+c);

				// System.out.println(list1);
				contacts = addContact(c, contacts);
				// System.out.println("here"+list1);

			}
			// c.setContactID();

			// System.out.println("file"+list.toString());
			// System.out.println("file"+list1.toString());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void serializeContactDetails(ArrayList<Contact> contacts, String filename) {
		File f = new File(filename);
		Contact c = null;
		ArrayList<String> contactNumber1;
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String str = null;

			while ((str = br.readLine()) != null) {
				String[] a = str.split(",");
				c = new Contact();
				// System.out.println(a.length);
				c.setContactID(Integer.parseInt(a[0]));
				c.setContactName(a[1]);
				c.setEmail_Address(a[2]);
				System.out.println(str);
				contactNumber1 = new ArrayList<String>();

				for (int i = 3; i < a.length; i++) {

					contactNumber1.add(a[i]);

				}
				c.setContactNumber(contactNumber1);
				// contacts = addContact(c, contacts);
				contacts = addContact(c, contacts);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File f1 = new File("contactserialize.ser");
		if (!f1.exists()) {
			System.out.println("file doesnt exist");

			try {
				f1.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(f1);

			oos = new ObjectOutputStream(fos);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (Contact cont : contacts) {

			try {
				oos.writeObject(cont);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("done");

	}

	ArrayList<Contact> deserializeContact(String filename) {

		ArrayList<Contact> list = new ArrayList<Contact>();

		File f1 = new File(filename);
		//int count = 0;

		try {
			FileInputStream fis = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (fis.available() > 0) {
				//count++;

				Contact c = (Contact) ois.readObject();
				list.add(c);

			}
			//System.out.println(count);
			// return list;

			// System.out.println("done");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	Set<Contact> populateContactFromDb() {

		Set<Contact> sets = new TreeSet<Contact>();
		Contact c = new Contact();

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/contactdb", "root", "root");

			Statement stmt = con.createStatement();

			String quesry1 = "Select * from contact_tbl ";
			ResultSet rs = stmt.executeQuery(quesry1);

			while (rs.next()) {

				c.setContactID(rs.getInt(1));
				c.setContactName(rs.getString(2));
				c.setEmail_Address(rs.getString(3));

				// System.out.println(rs.getInt(1) + " " + rs.getString(2) +
				// " "+ rs.getString(3) + " " + rs.getString(4));

				List<String> l = new ArrayList<String>();

				String s = rs.getString(4);
				// System.out.println(s);

				if (s != null) {
					String[] a = s.split(",");

					for (int i = 0; i < a.length; i++) {
						l.add(a[i]);

					}
					c.setContactNumber(l);

				}
				sets.add(c);

				// System.out.println(sets);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sets;
	}

	Boolean addContacts(List<Contact> existingContact, Set<Contact> newContacts) {
		existingContact.addAll(newContacts);
		return true;

	}

	public static void main(String[] args) {

		ArrayList<Contact> list1 = new ArrayList<Contact>();
		ArrayList<String> contactNumber1;
		Set<Contact> set = new TreeSet<Contact>();

		Scanner sc = new Scanner(System.in);
		Contact c = null;
		int choice = 0;

		do {
			System.out.println("Enter 1. Add Contact");
			System.out.println("Enter 2. Remove contact");
			System.out.println("Enter 3. search Contact By Name");
			System.out.println("Enter 4. partial input");
			System.out.println("Enter 5. addContactNumber");
			System.out.println("Enter 6. sortContactsByName");
			System.out.println("Enter 7. readContactsFromFile");
			System.out.println("Enter 8. serializeContactDetails");
			System.out.println("Enter 9. deserializeContact");
			System.out.println("Enter 10. populateContactFromDb");
			System.out.println("Enter 11. add Contacts from db to list");
			System.out.println("Enter 12. to exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				c = new Contact();

				System.out.println("Enter id");
				int id = sc.nextInt();
				c.setContactID(id);

				System.out.println("Enter name");
				String s = sc.next();
				c.setContactName(s);

				System.out.println("Enter email address");
				String s1 = sc.next();
				c.setEmail_Address(s1);

				System.out
						.println("Enter how many contact numbers you want to add");
				int n = sc.nextInt();

				contactNumber1 = new ArrayList<String>();
				for (int i = 0; i < n; i++) {
					System.out.println("Enter contact number");
					String cn = sc.next();
					contactNumber1.add(cn);
				}
				c.setContactNumber(contactNumber1);

				list1 = c.addContact(c, list1);
				break;

			case 2:
				c = new Contact();
				System.out.println("Enter id you want to delete");
				int id1 = sc.nextInt();
				c.setContactID(id1);

				/*
				 * if(c.contactID==id1) {
				 */
				try {

					list1 = (ArrayList<Contact>) c.Removecontact(c, list1);
				} catch (ContactNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*
				 * } else {
				 * 
				 * }
				 */

				break;

			case 3:
				c = new Contact();
				Contact c1 = new Contact();

				System.out.println("Enter name to be searched");
				String sr = sc.next();

				try {

					c1 = c.searchContactByName(sr, list1);
					System.out.println(c1);
				} catch (ContactNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 4:
				c = new Contact();

				System.out.println("Enter a number");
				String i = sc.next();

				try {
					list1 = c.SearchContactByNumber(i, list1);
					System.out.println(list1);
				} catch (ContactNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 5:

				c = new Contact();

				System.out.println("Enter contact id");
				int id11 = sc.nextInt();

				System.out.println("Enter a number");
				String ii = sc.next();

				list1 = c.addContactNumber(id11, ii, list1);
				break;

			case 6:
				c = new Contact();
				c.sortContactsByName(list1);

				break;

			case 7:
				c = new Contact();
				c.readContactsFromFile(list1, "Contact.txt");
				break;

			case 8:
				c = new Contact();

				c.serializeContactDetails(list1, "contact1.txt");

				break;

			case 9:
				c = new Contact();

				list1 = c.deserializeContact("contactserialize.ser");
				System.out.println("Deserialized file" + list1);
				break;

			case 10:
				c = new Contact();
				set = c.populateContactFromDb();
				break;

			case 11:
				c = new Contact();
				boolean b = c.addContacts(list1, set);
				if (b) {
					System.out.println("successfull");

				} else {
					System.out.println("unsuccessfull");

				}

			}

		} while (choice != 12);

	}

	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		if (this.contactID > o.contactID)
			return 1;
		else if (this.contactID < o.contactID)
			return -1;
		else
			return 0;
	}
}
