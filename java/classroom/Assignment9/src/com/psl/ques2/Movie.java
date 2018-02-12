package com.psl.ques2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie implements Comparable<Movie>{

	String name, language, director, producer;
	int duration;
	Date releaseDate;

	
	public Movie(String name, String language, String director,
			String producer, int duration, Date releaseDate) {
		this.name=name;
		this.language=language;
		this.director=director;
		this.producer=producer;
		this.duration=duration;
		this.releaseDate=releaseDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Movie: " + name + " " + language + " "
		+ director +" "+ duration+" "+ releaseDate;
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.language.compareTo(o.language);

		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((director == null) ? 0 : director.hashCode());
		result = prime * result + duration;
		result = prime * result
				+ ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((producer == null) ? 0 : producer.hashCode());
		result = prime * result
				+ ((releaseDate == null) ? 0 : releaseDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (duration != other.duration)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		return true;
	}

	
	
	

}
