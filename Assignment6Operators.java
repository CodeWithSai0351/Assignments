package com.cts.creatio.crm.language.basics;

public class Assignment6Operators {

	/**
	 * 
	 * @author somisettisairamkrishna
	 */

	public static void main(String[] args) {

		String[] Student = new String[3];
		int[] Marks = new int[3];

		int[] UpdatedMarks = new int[3];

		Student[0] = "Suresh";
		Student[1] = "Mahesh";
		Student[2] = "Naresh";

		Marks[0] = 75;
		Marks[1] = 80;
		Marks[2] = 82;

		UpdatedMarks[0] = Marks[0] + 10;
		UpdatedMarks[1] = Marks[1] + 10;
		UpdatedMarks[2] = Marks[2] + 10;

		float avg = ((UpdatedMarks[0] + UpdatedMarks[1] + UpdatedMarks[2]) / 3);

		System.out.println(
				"Individual updated marks are:\n" + UpdatedMarks[0] + "\n" + UpdatedMarks[1] + "\n" + UpdatedMarks[2]);
		System.out.println("------------------");

		System.out.println("Average marks of all students is: " + avg);

	}
	/*
	 * Out put of the program is
	 * Individual updated marks are:
	 *	85
	 *	90
	 *	92
	 *	------------------
	 *	Average marks of all students is: 89.0
	 */

}
