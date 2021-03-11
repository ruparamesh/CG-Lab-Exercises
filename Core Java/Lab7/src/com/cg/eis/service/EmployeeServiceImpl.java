package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	HashMap<Integer,Employee> employee = new HashMap<Integer, Employee>();
	
	@Override
	public void addEmployee(Employee emp) {
		employee.put(emp.getId(), emp);
	}

	@Override
	public void deleteEmployee(int empId) {
		employee.remove(empId);
	}

	
	public Map<Integer, Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(HashMap<Integer, Employee> employee) {
		this.employee = employee;
	}
	
}
