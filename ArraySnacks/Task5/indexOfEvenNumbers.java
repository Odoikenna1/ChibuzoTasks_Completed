/*
write a program that prints the elements on even positions in an array (Java)
*/

public class indexOfEvenNumbers {

public static void main(String[] args) {

		int [] numbers = {1,2,3,4,5,6,7,8,9,10,11};

		int indexOfEvenNumbers = 0;

		for (int index = 0; index < numbers.length; index++) {
	
			if (numbers[index] % 2 == 0) {

			indexOfEvenNumbers = numbers[index];

			System.out.println(indexOfEvenNumbers);

			//break;

			}
		
		}
		
		


	}

}