package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("emp")
public class Employee {

    @Value("Anand")
    private String name;

    @Value("#{40000 + 5000}")
    private double salary;

    
    private double bonus;

    // This method runs automatically after all @Value fields are set
    @PostConstruct
    public void calculateBonus() {
        this.bonus = (salary > 45000) ? 2000 : 1000;
    }
    @Value("#{dept.deptName}")
    private String departmentName;

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
       
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void showInfo() {
        System.out.println("Employee : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Department : " + departmentName);
    }
}
