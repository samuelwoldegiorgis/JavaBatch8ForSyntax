package groupAssignments;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 66, 45, 65, 32, 876, 900 };
		int max = myArray[0];
		int size = myArray.length;
		int min = myArray[size - 1];
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
			if (min > myArray[i]) {
				min = myArray[i];
			}
		}
		System.out.println("the largest number in array is :" + max);
		System.out.println("the smallest number in array is :" + min);
	}

}
