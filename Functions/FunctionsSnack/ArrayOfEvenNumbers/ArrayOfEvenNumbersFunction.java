


public class ArrayOfEvenNumbersFunction {

	public static int[] buildArrayOfEvenNumbers(int[] numbers) {

			int [] numbers;
			int [] evenNumbers = numbers[0];

			
			for (int index = 0; index < numbers.length; index++) {

				if (numbers[index] % 2 == 0) {

					evenNumbers = numbers[index];

				}


			}	

		
			int [] arrayOfevenNumbers = new int[0];


		for (int index = 0; index < evenNumbers.length; index++) {

				arrayOfevenNumbers[0] = numbers;

			System.out.printf("Here is an array of even numbers from the original array %s%n", arrayOfevenNumbers[index] + " ");

		}

		return arrayOfevenNumbers;
		
	}
}