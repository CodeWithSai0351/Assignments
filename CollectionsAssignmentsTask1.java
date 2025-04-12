package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsAssignmentsTask1 {

	/**
	 * 
	 * @author somisettisairamkrishna
	 */

	public static void main(String[] args) {

		List<Integer> citiesArea = new ArrayList<Integer>();
		Set<String> places = new HashSet<String>();
		int[] numbers = new int[10];
		List<String> movies = new ArrayList<String>();

		citiesArea.add(575300); // Sermersooq, Greenland
		citiesArea.add(522700); // Avannaata, Greenland
		citiesArea.add(353010); // Nagqu, China
		citiesArea.add(234545);// Hulunbuir, China
		citiesArea.add(178400);// Shigatse, China

		int totalArea = citiesArea.get(2) + citiesArea.get(3);

		System.out.println("--------------Task1--------------------");
		System.out.println("Total area of the 3rd and 4th citiesArea combined is " + totalArea + " square kilometers.");

		places.add("Eiffel Tower in Paris");
		places.add("Great Wall of China in China");
		places.add("Times Square in New York City USA");
		places.add("Disneyland Resort in USA");
		places.add("Grand Bazaar in Istanbul Turkey");
		places.add("Louvre Museum ib Paris France");	
		places.add("Colosseum in Rome Italy");
		places.add("Statue of Liberty in New York City USA");
		places.add("Machu Picchu in Peru");
		places.add("Taj Mahal in India");

		System.out.println("--------------Task2--------------------");

		System.out.println("The top 10 most visited tourist attractions in the world are :\n" + places);
		System.out.println("The size of the places Set is -" + places.size());

		numbers[0] = 9;
		numbers[1] = 99;
		numbers[2] = 999;
		numbers[3] = 9999;
		numbers[4] = 99999;
		numbers[5] = 999999;
		numbers[6] = 9999999;
		numbers[7] = 99999999;
		numbers[8] = 999999999;
		numbers[9] = 999999999;

		System.out.println("--------------Task3--------------------");

		System.out.println("Average of 5th and 6th Value is " + ((numbers[4] + numbers[5]) / 2));

		movies.add("Avatar (2009)");
		movies.add("Avengers: Endgame (2019)");
		movies.add("Avatar: The Way of Water (2022)");
		movies.add("Titanic (1997)");
		movies.add("Star Wars: Episode VII – The Force Awakens (2015)");

		System.out.println("--------------Task4--------------------");

		System.out.println("The third movie on the list is " + movies.get(2));

	}
	/**
	 * Output of the program is :
	 * 
	 * --------------Task1-------------------- Total area of the 3rd and 4th
	 * citiesArea combined is 587555 square kilometers.
	 * 
	 * --------------Task2-------------------- The top 10 most visited tourist
	 * attractions in the world are : [Statue of Liberty in New York City USA, Taj
	 * Mahal in India, Eiffel Tower in Paris, Times Square in New York City USA,
	 * Great Wall of China in China, Colosseum in Rome Italy, Disneyland Resort in
	 * USA, Machu Picchu in Peru, Grand Bazaar in Istanbul Turkey, Louvre Museum ib
	 * Paris France]
	 * 
	 * The size of the places Set is -10
	 * 
	 * --------------Task3-------------------- Average of 5th and 6th Value is
	 * 549999
	 * 
	 * --------------Task4-------------------- The third movie on the list is
	 * Avatar: The Way of Water (2022)
	 */

}
