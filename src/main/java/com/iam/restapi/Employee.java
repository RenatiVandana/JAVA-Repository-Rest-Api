package com.iam.restapi;

public class Employee {
	String empName;
	String empId;
	double empSal;
	// double bonus;
	double salary;

	public Employee(String empName, String empId, Double empSal) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		// this.bonus = bonus;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + "<br>";
	}

}
