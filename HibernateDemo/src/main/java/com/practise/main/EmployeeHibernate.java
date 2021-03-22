package com.practise.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.practise.pojo.Employee;
import com.practise.service.impl.EmployeeServiceImpl;

public class EmployeeHibernate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee e = null;
		List<Employee> lst = new ArrayList<Employee>();

		while (true) {
			
			e = new Employee();
			
			System.out.println("Enter Name : ");
			String emp_name = sc.nextLine();
			
			e.setName(emp_name);

			System.out.println("Enter Age : ");
			int emp_age = Integer.parseInt(sc.nextLine());
			
			e.setAge(emp_age);

			System.out.println("Enter City : ");
			String emp_city = sc.nextLine();
			
			e.setCity(emp_city);
			
			lst.add(e);
			
			System.out.println("Do you want to add another Employee : ");
			String response = sc.nextLine();
			
			if(response.equalsIgnoreCase("yes"))
			{
				continue;
			}
			else if(response.equalsIgnoreCase("no"))
			{
				break;
			}

		}
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		employeeServiceImpl.addEmployeeDeatils(lst);

	}

}
