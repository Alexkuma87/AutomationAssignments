package com.creatio.crm.language.basics;

public class String_Palindrome {

		

	public static void main(String[] args) {
		
		String input = "A man, a plan, a canal:Panama";
		boolean output = true;
		String reversed="";
		input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
		System.out.println(input);
		
		for(int i=input.length()-1; i>=0; i--) {

			 reversed =reversed+input.charAt(i);
			
		}
		System.out.println(reversed);	
	
		for(int j=0; j<input.length(); j++) {
			if(input.charAt(j)!=reversed.charAt(j)) {
				output =false;
			}
		}
		
		if(output) {
			System.out.println("Palindrome!");
		}
		else {
			System.out.println("Its not a Palindrome!");
		}
}
	
	
}		
		