package com.creatio.crm.language.basics;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
				
		        // Create a Scanner object to take input from user
		        Scanner scanner = new Scanner(System.in);
		        
		        // Prompt the user to enter a string
		        System.out.print("Enter a string: ");
		        String input = scanner.next();
		       // String input = scanner.nextLine();
		        
		        // Split the string into words using space as the delimiter
		        String[] words = input.split(" ");

		        // Create a StringBuilder to store the reversed string
		        StringBuilder reversedString = new StringBuilder();

		        // Reverse each word and append to the StringBuilder
		        for (String word : words) {
		            StringBuilder reversedWord = new StringBuilder(word);
		            reversedString.append(reversedWord.reverse().toString()).append(" ");
		        }

		        // Output the reversed string
		        System.out.println("Reversed string: " + reversedString.toString().trim());

		        // Close the scanner
		        scanner.close();
		        
		      
		    }
		


	}


