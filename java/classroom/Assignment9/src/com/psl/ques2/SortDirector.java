package com.psl.ques2;

import java.util.Comparator;

public class SortDirector implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.director.compareTo(o2.director);
	}

}
