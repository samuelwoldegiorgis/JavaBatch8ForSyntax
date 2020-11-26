package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * variable for allergy yes or no
		 * 
		 * if allergy is yes--> 
		 * we will check if pet allergy 
		 *               if peanut allergy
		 *               if pollen allergy
		 * if no allergy you are lucky!!!              
		 */

		boolean allergy=false;
		boolean petAllergy=true;
		
		
		if(allergy) {//true
			System.out.println("Let's do further check");
		  if(petAllergy) {
			  System.out.println("Please have no home pets");
		  }else {
			System.out.println("That is good you do not have pet allergy");
		}
		}else {
			System.out.println("You are lucky");
		}
	
		/*If today is Friday 
		 * 
		 * 
		 * 
		 */
	
		boolean isFriday=true;
		int date=13;
		boolean monday=true;
		
		if (isFriday) {
		
		 if(date==13) {
			 System.out.println("I will watch sacry movie");
		 }else {
			 System.out.println("I will watch pk movie with Amir Khan");
		 }    
	
	   }else {
		   if(monday) {
			   System.out.println("I am not studying , I am working");
		   }else {
			   System.out.println("I have class at Syntax");
		   
		 }
	
	   /*check if assignment is completed
	    * if assignment is completed:
	    *     if score >90 --> great job
	    *  
	    *     if score >80 --> good job
	    *     if score >70 --> study more
	    */    
		   //debug your code late and analyze what is the issue!!
		   //don't make that mistake!
		   
		   int score =92;
		   boolean assignment=true;
		   
		   if (assignment) {
			   if(score>90) {
				   System.out.println("You did great!!!");
			   }else if(score>80) {
				   System.out.println("You did good !");
			   }else if(score>70) {
				   System.out.println("Probably you need to study more");
			   }else {
				   System.out.println("Good job for but you must study!");
			   }
		   }else {
			   System.out.println("you should always complete all assignments");
		   
		   }
		   
	   }
	  }
	}
