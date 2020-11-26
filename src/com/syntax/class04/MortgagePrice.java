package com.syntax.class04;

public class MortgagePrice {

	public static void main(String[] args) {
		double rate=4.5, mortgagePrice=1500;
		
		if (rate>4.5) {
			System.out.println("You can not buy the house");
		}else {
			
	       if(mortgagePrice > 20000) {
				System.out.println("I need to get loan");
	    	}else {
				System.out.println("I am reach that i can pay cash");
			}
		}
				

	}

}
