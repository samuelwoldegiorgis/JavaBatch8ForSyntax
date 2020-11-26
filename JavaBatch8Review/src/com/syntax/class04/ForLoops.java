package com.syntax.class04;

public class ForLoops {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<11; i++) {
			System.out.println("sum till "+i+ " " +(sum=sum+i));
		}
		 sum=0;
		for(int i=10; i<0; i++) {
			System.out.println("sum till "+i+ " " +(sum=sum+i));
		}
	}

}
