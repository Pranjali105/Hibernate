package com.practise.main;

import java.util.ArrayList;
import java.util.List;

import com.practise.pojo.Employee;
import com.practise.pojo.Project;
import com.practise.service.impl.ServiceImpl;

public class ManyToManyMappingMain {

	public static void main(String[] args) {
		
		List<Employee> emp_list = new ArrayList<Employee>();
		List<Project> project_list = new ArrayList<Project>();
		
		Project p1 = new Project();
		p1.setProject_name("Project1");
		
		Project p2 = new Project();
		p2.setProject_name("Project2");
				
		Project p3 = new Project();
		p3.setProject_name("Project3");
		
		Project p4 = new Project();
		p4.setProject_name("Project4");
		
		Project p5 = new Project();
		p5.setProject_name("Project5");
		
		project_list.add(p1);
		project_list.add(p3);
		project_list.add(p5);
		
		Employee e1 = new Employee();
		e1.setEmp_name("A");
		e1.setEmp_age(10);
		e1.setEmp_city("Pune");
		e1.setProject_list(project_list);
		
		emp_list.add(e1);
		
		project_list = new ArrayList<Project>();
		
		project_list.add(p1);
		project_list.add(p2);
		
		Employee e2 = new Employee();
		e2.setEmp_name("B");
		e2.setEmp_age(15);
		e2.setEmp_city("Amt");
		e2.setProject_list(project_list);
		
		emp_list.add(e2);

		project_list = new ArrayList<Project>();
		
		project_list.add(p3);
		project_list.add(p4);
		
		Employee e3 = new Employee();
		e3.setEmp_name("C");
		e3.setEmp_age(20);
		e3.setEmp_city("Nagpur");
		e3.setProject_list(project_list);
		
		emp_list.add(e3);
		
		project_list = new ArrayList<Project>();
		
		project_list.add(p1);
		project_list.add(p5);
		
		Employee e4 = new Employee();
		e4.setEmp_name("D");
		e4.setEmp_age(10);
		e4.setEmp_city("Amravati");
		e4.setProject_list(project_list);
		
		emp_list.add(e4);
		
		project_list = new ArrayList<Project>();
		
		project_list.add(p5);
		project_list.add(p2);
		
		Employee e5 = new Employee();
		e5.setEmp_name("E");
		e5.setEmp_age(20);
		e5.setEmp_city("Pune");
		e5.setProject_list(project_list);
		
		emp_list.add(e5);

		ServiceImpl serviceImpl = new ServiceImpl();
		serviceImpl.insertEmployeeDetails(emp_list);
		

	}

}
