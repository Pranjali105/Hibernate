package com.practise.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Demo.employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int emp_id;

	@Column(name = "name")
	private String emp_name;

	@Column(name = "age")
	private int emp_age;

	@Column(name = "city")
	private String emp_city;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Demo.project_mapping", joinColumns = {
			@JoinColumn(name = "employee_id") }, inverseJoinColumns = { @JoinColumn(name = "project_id") })
	List<Project> project_list = new ArrayList<Project>();

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public List<Project> getProject_list() {
		return project_list;
	}

	public void setProject_list(List<Project> project_list) {
		this.project_list = project_list;
	}

}
