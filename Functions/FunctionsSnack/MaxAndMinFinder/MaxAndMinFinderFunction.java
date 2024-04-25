
public class MaxAndMinFinderFunction {

	public static int[] findMinAndMaxValues(int[] numbers) {


		int max =  numbers[0];

		int min = numbers[0];

			for (int index = 0; index < numbers.length; index++) {

				if (max < numbers[index]) {
				
					max = numbers[index];

				}
				
				if (min > numbers[index]) {

					min = numbers[index];
				}
			}	
		
			int [] minMaxValues = new int [2];

			minMaxValues[0] = min;

			minMaxValues[1] = max;
		
			return minMaxValues;


			

	}
}