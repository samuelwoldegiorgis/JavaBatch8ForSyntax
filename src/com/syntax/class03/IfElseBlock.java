package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		double money = 5;
		double iceCream = 4.59;

		if (money >= iceCream) {
			System.out.println("I am buying ice cream");
		} else {
			System.out.println("Sorry, no ice cream {{{");

		}
		System.out.println("I am code that excutes without any condition");
	
		System.out.println("____________________________");
		
		boolean sleepy=false; 
		//if not sleepy --> I will study otherwise i will take a nap
		
		if(sleepy) {
			System.out.println("I will take a nap");
		}else {
			System.out.println("I will study some Java");
		}
		System.out.println("___________________");
		
		boolean hungry=false;
		if(hungry) {
			System.out.println("I will go eat");
		}else {
			System.out.println("I will continue studying");
		}
	}

}
