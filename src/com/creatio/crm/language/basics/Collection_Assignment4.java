package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection_Assignment4 {

	public static void main(String[] args) {
		
		/*
		 * Create the data of student,employee and product by using collection methods.
		 * Using Map method to store all the values. 
		 * Initialize the variable studentMap3 and store the vlaues.
		 * Using put method to assign the values.
		 */
		
		Map<String, String> studentMap1 = new HashMap<String,String>();
		
		studentMap1.put("Name", "JohnDoe");
		studentMap1.put("Age", "20");
		studentMap1.put("Gender", "Male");
		studentMap1.put("RollNumber", "S12345");
		studentMap1.put("Grade", "A");
		studentMap1.put("Major", "Computer Science");
		studentMap1.put("GPA", "3.8");
		studentMap1.put("Email", "john@example.com");
		studentMap1.put("ContactNumber", "9999997777");
		studentMap1.put("Address", "123 Elm St");
		
		/*
		 *  Initialize the variable studentMap2 and store the vlaues.
		 *  Using put method to assign the values.
		 */
		
		Map<String, String> studentMap2 = new HashMap<String,String>();
		
		studentMap2.put("Name", "JaneSmith");
		studentMap2.put("Age", "21");
		studentMap2.put("Gender", "Female");
		studentMap2.put("RollNumber", "S12346");
		studentMap2.put("Grade", "B");
		studentMap2.put("Major", "Mathematics");
		studentMap2.put("GPA", "3.5");
		studentMap2.put("Email", "jane@example.com");
		studentMap2.put("ContactNumber", "9876665666");
		studentMap2.put("Address", "456 Oak St");

		
		/*
		 *  Initialize the variable studentMap3 and store the vlaues.
		 *  Using put method to assign the values.
		 */
		
		Map<String, String> studentMap3 = new HashMap<String,String>();
		studentMap3.put("Name", "Mike Brown");
		studentMap3.put("Age", "22");
		studentMap3.put("Gender", "Male");
		studentMap3.put("RollNumber", "S12347");
		studentMap3.put("Grade", "A");
		studentMap3.put("Major", "Physics");
		studentMap3.put("GPA", "3.9");
		studentMap3.put("Email", "mike@example.com");
		studentMap3.put("ContactNumber", "8787876546");
		studentMap3.put("Address", "789 Pine St");
		
		
		// Initialize the variable studentList and store all the students data.
		
		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		studentList.add(studentMap1);
		studentList.add(studentMap2);
		studentList.add(studentMap3);
		
		/*
		 *  Initialize the variable employeeMap1 and store the vlaues.
		 *  Using put method to assign the values.
		 */
		
		Map<String, String> employeeMap1 = new HashMap<String,String>();
		
		employeeMap1.put("Employee ID", "E001");
		employeeMap1.put("Name", "Alice Green");
		employeeMap1.put("Age", "30");
		employeeMap1.put("Gender", "Female");
		employeeMap1.put("Department", "Engineering");
		employeeMap1.put("Position", "Software Engineer");
		employeeMap1.put("Salary", "75,000");
		employeeMap1.put("Email", "alice@example.com");
		employeeMap1.put("ContactNumber", "9876543213");
		
		
		/*
		 *  Initialize the variable employeeMap2 and store the vlaues.
		 *  Using put method to assign the values.
		 */
		
		Map<String, String> employeeMap2 = new HashMap<String,String>();
		
		employeeMap2.put("Employee ID", "E002");
		employeeMap2.put("Name", "Bob jhonson");
		employeeMap2.put("Age", "35");
		employeeMap2.put("Gender", "Male");
		employeeMap2.put("Department", "Marketing");
		employeeMap2.put("Position", "Marketing Manager");
		employeeMap2.put("Salary", "85,000");
		employeeMap2.put("Email", "bob@example.com");
		employeeMap2.put("ContactNumber", "9876543214");
		
		/*
		 *  Initialize the variable employeeMap3 and store the vlaues.
		 *  Using put method to assign the values.
		 */
		
		
		Map<String, String> employeeMap3 = new HashMap<String,String>();
		
		employeeMap3.put("Employee ID", "E003");
		employeeMap3.put("Name", "Carol White");
		employeeMap3.put("Age", "28");
		employeeMap3.put("Gender", "Female");
		employeeMap3.put("Department", "Sales");
		employeeMap3.put("Position", "Sales Executive");
		employeeMap3.put("Salary", "65,000");
		employeeMap3.put("Email", "carol@example.com");
		employeeMap3.put("ContactNumber", "9876543215");
		
		// Initialize the variable employeeList and store all the employee data.
			
		List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();
		employeeList.add(employeeMap1);
		employeeList.add(employeeMap2);
		employeeList.add(employeeMap3);

		/*
		 *  Initialize the variable product1 and store the vlaues.
		 *  Using put method to assign the values.
		 */
		
		Map<String, String> product1 = new HashMap<String,String>();
		
		product1.put("Product ID", "P001");
		product1.put("Name", "Laptop");
		product1.put("Category", "Electronics");
		product1.put("Price", "$1,200");
		product1.put("Stock Quantity", "50");
		product1.put("Supplier", "Tech Supplies");
		product1.put("Warranty", "2 Years");
		product1.put("Rating", "4.5");
		product1.put("Manufacturing Date", "15-01-2023");
		product1.put("Expiry Date", "15-01-2025");
		
		/*
		 *  Initialize the variable product2 and store the vlaues.
		 *  Using put method to assign the values.
		 */
		
		Map<String, String> product2 = new HashMap<String,String>();
		
		product2.put("Product ID", "P002");
		product2.put("Name", "Desk Chair");
		product2.put("Category", "Furniture");
		product2.put("Price", "$150");
		product2.put("Stock Quantity", "200");
		product2.put("Supplier", "Office Depot");
		product2.put("Warranty", "1 Year");
		product2.put("Rating", "4");
		product2.put("Manufacturing Date", "10-02-2023");
		product2.put("Expiry Date", "N/A");
		
		
		/*
		 *  Initialize the variable product3 and store the vlaues.
		 *  Using put method to assign the values.
		 */
		
		Map<String, String> product3 = new HashMap<String,String>();
		
		product3.put("Product ID", "P003");
		product3.put("Name", "Coffee Maker");
		product3.put("Category", "Kitchen");
		product3.put("Price", "$75");
		product3.put("Stock Quantity", "100");
		product3.put("Supplier", "KitchenWorld");
		product3.put("Warranty", "6 months");
		product3.put("Rating", "4.2");
		product3.put("Manufacturing Date", "20-03-2023");
		product3.put("Expiry Date", "20-03-2024");
		
				
		// Initialize the variable productList and store all the products data.
		
		List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		// Initialize the variable data and store all the data's studentList,employeeList,productList.
		
		Map<String,List<Map<String, String>>> data = new HashMap<String,List<Map<String, String>>>();
		data.put("StudentData", studentList);
		data.put("EmployeeData",employeeList);
		data.put("ProductData", productList);
		
			
		System.out.println(data.get("ProductData").get(1).get("Supplier"));
		
	}

}
