package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class LoopsAndCondition {

	public static void main(String[] args) {
		
		int credit =0;
		int debit =0;
		int totalCredit =0;
		int totalDebit=0;
		int remainingBalance =0;
		int suspicious = 0;
		
		
		
		Map<Integer, Integer> bankTransaction = new HashMap<Integer, Integer>();
		
		bankTransaction.put(1, 5000);
		bankTransaction.put(2, -2000);
		bankTransaction.put(3, 3000);
		bankTransaction.put(4, -15000);
		bankTransaction.put(5, -200);
		bankTransaction.put(6, -300);
		bankTransaction.put(7, 4000);
		bankTransaction.put(8, -3000);
		

		for(Integer key : bankTransaction.keySet()) {
			if(bankTransaction.get(key)>0) {
				credit++;
				totalCredit = totalCredit+ bankTransaction.get(key);
				if(bankTransaction.get(key)>10000) {
					suspicious = suspicious+bankTransaction.get(key);
				}
			} 
			 if(bankTransaction.get(key)<0) {
				debit++;
				totalDebit = totalDebit+ bankTransaction.get(key);
				if(bankTransaction.get(key)<-10000) {
					suspicious = suspicious+bankTransaction.get(key);
				}
			}
			
	}
			
		remainingBalance = totalDebit + totalCredit;
		
				
		System.out.println("Total Credit Transaction is : "+credit+ " Total Debit Transaction is :"+debit);
		System.out.println("Total Credit Amount is :" +totalCredit);
		System.out.println("Total Debit Amount is :" +totalDebit);
		System.out.println("Total Amount Remaining in Account :" +remainingBalance);
		System.out.println("Suspicious Transaction ="+suspicious);
	}


}


