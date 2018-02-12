package com.psl.ques4;


public class Cities {
	int cityId;
	String cityName;

	public Cities(int cityId, String cityName) {
		// TODO Auto-generated constructor stub
		this.cityId = cityId;
		this.cityName = cityName;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "City Id: " + cityId + " City name: " + cityName;
	}

	public int compareTo(Cities cities) {
		// TODO Auto-generated method stub
		return 0;
	}

	
/*
	@Override
	public int compareTo(Cities o) {
		// TODO Auto-generated method stub
		if(getCityId()>o.getCityId())
			return -1;
		else if(getCityId()<o.getCityId())
			return 1;
		else
			return 0; 
	}
	*/
	


}
