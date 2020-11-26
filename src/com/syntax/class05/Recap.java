package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner scanner;
		scanner=new Scanner(System.in);
		
		//I want to capture sentence:
		String sentence=scanner.nextLine();
		
		System.out.println("You entered sentence: "+sentence);
		
 int number=scanner.nextInt();
 System.out.println("You entered number: "+number);
 
 System.out.println("Please enter any single word");
 String word=scanner.next();
 System.out.println("You entered number: "+word);
 
 System.out.println("Please enter any single character");
 char singleCharacter=scanner.next().charAt(0);
 System.out.println("You entered number: "+singleCharacter);
 
	}

}
