
import java.util.Scanner;
public class Task8 {
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
		

			System.out.print("How many scores do you want to input: ");

			int programRunTime = input.nextInt();


			System.out.print("ENTER A NUMBER: ");
			userNumber = input.nextInt();
			
			sum = userNumber;

			for (;scoreIndex < programRunTime;) {

			scoreIndex++;
			sum += userNumber;
			

			System.out.print("ENTER A NUMBER: ");
			userNumber = input.nextInt();

			if (userNumber <= 0) {

			System.out.printf("%nInvalid score%nScore cannot be zero or less%n%n");

			continue;
			
			} 
			
			else if (userNumber > 100) {

			System.out.printf("%nInvalid score%nScore cannot be zero or less%n%n");

			continue;

			}

			}

			System.out.printf("Sum of scores is %d%n", sum);


			
			
			
			
			


	}
}