package com.cts.creatio.crm.language.basics;

public class EmpGroups {

	/**
	 * 
	 * @author somisettisairamkrishna {@summary} creation of another class called
	 *         EmpGroups that contains two arrays to store the employee names and
	 *         IDs And, Retrieve the data from the Employees class, store it in
	 *         these arrays, and finally print each employee's name along with their
	 *         corresponding ID.
	 */

	public static void main(String[] args) {
		Employees employee = new Employees();

		String[] employeeNames = new String[3]; // String array to store employee names from Employees class
		int[] employeeIds = new int[3]; // int array to store employee ids from Employee class
		int i = 1; // assigning the value of i to 1 for further usage

		// Storing employee names from Employee class in employeeNames string array
		employeeNames[0] = employee.employeeName1;
		employeeNames[1] = employee.employeeName2;
		employeeNames[2] = employee.employeeName3;

		// Storing employee ids from Employee class in employeeIDs int array

		employeeIds[0] = employee.employeeId1;
		employeeIds[1] = employee.employeeId2;
		employeeIds[2] = employee.employeeId3;

		// Printing the employee details

		System.out.println("Employee " + i + " Details are : \n" + "Employee Name :" + employeeNames[0]
				+ ", Employee ID :" + employeeIds[0]);
		System.out.println();// adding new line
		i = i + 1; // updating the i value by adding 1 which will be used further for keeping track
					// of employee count
		System.out.println("Employee " + i + " Details are : \n" + "Employee Name :" + employeeNames[1]
				+ ", Employee ID :" + employeeIds[1]);
		i = i + 1; // updating the i value by adding 1 which will be used further for keeping track
					// of employee count
		System.out.println();

		System.out.println("Employee " + i + " Details are : \n" + "Employee Name :" + employeeNames[2]
				+ ", Employee ID :" + employeeIds[2]);

	}

	/*
	 * Output of the program is: 
	 * 
	 * Employee 1 Details are : Employee Name :Sai, Employee ID :12345678
	 * 
	 * Employee 2 Details are : Employee Name :Ram, Employee ID :90123456
	 * 
	 * Employee 3 Details are : Employee Name :Krishna, Employee ID :78901234
	 * 
	 */

}
