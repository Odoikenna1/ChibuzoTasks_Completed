/*What is a function
How do you define a function
How you call a function
*/


public class SumOfArrayElements {

	public static int sumElements(int [] numbers) {

	int sumofArray = 0;

	for (int index = 0; index < numbers.length; index++) {

		sumofArray += numbers[index];
	}

		return sumofArray;

	}

}