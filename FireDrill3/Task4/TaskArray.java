import java.util.Arrays;

public class TaskArray {

	public static void main(String[] args) {


		int [] numbers =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};

		int [] result = TaskArrayFunction.arrayOfEvenNumbers(numbers);

		System.out.print(Arrays.toString(result));	


	}
}


/*
Create an array, give it values

loop through the array index

use an if statement to check if an index is an even number

if it is, assignthe value of the index to another array
*/