package com.practise.service.intrfc;

import java.util.List;

import com.practise.pojo.Student;

public interface ServiceInterface {
	
	public void insertStudentDetails(List<Student> stud_lst);
	
	public List<Student> getStudentDetails();
	
	/* public void deleteStudentDetails(); */

}
