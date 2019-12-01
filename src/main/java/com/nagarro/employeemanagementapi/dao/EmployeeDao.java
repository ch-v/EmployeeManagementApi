package com.nagarro.employeemanagementapi.dao;

import java.util.List;

import com.nagarro.employeemanagementapi.models.Employee;

/**
 * @author vishalchaudhary01
 *
 */
public interface EmployeeDao {
	
	public void updateEmployee(String empcode,Employee emp);
	
	public void addEmployee(Employee emp);
	
	public List<Employee> getAll();

}
