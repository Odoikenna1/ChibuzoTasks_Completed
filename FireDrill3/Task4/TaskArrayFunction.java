

public class TaskArrayFunction {

	public static int[] arrayOfEvenNumbers(int[] numbers) {


		int add = 0;

			int half = numbers.length/2;

			if (half % 2 == 0) {
				
			half += 1;

			}

		int [] evenArrayElements = new int[half];

		

			for (int index = 0; index < numbers.length;  index+=2) {
				evenArrayElements[add] = numbers[index];
			add++;
			}

		

		return evenArrayElements;
		
	}
}