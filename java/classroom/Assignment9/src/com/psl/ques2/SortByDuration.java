package com.psl.ques2;

import java.util.Comparator;

public class SortByDuration implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		if (o1.duration > o2.duration)
			return 1;
		else if (o1.duration < o2.duration)
			return -1;
		else
			return 0;
		
	//	return o1.duration.compareTo(o2.duration);
	}
}
