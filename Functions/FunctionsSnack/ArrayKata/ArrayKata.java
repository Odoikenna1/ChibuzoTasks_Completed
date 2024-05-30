public class ArrayKata {

	public static int[] findOddNumbers (int[] arrayOfNumbers) {



		int oddNumberCounter =  0;

		//int [] numbers = arrayOfNumbers[0];


			for (int index = 0; index < arrayOfNumbers.length; index++) {

				if (arrayOfNumbers[index] % 2 == 0 ) {

					continue;


				}

				oddNumberCounter++;
			}	
			
			return oddNumberCounter;

	}




















}