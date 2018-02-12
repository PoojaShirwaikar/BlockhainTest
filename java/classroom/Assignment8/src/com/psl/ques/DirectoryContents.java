package com.psl.ques;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DirectoryContents {
	static Map<String, List> map = new TreeMap<String, List>();

	private static void displayFolderContents(File curDir) {
		List<String> l = new ArrayList<String>();

		File[] filesList = curDir.listFiles();

		for (File f : filesList) {
			if (f.isDirectory()) {
				displayFolderContents(f);
			}
			if (f.isFile()) {
				System.out.println(f.getName());
				l.add(f.getName());
				map.put(f.getParent(), (ArrayList<String>) l);
			}
		}

	}

	public static boolean searchFile(File path, String filename) {
		File[] filesList = path.listFiles();
		boolean b = false;

		for (File f : filesList) {
			if (f.isDirectory()) {
				b = searchFile(f, filename);
			} else if (filename.equalsIgnoreCase(f.getName())) {
				System.out.println(f.getName());
				System.out.println(filename);

				return true;

			}
		}
		return b;

	}

	public static int countWords(String str) {
		int count = 0;

		try {
			FileReader fr = new FileReader(str);
			BufferedReader br = new BufferedReader(fr);
			String line;
			line = br.readLine();
			while (line != null) {
				String[] parts = line.split(" ");
				for (String w : parts) {
					count++;
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;

	}

	public static void main(String[] args) {

		// File curDir = new File("C:\\java\\classroom\\Assignment8");
		File curDir = new File("C:\\Users\\Administrator\\Desktop\\folder");
		displayFolderContents(curDir);
		System.out.println(map);

		boolean b = searchFile(curDir, "filee.txt");
		System.out.println(b);
		if (b) {
			System.out.println("File found");
		} else {
			System.out.println("File not found");
		}

		int count = countWords("io.txt");
		System.out.println("Number of words: " + count);
	}

}
