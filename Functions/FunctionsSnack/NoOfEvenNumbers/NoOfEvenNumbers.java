import java.util.Arrays;

public class NoOfEvenNumbers {

	public static void main(String[] args) {


		int [] arrayOfNumbers =  {1,2,3,4,5,6,7,8,9,10,11};

		int[] numbers = new int[11];


		int [] evenNumbersArray = NoOfEvenNumbersFunction.findEvenNoCount(numbers);


		System.out.println(Arrays.toString(numbers));


	}
}