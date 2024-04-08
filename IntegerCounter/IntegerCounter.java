import java.util.Scanner;
public class IntegerCounter {
	public static void main(String[] args) {
		

	
	int numberOfZeros = 0;
	int positiveNumber = 0;
	int negativeNumber = 0;	
	
	Scanner input = new Scanner(System.in);

	System.out.print("\nHOW MANT TIMES DO YOU WANT TO USE THIS PROGRAM? ");
	int userInput = input.nextInt();

	for (int counter = 0; counter < userInput; counter++) {
		
		Scanner inputEntry = new Scanner(System.in);

		System.out.print("\nENTER A NUMBER: ");
		int userNumber = inputEntry.nextInt();


		if (userNumber == 0) {
			
			numberOfZeros+=1;

		} 
		if (userNumber >= 1 && userNumber <= 1_000_000) {

			positiveNumber+=1;

		}
		if (userNumber <= -1 && userNumber >= -1_000_000) {

			negativeNumber+=1;

		}
	
	}
		System.out.printf("%nNumber of zeros are %d%nPositive number are %d%nNegative numbers are %d%n", numberOfZeros, positiveNumber, negativeNumber);

	}
}