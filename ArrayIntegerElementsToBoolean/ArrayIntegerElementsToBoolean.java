import java.util.Arrays;
public class ArrayIntegerElementsToBoolean {


	public static boolean returnABool(int x){

		if (x % 2 == 0) return false;

		else return true;

	}

	public static boolean[] arrayOfBoolValues(int[] y){

		boolean[] newArray = new boolean[y.length];

		for (int i = 0; i < y.length; i++) {

			newArray[i] = returnABool(y[i]);
		}
	return newArray;
	}

	public static int[] arrayOfNumbers(int[] y){

		int[] newArray = new int[y.length];

		for (int i = 0; i < y.length; i++) {

			newArray[i] = y[i];
		}
	return newArray;
	}
	

	public static void main(String[] args) {
	int [] array = {4,5,8,8,8,2,9};
	System.out.println("Sample input:" + Arrays.toString(arrayOfNumbers(array)));
	boolean[] result = arrayOfBoolValues(array);

		System.out.print("Output array:" + Arrays.toString(result));


	}
}