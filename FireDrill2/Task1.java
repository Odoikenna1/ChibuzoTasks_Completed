
import java.util.Scanner;
public class Name {
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

			System.out.print(sum);


	}
}