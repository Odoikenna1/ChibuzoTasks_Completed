import java.util.Scanner;
public class AnnoyingNumberRequestProgram {
	public static void main(String[] args) {

		int flagValue = 0;
		
		boolean isRunning = true;

		while (isRunning) {

			Scanner input = new Scanner(System.in);
			System.out.print("\nENTER A NUMBER: ");
			int userInput = input.nextInt();
			

			if (userInput >  flagValue) {

				System.out.printf("%nYour input is %d%nIt is a positive value %nHave another go!%n", userInput);

			} else if (userInput <  flagValue) {

				System.out.printf("%nYour input is %d%nIt is a negative value %nHave another go!%n", userInput);

			} else {

				isRunning = false;
			}

			

		}
		
	}
}