package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsAssignment {
	/**
	 * 
	 * @author somisettisairamkrishna
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> ProductDetail1 = new HashMap<String, String>();
		Map<String, String> ProductDetail2 = new HashMap<String, String>();
		Map<String, String> ProductDetail3 = new HashMap<String, String>();

		ProductDetail1.put("ProductID", "P001");
		ProductDetail1.put("Name", "Laptop");
		ProductDetail1.put("Catogory", "Electronics");
		ProductDetail1.put("Price", "$1,200");
		ProductDetail1.put("StockQuantity", "50");
		ProductDetail1.put("Supplier", "Tech Supplies");
		ProductDetail1.put("Warranty", "2 Years");
		ProductDetail1.put("Rating", "4.5");
		ProductDetail1.put("Manufacturing Date", "1/15/2023");
		ProductDetail1.put("Expiry Date", "1/15/2025");

		ProductDetail2.put("ProductID", "P002");
		ProductDetail2.put("Name", "Desk Chair");
		ProductDetail2.put("Catogory", "Furniture");
		ProductDetail2.put("Price", "$150");
		ProductDetail2.put("StockQuantity", "100");
		ProductDetail2.put("Supplier", "Office Depot");
		ProductDetail2.put("Warranty", "1 Year");
		ProductDetail1.put("Rating", "4");
		ProductDetail2.put("Manufacturing Date", "2/10/2023");
		ProductDetail2.put("Expiry Date", "NA");

		ProductDetail3.put("ProductID", "P003");
		ProductDetail3.put("Name", "Coffee Maker");
		ProductDetail3.put("Catogory", "Kitchen");
		ProductDetail3.put("Price", "$75");
		ProductDetail3.put("StockQuantity", "120");
		ProductDetail3.put("Supplier", "Kitchen World");
		ProductDetail3.put("Warranty", "6 Months");
		ProductDetail1.put("Rating", "4.2");
		ProductDetail3.put("Manufacturing Date", "3/20/2023");
		ProductDetail3.put("Expiry Date", "3/20/2024");

		List<Map<String, String>> ProductList = new ArrayList<Map<String, String>>();
		ProductList.add(ProductDetail1);
		ProductList.add(ProductDetail2);
		ProductList.add(ProductDetail3);

		Map<String, String> EmployeeDetail1 = new HashMap<String, String>();
		Map<String, String> EmployeeDetail2 = new HashMap<String, String>();
		Map<String, String> EmployeeDetail3 = new HashMap<String, String>();

		EmployeeDetail1.put("EmployeeID", "E001");
		EmployeeDetail1.put("Name", "Alice Green");
		EmployeeDetail1.put("Age", "30");
		EmployeeDetail1.put("Gender", "Female");
		EmployeeDetail1.put("Department", "Engineering");
		EmployeeDetail1.put("Position", "Software Engineer");
		EmployeeDetail1.put("Salary", "75,000");
		EmployeeDetail1.put("Email", "alice@example.com");
		EmployeeDetail1.put("Contact Number", "9876543219");

		EmployeeDetail2.put("EmployeeID", "E002");
		EmployeeDetail2.put("Name", "Bob");
		EmployeeDetail2.put("Age", "35");
		EmployeeDetail2.put("Gender", "Male");
		EmployeeDetail2.put("Department", "Marketing	");
		EmployeeDetail2.put("Position", "Marketing Manager");
		EmployeeDetail2.put("Salary", "85,000");
		EmployeeDetail2.put("Email", "bob@example.com");
		EmployeeDetail2.put("Contact Number", "9876543218");

		EmployeeDetail3.put("EmployeeID", "E003");
		EmployeeDetail3.put("Name", "Carol White");
		EmployeeDetail3.put("Age", "28");
		EmployeeDetail3.put("Gender", "Female");
		EmployeeDetail3.put("Department", "Sales");
		EmployeeDetail3.put("Position", "Sales Executive");
		EmployeeDetail3.put("Salary", "65,000");
		EmployeeDetail3.put("Email", "carol@example.com");
		EmployeeDetail3.put("Contact Number", "9876543217");

		List<Map<String, String>> EmployeeDetail = new ArrayList<Map<String, String>>();
		EmployeeDetail.add(EmployeeDetail1);
		EmployeeDetail.add(EmployeeDetail2);
		EmployeeDetail.add(EmployeeDetail3);

		Map<String, String> StudentDetail1 = new HashMap<String, String>();
		Map<String, String> StudentDetail2 = new HashMap<String, String>();
		Map<String, String> StudentDetail3 = new HashMap<String, String>();

		StudentDetail1.put("Name", "John doe");
		StudentDetail1.put("Age", "20");
		StudentDetail1.put("Gender", "Male");
		StudentDetail1.put("Roll Number", "S12345");
		StudentDetail1.put("Grade", "A");
		StudentDetail1.put("Major", "Computer Science");
		StudentDetail1.put("GPA", "3.8");
		StudentDetail1.put("Email", "john@example.com");
		StudentDetail1.put("Contact Number", "9876543219");
		StudentDetail1.put("Address", "123 Elm St");

		StudentDetail2.put("Name", "Jane Smith");
		StudentDetail2.put("Age", "21");
		StudentDetail2.put("Gender", "Female");
		StudentDetail2.put("Roll Number", "S12346");
		StudentDetail2.put("Grade", "B");
		StudentDetail2.put("Major", "Mathematics");
		StudentDetail2.put("GPA", "3.5");
		StudentDetail2.put("Email", "jane@example.com");
		StudentDetail2.put("Contact Number", "9876543216");
		StudentDetail2.put("Address", "456 Oak St");

		StudentDetail3.put("Name", "Make Brown");
		StudentDetail3.put("Age", "22");
		StudentDetail3.put("Gender", "Male");
		StudentDetail3.put("Roll Number", "S12347");
		StudentDetail3.put("Grade", "A");
		StudentDetail3.put("Major", "Physics");
		StudentDetail3.put("GPA", "3.9");
		StudentDetail3.put("Email", "mile@example.com");
		StudentDetail3.put("Contact Number", "9876543214");
		StudentDetail3.put("Address", "789 Pine St");

		List<Map<String, String>> StudentDetail = new ArrayList<Map<String, String>>();
		StudentDetail.add(StudentDetail1);
		StudentDetail.add(StudentDetail2);
		StudentDetail.add(StudentDetail3);

		Map<String, List<Map<String, String>>> Data = new HashMap<String, List<Map<String, String>>>();

		Data.put("Products", ProductList);
		Data.put("Employee", EmployeeDetail);
		Data.put("Student", StudentDetail);

		System.out.println(Data.get("Products").get(1).get("Supplier"));
		// System.out.println(ProductList.get(1).get("Supplier"));

	}

	/*
	 * Output of the above program is below
	 * 
	 * Office Depot
	 */

}
