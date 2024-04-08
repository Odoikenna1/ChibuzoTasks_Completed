import java.util.Scanner;
public class SumOfDigitsInAnInteger {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("ENTER A NUMBER BETWEEN 0 AND 100: ");
		int userNumber = input.nextInt();

		int sum = 0;

		while (userNumber > 0) {

			int digit = userNumber % 10;

			sum += digit;

			userNumber /= 10; 		

		}

		System.out.print(sum);


	}
}