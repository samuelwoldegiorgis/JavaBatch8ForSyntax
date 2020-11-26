package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan;
		int quiz, mid, finalScore, avg;
		
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your quiz score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter your midterm score");
		mid=scan.nextInt();
		
		System.out.println("Please enter your final score");
		finalScore=scan.nextInt();
		
		avg=(quiz+mid+finalScore)/3;
		
		if(avg>90) {
			System.out.println("Grade = A");
			
		}else if(avg>=70 && avg<90) {
			System.out.println("Grade =B");
		}else if(avg>=50 && avg<=70 ) {
			System.out.println("Grade =C");
			System.out.println("Please study more");
		}else if(avg<50 && avg<=70) {
			System.out.println("Grade =D");
		}else {
			System.out.println("Grade =F");
			System.out.println("Please study more");
		}
//if your grade is A or B --> you are a good student and good job!
	}

}
