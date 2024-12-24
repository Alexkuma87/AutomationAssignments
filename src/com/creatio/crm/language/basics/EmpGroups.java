package com.creatio.crm.language.basics;

public class EmpGroups {
	
	String[] Name;
	int [] ID;
	
	EmpGroups (Employees emp){
		
		this.Name = emp.EmpNames;
		this.ID = emp.EmpID;
		
	}
	
	public void empData() {
		
		for(int i=0; i<Name.length; i++) {
			System.out.println("Employee Name:" +Name[i]+  "   Employee ID:" +ID[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Employees obj = new Employees();
		EmpGroups obj1 = new EmpGroups(obj);
		obj1.empData();
	}
	
	
	
}