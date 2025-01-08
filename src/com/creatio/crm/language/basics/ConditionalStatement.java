package com.creatio.crm.language.basics;

public class ConditionalStatement {

	public static void main(String[] args) {

		String name = "John Doe";
		int creditscore = 720;
		double income = 55000.0d;
		boolean EmployeeStatus = income >= 50000 ? true : false;
		float debtToIncomeRatio = 35.0f;

		if (creditscore > 750) {
			System.out.println("The Loan is  Approved");
		} else if (creditscore > 650 && creditscore < 750) {
			if (EmployeeStatus) {

				if (debtToIncomeRatio < 40) {

					System.out.println("The Loan is  Approved");

				} else {
					System.out.println("The Loan is Denied");
				}

			} else {
				System.out.println("Due to unemployeement");
			}
		} else {
			System.out.println("Due to low credit score loan is denied");
		}

	}
}