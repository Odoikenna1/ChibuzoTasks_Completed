
import java.util.Scanner;
public class Task3 {
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

			System.out.printf("The total is %d%nThe average is %.2f", sum, average);


	}
}