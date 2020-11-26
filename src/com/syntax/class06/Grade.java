package com.syntax.class06;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
	/*
	 * Allow user to enter grade
     * and then provide explanation: A-Excellent,
     * B-Good, C-Average, D-Bad, any other grade -->
     * Not Acceptable. At the end your program should
	 *  print which grade was entered by a user
	 *  with explanation  
	 */

		Scanner userIn;
		String grade;
		String explanation;
		userIn = new Scanner(System.in);
		System.out.println("Please enter your Grade");
		grade = userIn.nextLine();
		switch (grade.toLowerCase()) {
		case "A":
			explanation = "A - Excellent";
			break;
		case "B":
			explanation = "B - Good";
			break;
		case "C":
			explanation = "C - Average";
			break;
		case "D":
			explanation = "D - Bad";
			break;
		default:
			explanation = "Not Acceptable";
					}
		System.out.println(explanation);
		
		
	}

}
