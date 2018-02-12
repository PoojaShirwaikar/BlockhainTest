package com.psl.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Vehicle> vList = new ArrayList<Vehicle>();
		List<FourWheeler> fList = new ArrayList<FourWheeler>();
		List<TwoWheeler> tList = new ArrayList<TwoWheeler>();
		List<AudiQ7> aList = new ArrayList<AudiQ7>();
		List<Employee> eList = new ArrayList<Employee>();


		vList.add(new Vehicle());
		fList.add(new FourWheeler());
		tList.add(new TwoWheeler());
		aList.add(new AudiQ7());

		showVehicle(vList);
		showVehicle(fList);
		showVehicle(tList);
		showVehicle(aList);
		showVehicle(eList);


	}

	private static void showVehicle(List<?> list) {
		// TODO Auto-generated method stub

	}

}
