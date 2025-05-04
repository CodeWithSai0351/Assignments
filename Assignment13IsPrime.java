package com.cts.creatio.crm.language.basics;

public class Assignment13IsPrime {
	/**
	 * @author somisettisairamkrishna
	 */

	public static void main(String[] args) {

		int[] number = new int[3];
		number[0] = 7;
		number[1] = 1;
		number[2] = 25;
		boolean isPrime = true;

		for (int i = 0; i < number.length; i++) {
			if (number[i] <= 1) {
				isPrime = false;

			}
			for (int j = 2; j < number[i]; j++) {
				if (number[i] % j == 0) {
					isPrime = false;

				}
			}

			if (isPrime) {
				System.out.println(number[i] + " is a prime number");

			} else {
				System.out.println(number[i] + " is not a prime number");

			}
		}

	}

	/**
	 * Output of the program is 
	 * 7 is a prime number 
	 * 1 is not a prime number 
	 * 25 is not a prime number
	 */

}
