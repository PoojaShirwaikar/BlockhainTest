package com.psl.ques4;

import java.util.Comparator;


public class SortByValue implements Comparator<Cities>  {

	@Override
	public int compare(Cities o1, Cities o2) {
		// TODO Auto-generated method stub
		return o1.cityName.compareTo(o2.cityName);
	}

	
}
