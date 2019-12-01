package com.nagarro.employeemanagementapi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.employeemanagementapi.configuration.HibernateConfig;
import com.nagarro.employeemanagementapi.models.Employee;

/**
 * @author vishalchaudhary01
 *
 */
@Component
public class EmployeeDaoImp implements EmployeeDao {
	
	@Autowired
	HibernateConfig hibernateConfig;

	public void updateEmployee(String empcode, Employee emp) {
		Session session = hibernateConfig.getSession();
		Employee employee = session.get(Employee.class, empcode);
		employee.setDob(emp.getDob());
		employee.setEmail(emp.getEmail());
		employee.setEmpCode(emp.getEmpCode());
		employee.setEmpName(emp.getEmpName());
		employee.setLocation(emp.getLocation());
		session.update(employee);
		session.beginTransaction().commit();
	}

	public List<Employee> getAll() {
		Session session = hibernateConfig.getSession();
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Employee> list = session.createCriteria(Employee.class).list();
		return list;

	}

	public void addEmployee(Employee emp) {
		Session session = hibernateConfig.getSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();

	}

}
