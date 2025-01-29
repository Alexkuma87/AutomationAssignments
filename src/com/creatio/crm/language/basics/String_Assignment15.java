package com.creatio.crm.language.basics;

public class String_Assignment15 {

	public static void main(String[] args) {
		
		String input = " I Love Dogs ";
		
		 input = input.trim();
		 input = input.replace(" ", "");
		 System.out.println(input.length());
		 
		 for(int i=0; i<input.length(); i++) {
			 for(int j=0; j<input.length(); j++) {
				 if(i!=j) {
					 System.out.println(""+input.charAt(i)+input.charAt(j));
				 }
			 }
			 
		 }
		 
		 

	}

}
