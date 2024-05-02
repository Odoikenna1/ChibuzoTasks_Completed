
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {

		//collect input if necessary
		
		Scanner input = new Scanner(System.in);


		//initialize variables

		int sum = 0 ;
		int scoreIndex = 0;
		int evenNumberCounter = 0;
		int sumOfEvenNumbers = 0;
		


			for (int count = 0; count < 10; count++) {

			System.out.print("ENTER A NUMBER: ");
			int userNumber = input.nextInt();

			sum += userNumber;
			scoreIndex++;

			if (userNumber % 2 == 0) {
			
			evenNumberCounter++;
			
			sumOfEvenNumbers += userNumber;

			}

			
			}	


			System.out.printf("Number of even numbers entered %d%n Sum of even numbers enetered is  %d", evenNumberCounter, sumOfEvenNumbers);



	}
}