package com.syntax.class04;

public class CheckingScore {

	public static void main(String[] args) {
		
		/*store a boolean value
		 *  if you have diploma or not
		 *     -->
		 * 
		 * 
		 */

		boolean hasDiploma=true;
		double gpa=3.5;
		if(hasDiploma) {
			System.out.println("Congratulations!");
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		
		}else {
			System.out.println("go get degree!");
		}
		
	}

}
