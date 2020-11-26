package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		int num=80;
		String str="I am a String";
		
		Scanner scan=new Scanner(System.in);//enable input to the console
		System.out.println("please enter any text");
		
		String value=scan.nextLine();//waits for your input
		 //and once you provided input-->hit Enter
		 
		 
		 
		 System.out.println("I captured string value="+value);
         System.out.println("Please enter your name");
		  String name= scan.nextLine();
		 System.out.println("Nice to meet you "+name);
	}

};
