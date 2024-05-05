/*
write a program that prints the elements on odd positions in an array (Java)

the objective:
only elements of odd indexes should be printed

like index 0, 3, 5, 7, 9 and so on
*/


public class oddindexedElements {

public static void main(String [] args) {


int [] numbers = {1,2,3,4,5,6,7,8,9,10,11};

int oddElements = 0;

		for (int index = 0; index <= numbers.length; index++) {

			if (index % 2 == 0) {

			continue;

			} else {

			
			oddElements = index;
			
			}
		System.out.print(oddElements);
		}

	}

}