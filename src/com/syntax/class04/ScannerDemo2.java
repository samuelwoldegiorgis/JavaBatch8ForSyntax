package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 System.out.println("Please enter boolean for rain");

	 boolean rain=input.nextBoolean();
	 
	 if(rain) {
		 System.out.println("Please take an umbrella");
		 
	 }else {
		 System.out.println("It is a nice weather so go for a walk");
	 }
	 System.out.println("________________let's capture integer value__________");
	System.out.println("Please enter your name");
	String name=input.next();
	
	 System.out.println("Please enter your age");
	int age=input.nextInt();
	
	System.out.println("Your name is "+name+" you are "+age+" years old");
	}


}
