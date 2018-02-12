package com.psl.ques3;

import java.util.Comparator;

public class SortByName implements Comparator<Contact> {

	@Override
	public int compare(Contact o1, Contact o2) {
		// TODO Auto-generated method stub
		return o1.ContactName.compareTo(o2.ContactName);
	}
}
