
import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {

		//collect input if necessary
		
		Scanner input = new Scanner(System.in);


		//initialize variables

		int sum = 0 ;
		int scoreIndex = 0;
		


			for (int count = 0; count < 10; count++) {

			System.out.print("ENTER A NUMBER: ");
			int userNumber = input.nextInt();

			sum += userNumber;
			scoreIndex++;

			System.out.printf("Score %d is %d%nThe sum is %d",scoreIndex, userNumber, sum);
			}	

			//double average = sum / 10;

			


	}
}