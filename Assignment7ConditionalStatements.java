package com.cts.creatio.crm.language.basics;

public class Assignment7ConditionalStatements {
	/**
	 * 
	 * @author somisettisairamkrishna
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		if (creditScore > 750) {
			System.out.println("Customer loan is automatically approved");
		} else if (creditScore > 650 && creditScore < 750) {
			if (income >= 50000) {
				System.out.println(customerName + " customer is considered for loan");
				if (isEmployed) {
					System.out.println("Checking debt-to-income ratio of " + customerName);
					if (debtToIncomeRatio < 40) {
						System.out.println(customerName + " Customer Loan is approved");
					} else if (debtToIncomeRatio >= 40) {
						System.out.println("Customer Loan is denied");
					} else {
						System.out.println("debtToIncomeRatio of customer is not found");
					}
				} else {
					System.out.println("Customer Loan is denied as the customer is un-employed");
				}
			}

		} else if (creditScore < 650) {
			System.out.println("Customer loan is denied due to  credit score criteria is not matched");
		}
	}
	
	/*
	 * Output of the program is
	 * 
	 * John Doe customer is considered for loan
	 * Checking debt-to-income ratio of John Doe
     * John Doe Customer Loan is approved

	 */
	

}
