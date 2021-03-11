package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		
		System.out.println("1 - Add employee \n2- Delete Employee \n3- Display employee details based on Insurance Scheme");
		int n = sc.nextInt();
		
		switch(n) {
			case 1:
				System.out.println("Employee Id : ");
				int id = sc.nextInt();
				
				System.out.println("Employee Name : ");
				String name= sc.next();
				
				System.out.println("Employee salary :");
				int salary= sc.nextInt();
				
				System.out.println("Employee Designation : ");
				String dsgn= sc.next();
				
				System.out.println("Employee Scheme : ");
				String scheme= sc.next();
				
				Employee emp = new Employee(id,name, salary, dsgn, scheme);
				service.addEmployee(emp);
				
			case 2:
				System.out.println("Employee Id : ");
				int id1 = sc.nextInt();
				service.deleteEmployee(id1);
				
			case 3:
				System.out.println("Employee details based on Insurance Scheme	");
				System.out.println(service.getEmployee());
				
			default:
				System.out.println("Enter vaid option");
		}

	}

}
