package com.creatio.crm.language.basics;

public class Array_Loop1 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		
		
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++) {
				
				System.out.print(" ");
				
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k+" ");
				
				
			}
			
			System.out.println();
			
		}
		
		for(int i=n-1; i>=1; i--) {
			for(int j=i; j<=n; j++) {
				
				System.out.print(" ");
				
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k+" ");
		}
			System.out.println();
	}
	
	

}}
