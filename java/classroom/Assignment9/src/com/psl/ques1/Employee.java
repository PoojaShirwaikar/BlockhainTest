package com.psl.ques1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Employee {

	int employeeId;
	List<String> vehicleName=new ArrayList<String>();

	public Employee(int d, List<String> list) {
		employeeId = d;
		vehicleName.addAll(list);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "Employee id: "+employeeId+" vehicles: "+vehicleName;
	}
	
	


}
