package com.cts.creatio.crm.language.basics;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] university = new String[5][2][6];

		university[0][0][0] = "M1";
		university[0][0][1] = "Physics";
		university[0][0][2] = "Chemistry";
		university[0][0][3] = "Computer Programming";
		university[0][0][4] = "Drawing";
		university[0][0][5] = "Basic Electrical Engineering";

		university[0][1][0] = "Pass(78)";
		university[0][1][1] = "Pass(85)";
		university[0][1][2] = "Fail(21)";
		university[0][1][3] = "Pass(74)";
		university[0][1][4] = "Pass(88)";
		university[0][1][5] = "Pass(79)";

		university[1][0][0] = "M2";
		university[1][0][1] = "Mechanics";
		university[1][0][2] = "EnvironmentalScience";
		university[1][0][3] = "Basic Electronics";
		university[1][0][4] = "Engineering Physics";
		university[1][0][5] = "Engineering Graphics";

		university[1][1][0] = "Pass(82)";
		university[1][1][1] = "Pass(77)";
		university[1][1][2] = "Pass(93)";
		university[1][1][3] = "Fail(19)";
		university[1][1][4] = "Fail(24)";
		university[1][1][5] = "Pass(90)";

		university[3][0][0] = "Algorithms";
		university[3][0][1] = "Computer Networks";
		university[3][0][2] = "Database Systems";
		university[3][0][3] = "Microprocessors";
		university[3][0][4] = "Communication Engineering";
		university[3][0][5] = "Software Engineering";

		university[3][1][0] = "Pass(91)";
		university[3][1][1] = "Pass(73)";
		university[3][1][2] = "Fail(19)";
		university[3][1][3] = "Pass(80)";
		university[3][1][4] = "Pass(76)";
		university[3][1][5] = "Pass(87)";

		System.out.println("Semister 2 Subject 4 name is " + university[1][0][3]);
		System.out.println("Semister 2 Subject 5 name is " + university[1][0][4]);
		System.out.println("Semister 4 Subject 3 name is " + university[3][0][2] + " and status/marks are -"
				+ university[3][1][2]);
		System.out.println("Semister 4 Subject 6 name is " + university[3][0][5] + " and status/marks are -"
				+ university[3][1][5]);

		// university[0][0][6]="Test";

		// university[0][1][0]="Pass(78)";

		// String[][][] test={
		// {{"M1","Physics","Chemistry","CP","Drawing","BEE"},{"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Passs(88)","Pass(79)"}}};
		
		/* output of the program is
		 * Semister 2 Subject 4 name is Basic Electronics
		   Semister 2 Subject 5 name is Engineering Physics
		   Semister 4 Subject 3 name is Database Systems and status/marks are -Fail(19)

		 * 
		 */

	}

}
