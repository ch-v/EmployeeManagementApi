package com.nagarro.employeemanagementapi.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


/**
 * @author vishalchaudhary01
 *
 */
@Component
@Entity
public class Employee {
	@Id
	private String empCode;
	private String empName;
	private String location;
	private String email;
	private String dob;

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Employee [ empCode=" + empCode + ", empName=" + empName + ", location=" + location + ", email=" + email
				+ ", dob=" + dob + "]";
	}


}
