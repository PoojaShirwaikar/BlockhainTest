package com.psl.ques1;

import java.io.*;
import java.util.*;

public class Movies {

	private static final String file = "movies.txt";

	public static void main(String[] args) {
		Language l[] = Language.values();

		BufferedReader br = null;
		FileReader fr = null;

		try {

			// br = new BufferedReader(new FileReader(file));
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String currentLine;

			while ((currentLine = br.readLine()) != null) {
				Integer id;

				String s[] = currentLine.split(",");

				try {
					id = Integer.parseInt(s[0]);

					if (s.length != 4) {
						throw new CheckDetails("Invalid Number Of Values");
					}

					int flag = 0;

					for (int i = 0; i < l.length; i++) {
						if (s[2].equalsIgnoreCase(l[i].toString())) {
							flag = 1;
							break;
						} else
							flag = 0;
					}

					if (flag == 0)
						throw new CheckDetails("Language not found");

				} catch (NumberFormatException e) {

					e.printStackTrace();

				}

				catch (CheckDetails e) {

					e.printStackTrace();

				}

				// System.out.println(currentLine);
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
