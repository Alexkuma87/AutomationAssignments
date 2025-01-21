package com.creatio.crm.language.basics;

public class Array_Loop {

	public static void main(String[] args) {
		
		int[] values = {12,34,11,36,87,98,93};
		int temp;

		for(int i=0; i<values.length;i++) {

			for(int j=i+1; j<values.length; j++) {
				if(values[i]> values[j]) {
					temp = values[i];
					values[i]= values[j];
					values[j]=temp;



				}

			}

		}System.out.println(values[values.length-2]);
		System.out.println(values[values.length-3]);
	}}
