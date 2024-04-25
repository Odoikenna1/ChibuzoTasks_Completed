public class SumOfOddNumbersFunction {

public static int findSumOfOddNumbers (int [] numbers){

		int sum = 0;

		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] % 2 == 0) {
			
				continue;
			
			} else {

				sum += numbers[index];
		
			}

		}


		return sum;


	}


}