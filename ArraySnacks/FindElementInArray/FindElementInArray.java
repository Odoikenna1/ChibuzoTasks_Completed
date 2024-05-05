/*write a function that checks whetheran element occurs in an array:

*/


public class FindElementInArray {
	public static void main(String[] args) {


		//initialize variables

	     int [] arrayOfNumbers =  {1,2,3,4,5,6,7,8};

	     int toBeFound = 9;

	     boolean found = false;
		
	     for (int index = 0; index < arrayOfNumbers.length; index++) {

		if (arrayOfNumbers[index] == toBeFound) {

			found = true;

			break;

		}
	     }

	    if (found) {

	     System.out.println(toBeFound + " has been found.");

	    } else {

	     System.out.println(toBeFound + " is not found.");

	    }

	}
}