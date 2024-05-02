
import java.util.Scanner;
public class Task6 {
	public static void main(String[] args) {

		//collect input if necessary
		
		Scanner input = new Scanner(System.in);


		//initialize variables

		int sum = 0 ;
		int scoreIndex = 0;
		double averageOfEvenScores = 0;	
		int sumOfEvenNumbers = 0;	
		int userNumber = 0;
		


			for (int count = 0; count < 10; count++) {

			System.out.print("ENTER A NUMBER: ");
			userNumber = input.nextInt();

			sum += userNumber;
			scoreIndex++;

			if (userNumber % 2 == 0) {

			sumOfEvenNumbers += userNumber;

			averageOfEvenScores = sumOfEvenNumbers / userNumber;

			
			
			}

			 
			}

			System.out.printf("The average is %f%n", averageOfEvenScores);

			
			
			
			


	}
}