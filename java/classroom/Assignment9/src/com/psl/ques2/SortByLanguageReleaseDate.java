package com.psl.ques2;

import java.util.Comparator;

public class SortByLanguageReleaseDate implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		
		if(o1.language.equals(o2.language))
		{
			return o1.releaseDate.compareTo(o2.releaseDate);

		}
		
		return 0;
	}
}
