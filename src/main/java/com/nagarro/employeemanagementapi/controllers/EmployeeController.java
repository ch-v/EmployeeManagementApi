package com.nagarro.employeemanagementapi.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.employeemanagementapi.dao.EmployeeDao;
import com.nagarro.employeemanagementapi.models.Employee;

/**
 * @author vishalchaudhary01
 *
 */
@Path("employee")
public class EmployeeController {
	@Autowired
	EmployeeDao emp;

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("update/{empcode}")
	public Employee updateEmp(Employee empl) {
		emp.updateEmployee(empl.getEmpCode(), empl);
		return empl;
	}

	@GET
	@Path("all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> get() {
		List<Employee> employees = emp.getAll();

		System.out.println(employees);
		return employees;
	}

	@POST
	@Path("post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addEmployee(Employee e) {
		System.out.println(e);
		System.out.println(emp);
		emp.addEmployee(e);
		return e;
	}
}
