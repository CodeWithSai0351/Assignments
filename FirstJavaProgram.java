package com.cts.creatio.crm.language.basics;

import java.util.logging.Logger;
import java.io.*;

public class FirstJavaProgram {

	// This is the method

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("All the Best for new journey!");

		// print the formatted content
		System.out.printf("%s is good %d , %s is silent", "sai", 12, "sairam");
		System.out.println();

		System.out.write(65);
		System.out.println();

		System.out.println("Good Evening!");

		System.out.print("April ");
		System.out.print("Month");
		System.out.println();

		System.out.append("Next Planning ").append("in Jul");
		System.out.println();

		System.out.format("Current bill is %.2f ", 400.98765);
		System.out.println();

		Logger log = Logger.getLogger("test");
		log.info("working fine");
		log.warning("recheck the scenario");

		PrintWriter writer = new PrintWriter("/Users/somisettisairamkrishna/Test/data.txt");
		writer.print("Hi Sir Good Morning");
		writer.close();

		// debugging
		System.out.println("Debug>>" + 5 / (4 + 7 + 3));

		String name = "Ram";
		System.out.println(name);

	}

}
