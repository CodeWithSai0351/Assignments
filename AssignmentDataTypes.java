package com.cts.creatio.crm.language.basics;

public class AssignmentDataTypes {

	/**
	 * @author somisettisairamkrishna
	 * @return no output
	 */

	public static void main(String[] args) {

		// Storing the values as a integer
		int year = 2025;
		int empcount = 500;

		// Storing the values as a boolean
		boolean orderStatus = true;
		boolean maritalStatus = false;

		// Storing the values as a Character
		char bloodType = 'A';

		// Storing the values as a String
		String emailaddress = "john.doe@example.com";
		String phoneNumber = "123-456-7890";
		String time = "2:30 PM";
		String country = "India";
		String eyecolor = "Black";
		String birthPlace = "New York City";
		String designation = "SoftwareEngineer";
		String color = "orange";
		String bookTitle = "To Kill a Mockingbird";

		// Storing the values as a double
		double distance = 200.5;
		double temp = 25.5;
		double rating = 7.5;
		double latitude = 37.7749;
		double longitude = -122.4194;
		double amount = 1000.50;

		// Storing the values as a long
		long subscribercount = 1000000;

		// Displaying the values

		/*
		 * println method is used to print data followed by a new line printf method
		 * provides formatted output format method is used for creating formatted
		 * strings we want to store
		 */

		System.out.println("Temperature of a city in degrees Celsius -" + temp);

		System.out.println("Whether a customer has placed an order -" + orderStatus);

		System.out.println("Person's phone number -" + phoneNumber);

		System.out.format("Amount of money in a customer's bank account %.2f ", amount);
		System.out.println();

		System.out.printf("Person's email address is " + emailaddress);
		System.out.println();

		System.out.println("Coordinates of a location latitude is " + latitude + " and longitude is " + longitude);

		System.out.println("Person's marital status " + maritalStatus);

		System.out.println("Person occupation is " + designation);

		System.out.println("Person favourite colour is " + color);

		System.out.println("Current year is " + year);

		System.out.format("Number of followers on a social media platform is " + subscribercount);
		System.out.println();

		System.out.println("Movie rating is " + rating);

		System.out.println("Blood Group is '" + bloodType + "'");

		System.out.println("Title of a book is " + bookTitle);

		System.out.println("Number of employees in a company is " + empcount);

		System.out.println("Time of an event is " + time);

		System.out.println("Name of a country " + country);

		System.out.println("Person's eye color " + eyecolor);

		System.out.println("Person birth place is " + birthPlace);

		System.out.println("Distance between two cities is " + distance);

	}
	/* Output of the program is >>
	 * 
	 * Temperature of a city in degrees Celsius -25.5
	Whether a customer has placed an order -true
	Person's phone number -123-456-7890
	Amount of money in a customer's bank account 1000.50 
	Person's email address is john.doe@example.com
	Coordinates of a location latitude is 37.7749 and longitude is -122.4194
	Person's marital status false
	Person occupation is SoftwareEngineer
	Person favourite colour is orange
	Current year is 2025
	Number of followers on a social media platform is 1000000
	Movie rating is 7.5
	Blood Group is 'A'
	Title of a book is To Kill a Mockingbird
	Number of employees in a company is 500
	Time of an event is 2:30 PM
	Name of a country India
	Person's eye color Black
	Person birth place is New York City
	Distance between two cities is 200.5
	 */

}


