package com.psl.ques1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cities {
	int cityId;
	String cityName;
	String cityInfo;

	public Cities(int cityId, String cityName, String cityInfo) {
		// TODO Auto-generated constructor stub
		this.cityId = cityId;
		this.cityName = cityName;
		this.cityInfo=cityInfo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "City Id: " + cityId + " City name: " + cityName;
	}

}
