package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment8Loops {

	/**
	 * 
	 * @author somisettisairamkrishna
	 */
	public static void main(String[] args) {

		List<Integer> transactionsAmount = new ArrayList<Integer>();
		int numOfDebitTrans = 0;
		int numOfCreditTrans = 0;
		int creditAmount = 0;
		int debitAmount = 0;
		int remainingAmount = 0;
		int numOfSuspiciousTrans = 0;

		transactionsAmount.add(50000);
		transactionsAmount.add(-2000);
		transactionsAmount.add(3000);
		transactionsAmount.add(-15000);
		transactionsAmount.add(-200);
		transactionsAmount.add(-300);
		transactionsAmount.add(4000);
		transactionsAmount.add(-3000);

		for (int i = 0; i < transactionsAmount.size(); i++) {
			if (transactionsAmount.get(i) < 0) {
				numOfDebitTrans++;
				debitAmount = debitAmount + transactionsAmount.get(i);

			} else {
				numOfCreditTrans++;
				creditAmount = creditAmount + transactionsAmount.get(i);
			}
			remainingAmount = remainingAmount + transactionsAmount.get(i);

			if (transactionsAmount.get(i) > 10000 || transactionsAmount.get(i) < -10000) {
				System.out.println("Suspicious credit/ debit Transaction of Amount :" + transactionsAmount.get(i));
				numOfSuspiciousTrans++;

			}

		}
		System.out.println("Number of debit transactions are :" + numOfDebitTrans + "\n"
				+ "Number of credit transactions are :" + numOfCreditTrans);
		System.out.println(
				"Total amount debited is :" + debitAmount + "\n" + "Total amount credited is :" + creditAmount);
		System.out.println("Total Remaining Amount in the account is :" + remainingAmount);
		System.out.println("Number of suspicious trasactions in the account happened are :" + numOfSuspiciousTrans);

	}
	/*
	 * Output of the program is
	 *  Suspicious credit/ debit Transaction of Amount :50000
	 *  Suspicious credit/ debit Transaction of Amount :-15000
	 *  Number of debit transactions are :5
	 *  Number of credit transactions are :3
	 *  Total amount debited is :-20500
	 *  Total amount credited is :57000
	 *  Total Remaining Amount in the account is :36500
	 *  Number of suspicious trasactions in the account happened are :2
	 */

}
