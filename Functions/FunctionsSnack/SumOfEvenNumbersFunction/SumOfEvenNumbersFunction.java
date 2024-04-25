public class SumOfEvenNumbersFunction {

public static int findSumOfEven(int [] numbers) {


		int sum = 0;

		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] % 2 == 0) {

				sum += numbers[index];

			}
		}

		return sum;


	}


}