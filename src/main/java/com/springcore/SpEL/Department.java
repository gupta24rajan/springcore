package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
	
	private String deptName;
	
	private int totalEmployees;
	
	public Department(@Value("IT Department") String deptName,@Value("20") int totalEmployees) {
		this.deptName = deptName;
		this.totalEmployees = totalEmployees;
	}
	public String getDeptName() {
		return deptName;
	}
	public int getTotalEmployees() {
		return totalEmployees;
	}
	public double getAverageSalary() {
		return 50000.0;
	}

}
