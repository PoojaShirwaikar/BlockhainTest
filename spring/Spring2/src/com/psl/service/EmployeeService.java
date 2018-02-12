package com.psl.service;

import java.util.List;

import com.psl.beans.Employee;
import com.psl.dao.IEmpDAO;

public class EmployeeService {

	private IEmpDAO dao;

	public IEmpDAO getDao() {
		return dao;
	}

	public void setDao(IEmpDAO dao) {
		this.dao = dao;
	}

	public void createEmployee(Employee e) {
		dao.createEmployee(e);
	}
	public void updateEmployee(int id, String name) {
		dao.updateEmployee(id, name);
	}
	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
	}
	
	public List<Employee> getAllEmployees(){
		return dao.getAllEmployees();
		
	}
}
