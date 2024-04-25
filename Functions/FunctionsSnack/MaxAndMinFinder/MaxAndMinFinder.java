
public class MaxAndMinFinder {

	public static void main(String[] args) {

		int [] numbers =  {11,8,66,14,31,47,19,3};

		int values[] = MaxAndMinFinderFunction.findMinAndMaxValues(numbers);

			System.out.printf("The minimum is %s%n", values[0] + " ");

			System.out.printf("The maximum is %s%n", values[1]);


	}
}