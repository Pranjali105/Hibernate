package com.practise.service.impl;

import java.util.List;

import com.practise.dai.impl.DAOImpl;
import com.practise.pojo.Student;
import com.practise.service.intrfc.ServiceInterface;

public class ServiceImpl implements ServiceInterface {

	DAOImpl daoImpl = new DAOImpl();
	
	public void insertStudentDetails(List<Student> stud_lst) {
		
		daoImpl.insertStudentDetails(stud_lst);

	}

	public List<Student> getStudentDetails() {
		
		List<Student> stud_lst= daoImpl.getStudentDetails();
		
		return stud_lst;
	}

	/*
	 * public void deleteStudentDetails() {
	 * 
	 * daoImpl.deleteStudentDetails();
	 * 
	 * }
	 */

}
