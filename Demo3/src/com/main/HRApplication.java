package com.main;

import com.model.Employee;
import com.service.EmployeeService;

public class HRApplication {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEmpName("Teju");
		employee.setEmpNo(1470);
		employee.setGender('F');
		employee.setSalary(6080f);
		
		Employee employee1 = new Employee();
		employee1.setEmpName("Ajitha");
		employee1.setSalary(606f);
		employee1.setGender('F');
		
		
		Employee employee2 = new Employee();
		employee2.setEmpName("Jashu");
		
		Employee employee3 = new Employee();
		employee3.setEmpName("Hari");
		
		
		Employee[] emp1 = new Employee[3];
		emp1[0] = employee;
		emp1[1] = employee1;
		emp1[2] = employee2;
		
		
		
	
        EmployeeService  employeeService = new EmployeeService();
		System.out.println(employeeService.getEmployeeName(employee));
		System.out.println("Salary of Employee is: "+ employeeService.getEmployeeSalary(employee));
		System.out.println("Gender of Employee is: "+ employeeService.getEmployeeGender(employee));
		System.out.println("Employee Num is: "+ employeeService.getEmployeeNumber(employee));
		
		float TotalSalary = employeeService.getTotalSalary(employee,employee1);
		System.out.println("Total salary is: " + TotalSalary);
		float getMaxSalary = employeeService.getTotalSalary(employee,employee1);
		System.out.println("Max salary is: " + getMaxSalary);
		
		String checkEmpName = employeeService.checkEmpName(emp1, "Teju");
		System.out.println(checkEmpName);
		
		employeeService.countGender(emp1);
		
	

}}
