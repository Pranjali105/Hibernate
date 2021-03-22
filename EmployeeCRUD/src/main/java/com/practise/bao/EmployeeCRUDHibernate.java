package com.practise.bao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.practise.pojo.Employee;
import com.practise.service.impl.EmployeeServiceImpl;

public class EmployeeCRUDHibernate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(
					"Please select the opration : (Add Employee/ Get Employee/ Update Employee / Delete Employee)");
			String opration = sc.nextLine();

			if (opration.equalsIgnoreCase("Add Employee")) {
				addEmployee();
			} else if (opration.equalsIgnoreCase("Get Employee")) {
				getEmployee();

			} else if (opration.equalsIgnoreCase("update Employee")) {
				updateEmployee();
			} else if (opration.equalsIgnoreCase("Delete Employee")) {
				deleteEmployee();
			} else {
				System.out.println(opration + " currently not supported...");
				continue;
			}

			System.out.println("Do you want to perfom more operatons : ");
			String res = sc.nextLine();
			if (res.equalsIgnoreCase("yes")) {
				continue;
			} else {
				System.out.println("Thank you...");
				System.exit(0);
			}

		}

	}

	public static void addEmployee() {

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

			System.out.println("Enter Department : ");
			String emp_dept = sc.nextLine();

			e.setDepartment(emp_dept);

			System.out.println("Enter City : ");
			String emp_city = sc.nextLine();

			e.setCity(emp_city);

			lst.add(e);

			System.out.println("Do you want to add another Employee : ");
			String response = sc.nextLine();

			if (response.equalsIgnoreCase("yes")) {
				continue;
			} else if (response.equalsIgnoreCase("no")) {
				break;
			}
		}

		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		employeeServiceImpl.addEmployeeDetails(lst);
	}

	private static void getEmployee() {

		Scanner sc = new Scanner(System.in);
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		List<Employee> lst = new ArrayList<Employee>();

		System.out.println("Do you want deatils of all Employee : ");
		String all_get_res = sc.nextLine();

		if (all_get_res.equalsIgnoreCase("yes")) {
			lst = new ArrayList<Employee>();
			lst = employeeServiceImpl.getEmployeeDeatils();
		} else if (all_get_res.equalsIgnoreCase("no")) {
			System.out.println("Enter Name for which you want Employee deatils : ");
			String emp_name = sc.nextLine();
			lst = new ArrayList<Employee>();
			lst = employeeServiceImpl.getEmployeesDetails(emp_name);
		}
		if (null != lst && lst.size() > 0) {
			Iterator<Employee> itr = lst.iterator();

			while (itr.hasNext()) {
				Employee e = itr.next();

				System.out.println("Id is : " + e.getId() + " Name is : " + e.getName() + " Age is : " + e.getAge()
						+ " Department is : " + e.getDepartment() + " City is : " + e.getCity());
			}
		} else {
			System.out.println("No data found");

		}
	}

	private static void updateEmployee() {

		Scanner sc = new Scanner(System.in);
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

		System.out.println("Do you want to update all the Employees : ");
		String updt_res = sc.nextLine();
		Boolean updateFlag = true;

		if (updt_res.equalsIgnoreCase("yes")) {
			while (updateFlag) {
				System.out.println("Select the column you want to update : (Age / Department / City)");
				String colmn_res = sc.nextLine();
				String val_res = null;

				if (colmn_res.equalsIgnoreCase("Age")) {

					System.out.println("Enter the Age : ");
					val_res = sc.nextLine();

				} else if (colmn_res.equalsIgnoreCase("Department")) {

					System.out.println("Enter the Department : ");
					val_res = sc.nextLine();

				} else if (colmn_res.equalsIgnoreCase("City")) {

					System.out.println("Enter the City : ");
					val_res = sc.nextLine();

				} else {
					System.out.println("unsupported method...");
					continue;
				}
				updateFlag = false;
				employeeServiceImpl.updateEmployee(colmn_res, val_res);
			}

		} else if (updt_res.equalsIgnoreCase("no")) {
			System.out.println("select the name of the Employee for which you want to update : ");
			String updt_name_res = sc.nextLine();
			boolean updateFlag1 = true;

			while (updateFlag1) {
				System.out.println("Select the column you want to update : (Age / Department / City)");
				String colmn_res = sc.nextLine();
				String val_res = null;

				if (colmn_res.equalsIgnoreCase("Age")) {

					System.out.println("Enter the Age : ");
					val_res = sc.nextLine();

				} else if (colmn_res.equalsIgnoreCase("Department")) {

					System.out.println("Enter the Department : ");
					val_res = sc.nextLine();

				} else if (colmn_res.equalsIgnoreCase("City")) {

					System.out.println("Enter the City : ");
					val_res = sc.nextLine();

				} else {
					System.out.println("unsupported method...");
					continue;
				}

				updateFlag1 = false;
				employeeServiceImpl.updateEmployee(colmn_res, val_res, updt_name_res);
			}

		}
	}

	private static void deleteEmployee() {

		Scanner sc = new Scanner(System.in);
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

		System.out.println("Do you want delete all the Employees: ");
		String all_delete_res = sc.nextLine();

		if (all_delete_res.equalsIgnoreCase("yes")) {
			employeeServiceImpl.deleteEmployeeDetails();

		} else if (all_delete_res.equalsIgnoreCase("no")) {
			System.out.println("Enter the name for which you want to delete the Employee : ");
			String delete_name_rep = sc.nextLine();

			employeeServiceImpl.deleteEmployeeDetails(delete_name_rep);

		}
	}

}
