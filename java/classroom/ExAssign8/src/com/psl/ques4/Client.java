package com.psl.ques4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Client {

	public Set<Student> readFile(String filename) {
		Set<Student> set1 = new HashSet<Student>();

		File f1 = new File(filename);
		//int count = 0;

		try {
			FileInputStream fis = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student c = null;
			while (fis.available() > 0) {
				// count++;
				c = new Student();
				c = (Student) ois.readObject();
				set1.add(c);
				// System.out.println(set1);

			}

			// System.out.println(count);
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

		return set1;
	}

	public Map<Character, Set<Student>> sortStudentsAsPerGrade(
			Set<Student> students) {

		Map<Character, Set<Student>> smap = new TreeMap<Character, Set<Student>>();

		for (Student student : students) {
			if (smap.containsKey(student.getGrade())) {
				
				for (java.util.Map.Entry<Character, Set<Student>> s : smap.entrySet()) {
					if(s.getKey().equals(student.getGrade()))
					{
						s.getValue().add(student);
					}
				}
				

			} else {
				Set<Student> sets = new HashSet<Student>();
				sets.add(student);
				smap.put(student.getGrade(), sets);
			}
		}

		return smap;

	}

	public static void main(String[] args) {
		List<Student> s1 = new ArrayList<Student>();
		Set<Student> set = new HashSet<Student>();
		Map<Character, Set<Student>> map = new TreeMap<Character, Set<Student>>();
		Student s = null;
		Client c = new Client();
		File f = new File("data.txt");

		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String str = null;

			while ((str = br.readLine()) != null) {
				s = new Student();
				String[] a = str.split(",");
				s.setRollNo(Integer.parseInt(a[0]));
				s.setName(a[1]);
				s.setStandard(Integer.parseInt(a[2]));
				s.setGrade(a[3].charAt(0));

				s1.add(s);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File f1 = new File("dataser.ser");
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

			for (Student stud : s1) {
				try {
					oos.writeObject(stud);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println("serialization done");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		set = c.readFile("dataser.ser");
		System.out.println("\nAfter deserialisation");
		for (Student student : set) {
			System.out.println(student);
		}
		
		map=c.sortStudentsAsPerGrade(set);
		System.out.println("\ndisplay map:");
		System.out.println(map);

	}

}
