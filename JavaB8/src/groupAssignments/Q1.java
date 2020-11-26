package groupAssignments;

public class Q1 {

	public static void main(String[] args) {
		//write a program to swap 2 numbers without a temporary variable?
		int num1 = 50;
		int num2 = 15;
		System.out.println("Before swapping first number is " + num1 + " and  second number is " + num2);
		num1 = num1 + num2;// 65
		num2 = num1 - num2; //50
		num1 = num1 - num2;// 15
		System.out.println("After swapping first number is " + num1 + " and second number is " + num2);

	}

}
