import java.util.Arrays;

public class DoubleArrayLength {

	public static int[] increaseArrayLength(int[] input) {

	int[] newArray = new int[input.length * 2];

	int counter = input.length;

	for (int i = 0; i < input.length; i++) {	
		newArray[i] = input[i];								
	}
		for (int j = 0; j < input.length; j++) {
			newArray[counter] = input[j] * 2;
		counter++;
		}

		return newArray;
	
	}

public static void main(String[] args){

int[] array = {1,2,3,4,5,6,7,8,9,10};

int[] result = increaseArrayLength(array);

System.out.print(Arrays.toString(result));

}

}