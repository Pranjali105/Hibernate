package com.practise.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Demo.project")
public class Project {

	@Id
	@GeneratedValue
	@Column(name = "project_id")
	private int project_id;

	@Column(name = "project_name")
	private String project_name;

	@ManyToMany(mappedBy = "project_list", cascade = CascadeType.ALL)
	private List<Employee> employee_list = new ArrayList<Employee>();

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public List<Employee> getEmployee_list() {
		return employee_list;
	}

	public void setEmployee_list(List<Employee> employee_list) {
		this.employee_list = employee_list;
	}

}
