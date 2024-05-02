
import java.util.Scanner;
public class Task7 {
	public static void main(String[] args) {

		//collect input if necessary
		
		Scanner input = new Scanner(System.in);


		//initialize variables

		int sum = 0 ;
		int scoreIndex = 0;
		double averageOfEvenScores = 0;	
		int sumOfEvenNumbers = 0;
		int evenNumberCounter = 0;	
		int userNumber = 0;
		


			for (int count = 0; count < 10; count++) {

			System.out.print("ENTER A NUMBER: ");
			userNumber = input.nextInt();

			sum += userNumber;
			scoreIndex++;

			if (userNumber % 2 == 0) {

			evenNumberCounter++;

			sumOfEvenNumbers += userNumber;

			averageOfEvenScores = sumOfEvenNumbers / evenNumberCounter;
			
			}

			 
			}

			System.out.printf("Number of even numbers entered %d%nThe sum of the even numbers entered is %d%nThe average is %f%n", evenNumberCounter, sumOfEvenNumbers, averageOfEvenScores);

			
			
			
			


	}
}