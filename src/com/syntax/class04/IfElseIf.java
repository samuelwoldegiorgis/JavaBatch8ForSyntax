package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		/*
		 * we need to compare 2 numbers
		 * bigger, smalller or equal
		 */
	
	int num1=19;
	int num2=99;
	
	if(num1>num2) {//what is this condition is true
		System.out.println(num1+"is bigger than "+num2);
	}else if (num1<num2) {//what if this true
		System.out.println(num1+" is smaller than "+num2);
	}else {
		System.out.println(num1+" is equal to "+num2);
		
	}
	
	System.out.println("_____________________-");
	
	/*Based on the day of the week we will print class schedule
	 * 
	 * 
	 */
	
	int day=7;
	
	if(day==1) {
		System.out.println("Today is Monday we have no class");
	}else if(day==2) {
		System.out.println("Today is Tuesday we have manual class");
	}else if(day==3) {
		System.out.println("Today is Wednesday and we have Manual class again");
	}else if(day==4) {
		System.out.println("Today is Thursday and we have Review class");
	}else if(day==5) {
		System.out.println("Today is Friday but i have class tomorrow and i will prepare");
	}else {
		System.out.println("Today is Saturday , I miss Java classes");
	}
		
	
	
	}

}
