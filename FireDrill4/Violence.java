/*write a function that takes an array and return an array of booleans 
where even numbers are replaced with false and odd with true

4,5,8,8,8,29

false,true,false,false,false, false, true */


/*a function that takes an array and return an array double the length
empty spaces should be filled with double the element of the input array

int[] array = {4,5,8};

4,5,8,8,10,16 */

import java.util.Arrays;

public class Violence {

public static void main(String[] args){

	int[] numbers = {4,5,8};

	int[] newArray = new int[0];

		for (int i = 0; i < numbers.length; i++) {
		
			newArray[i] = numbers[i];
			newArray[i + numbers.length] = numbers[i]*2;

		}

		System.out.print(Arrays.toString(newArray));
	}

}






