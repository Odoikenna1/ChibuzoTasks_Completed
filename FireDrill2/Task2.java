
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {

		//collect input if necessary
		
		Scanner input = new Scanner(System.in);


		//initialize variables

		int sum = 0 ;
		


			for (int count = 0; count < 10; count++) {

			System.out.print("ENTER A NUMBER: ");
			int userNumber = input.nextInt();

			sum += userNumber;

			}	

			double average = sum / 10;

			System.out.printf("%nThe average is %.2f", average);


	}
}