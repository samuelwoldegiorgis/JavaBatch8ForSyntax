package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan;
		double workedYears;
		int annualSalary;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter number of worked years");
		workedYears=scan.nextDouble();
		if (workedYears>=5) {
			System.out.println("Your are eligible for a bonus!");
			System.out.println("Please enter your annual salary");
			annualSalary=scan.nextInt();
			if(annualSalary>50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}
		}else {
			System.out.println("Sorry, no bonus for you");
			}
		}

	}


