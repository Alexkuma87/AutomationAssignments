package com.creatio.crm.language.basics;

public class Array_Loop {

	public static void main(String[] args) {
		
		int[] values = {12,34,11,36,87,98,93};
		int n = values.length;

		for(int i=0; i<n-1;i++) {

			for(int j=1; j<n-1; j++) {
				if(values[j]> values[j+1]) {
					int large = values[j];
					values[j]= values[j+1];
					values[j+1]=large;



				}

			}

		}
	}}
