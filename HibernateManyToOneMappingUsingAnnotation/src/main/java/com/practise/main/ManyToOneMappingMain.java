package com.practise.main;

import java.util.ArrayList;
import java.util.List;

import com.practise.pojo.Student;
import com.practise.pojo.University;
import com.practise.service.impl.ServiceImpl;

public class ManyToOneMappingMain {

	public static void main(String[] args) {

		List<Student> student_list = new ArrayList<Student>();
		List<Student> get_student_list = new ArrayList<Student>();

		University university1 = new University();
		university1.setUniversity_name("Amravati University");

		University university2 = new University();
		university2.setUniversity_name("Nagpur University");

		Student student1 = new Student();
		student1.setStudent_name("A");
		student1.setStudent_stream("CSE");
		student1.setUniversity(university1);

		Student student2 = new Student();
		student2.setStudent_name("B");
		student2.setStudent_stream("ENT");
		student2.setUniversity(university1);

		Student student3 = new Student();
		student3.setStudent_name("C");
		student3.setStudent_stream("IT");
		student3.setUniversity(university1);

		Student student4 = new Student();
		student4.setStudent_name("D");
		student4.setStudent_stream("MECH");
		student4.setUniversity(university2);

		Student student5 = new Student();
		student5.setStudent_name("E");
		student5.setStudent_stream("CIVIL");
		student5.setUniversity(university2);

		student_list.add(student1);
		student_list.add(student2);
		student_list.add(student3);
		student_list.add(student4);
		student_list.add(student5);

		ServiceImpl serviceImpl = new ServiceImpl();
		serviceImpl.insertStudentDetails(student_list);
		
		get_student_list = serviceImpl.getStudentDetails();
		getStudentDetails(get_student_list);
		
		/*
		 * serviceImpl.deleteStudentDetails(); deleteStudentDetails();
		 */

	}

	private static void getStudentDetails(List<Student> get_student_list) {
		
		for(Student s : get_student_list)
		{
			System.out.println(" Student id is : " + s.getStudent_id() + " Student name is : " + s.getStudent_name() + " Student stream is : " + s.getStudent_stream() + " University id is : " + s.getUniversity().getUniversity_id() + " University name is : " + s.getUniversity().getUniversity_name());
		}
		
	}

	/*
	 * private static void deleteStudentDetails() {
	 * 
	 * System.out.println("All records are deleted...."); }
	 */

}
