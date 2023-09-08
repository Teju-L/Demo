package com.service;

import com.model.Employee;

public class EmployeeService {
	
	public String getEmployeeName(Employee employee) {
		
		return "Name of the Employee: " +employee.getEmpName();
		
	}
	
 public float getEmployeeSalary(Employee employee) {
		
		return employee.getSalary();
		
	}
 public char getEmployeeGender(Employee employee) {
		
		return employee.getGender();
		
	}
 public int getEmployeeNumber(Employee employee) {
		
		return employee.getEmpNo();
		
	}
 
 public float getTotalSalary(Employee employee,Employee employee1) {
	 return employee.getSalary() + employee1.getSalary();
 }
 
 public float getMaxSalary(Employee employee,Employee employee1) {
	 if(employee.getSalary() > employee1.getSalary()) {
		 return  employee.getSalary() ;
	 }
	 else {
		 return employee1.getSalary();
	 }
	
	 }
 
 
 
 public String checkEmpName(Employee[] emp,String name) {
	 String res ="";
	 for (Employee employee : emp) {
		 
		 if(employee.getEmpName() == name) {
			  res= " employee is available";
			  break;
		 }
		 else {
			  res = " employee is not available";
		 }
		 
	} 
	 return name + res;
	}
	 
 
 
public void countGender(Employee[] emp) {
	 int fCount = 0;
	 int mCount = 0;
	
	for (Employee employee : emp) {
		if(employee.getGender() == 'F') {
			fCount++;
			break;
		}
		else {
			mCount++;
			 
		}
	}
	System.out.println("Females count is: " +fCount);
	System.out.println("Males count is: " +mCount);
}

}




