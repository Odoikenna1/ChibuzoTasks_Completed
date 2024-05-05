public class LargestInArray {

public static void main(String[] args) {

		// intialize variables

		int [] numbers = {1,23,45,28,63,31,6,3};

		int max = numbers[0];

		for (int index = 0; index < numbers.length; index++) {

			if (max < numbers[index]) {
			
			max = numbers[index];

			}

		}

		System.out.println(max);

	}
}