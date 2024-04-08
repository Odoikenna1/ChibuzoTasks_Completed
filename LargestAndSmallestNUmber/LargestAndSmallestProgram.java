import java.util.Scanner;
public class LargestAndSmallestProgram {
	public static void main(String[] args) {
		
	int minNumber = Integer.MAX_VALUE;
	int maxNumber = Integer.MIN_VALUE;


		Scanner numOfInputs = new Scanner(System.in);

		System.out.print("\nHOW MANY TIMES DO YOU WANT THIS PROGRAM TO RUN FOR? ");
		int userNumOfInputs = numOfInputs.nextInt();


		for (int counter = 0; counter < userNumOfInputs; counter++) {

			Scanner integerChecker = new Scanner(System.in);

			System.out.print("ENTER A NUMBER: ");

			int inputNumber = integerChecker.nextInt();

				if (inputNumber <  minNumber) {
					
					minNumber = inputNumber;
					

				} else if (inputNumber >  maxNumber) {

					maxNumber = inputNumber;				

				}


		}

		System.out.printf("%nThe smallest number is %d%n%nThe Largest number is %d", minNumber, maxNumber);


	}
}