package com.creatio.crm.language.basics;

public class EmpGroups {
	
		
	public static void main(String[] args) {
		
		String [] names = new String[3];
		int [] id = new int[3];
		
		Employees emp = new Employees();
		
		names[0]= emp.empName1;
		names[1]=emp.empName2;
		names[2]=emp.empName3;
		
		id[0]=emp.empId1;
		id[1]=emp.empId2;
		id[2]=emp.empId3;
		
		System.out.println("Employee Name:" +names[0]+ "Employee ID:"+id[0]);
		System.out.println("Employee Name:" +names[1]+ "Employee ID:"+id[1]);
		System.out.println("Employee Name:" +names[2]+ "Employee ID:"+id[2]);
	}
	
	
	
}