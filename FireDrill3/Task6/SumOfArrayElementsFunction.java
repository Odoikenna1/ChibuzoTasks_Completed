

public class SumOfArrayElementsFunction {

	public static int[] sumArrayElements(int[] arrayOfNumbers) {


		int add = 0;

			int half = arrayOfNumbers.length/2;

			if (half % 2 == 0) {
				
			half += 1;

			}

		int [] sumOfElements = new int[half];

		

			for (int index = 0; index < arrayOfNumbers.length;  index+=2) {

				arrayOfNumbers[add] += arrayOfNumbers[index];

			add++;
			}

		

		return sumOfElements;
		
	}
}