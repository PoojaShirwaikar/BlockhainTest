package com.psl.ques2;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MoviesList {
	
	
	public void sortByLanguage(List<Movie> list)
	  {
		  Collections.sort(list);
			System.out.println("Sorting based on language using comparable: "
					+ list);
		 
	  }
	  public void sortByDuration(List<Movie> list) 
	  {
		  Collections.sort(list, new SortByDuration());
			System.out.println("Sorting based on Duration using comparator: "
					+ list);
	  }
	  public void sortByDirector(List<Movie> list) 
	  {
		  Collections.sort(list, new SortDirector());
			System.out.println("Sorting based on Director using comparator: "
					+ list);

	  }
	  
	  
	  public void SortByLanguageAndReleaseDate(List<Movie> list)
	  {

			Collections.sort(list, new SortByLanguageReleaseDate());
			System.out.println("Sorting based on Release Date using comparator: "
					+ list);

		  
	  }
	  
	  

	  public List<Movie> createMovieList() 
	  {
			List<Movie> list = new ArrayList<Movie>();
			Movie m1 = new Movie("golmaal", "hindi", "rohit", "shetty", 1,
					new Date(15, 9, 2012));
			Movie m2 = new Movie("xxxxx", "marathi", "asasa", "shetty", 2,
					new Date(10, 9, 2012));
			Movie m3 = new Movie("abcds", "marathi", "asasa", "shetty", 2,
					new Date(9, 9, 2012));
		  	list.add(m1);
			list.add(m2);
			list.add(m3);
			return list;
		  
	  }
	  

	public static void main(String[] args) {

		MoviesList obj= new MoviesList();
		List<Movie> list ;
		list=obj.createMovieList();
		obj.sortByDirector(list);
		obj.sortByDuration(list);
		obj.sortByLanguage(list);
		obj.SortByLanguageAndReleaseDate(list);

		
		
		
		 


		

		
		
		
	}
}
