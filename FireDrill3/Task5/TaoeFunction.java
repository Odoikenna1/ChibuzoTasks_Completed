

public class TaoeFunction {

	public static int[] arrayOfOddNumbers(int[] arrayOfNumbers) {


		int add = 0;

			int half = arrayOfNumbers.length/2;

			if (half % 2 == 0) {
				
			half += 1;

			}

		int [] oddArrayElements = new int[half];

		

			for (int index = 1; index < arrayOfNumbers.length;  index+=2) {
				oddArrayElements[add] = arrayOfNumbers[index];
			add++;
			}

		

		return oddArrayElements;
		
	}
}