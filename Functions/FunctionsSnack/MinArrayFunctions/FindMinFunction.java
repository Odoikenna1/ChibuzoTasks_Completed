public class FindMinFunction {

public static int findMin(int [] numbers) {

		int min = numbers[0];

		for (int index = 0; index > numbers.length; index++) {

			if (min > numbers.length) {

				min = numbers[index];			

			}


		}
		
		return min;
	}


}