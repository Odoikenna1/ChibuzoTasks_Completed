import java.util.Scanner;
public class FactorialProgram {
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		System.out.print("ENTER A NUMBER: ");
		
		int userInput = input.nextInt();


		int factor = 0;

		for (int count = 1; count <= userInput; count++){

			if (userInput % count == 0) {

			System.out.println(count);
			
			}
		}



	}
}


