/*
Find the max elemnet in an array

*/


public class MaxFunction {

public static int findMax(int [] arrayOfMercies) {

		int max = arrayOfMercies[0];

		for (int index = 0; index < arrayOfMercies.length; index++) {

			if (max < arrayOfMercies[index]) {

				max = arrayOfMercies[index];

			}

		}

		return max;
	}
}
