/*

Write a function that reverses a list

We know that manipulation an array requires you to 
use a loop.

It also requires you to use the index numbers of any given element in the array;
in order for you to manipulate or muttae the structure of the array

Steps
1: initialize your array

2: declare another in array but leave it empty

3: objective; try to find the the last index of the array element
	then re-assign the last element to the index of the first element,
	the 2nd index element to the second index and repeat this acton
	sequenciatly until all the lements have been re-assigned(reveresed)

4: print out the reveresed version

Bonus: Do this with an array of strings, just because -\_(:-)_/-

*/


public class ArrayInReverse {

public static void main(String [] args) {

		int [] numbers = {10,9,8,7,6,5,4,3,2,1};



		System.out.println("The original array");

		for (int index = 0; index < numbers.length; index++) {
	
		System.out.print(numbers[index] + " ");		

		}



		System.out.println("\nTh reversed array");
		
		for (int index = numbers.length -1; index >= 0; index--) {

		
	
		System.out.print(numbers[index] + " ");		

		}




	}
}
