package com.practise.dao.intrfc;

import java.util.List;

import com.practise.pojo.Student;

public interface DAOInterface {
	
	public void insertStudentDetails(List<Student> stud_lst);
	
	public List<Student> getStudentDetails();
	
	/* public void deleteStudentDetails(); */

}
