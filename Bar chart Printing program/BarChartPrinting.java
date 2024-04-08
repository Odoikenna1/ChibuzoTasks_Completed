
import java.util.Scanner;
public class BarChartPrinting {
	public static void main(String[] args) {
		
		

		//processing phase

			//use iteration statements**

			for (int count = 0; count < 5; count++) {
			

				Scanner input = new Scanner(System.in);

				System.out.print("\nENTER NUMBERS BETWEEN 1 AND 30: ");

				int userNumber = input.nextInt();

				int counterC = 0;
				
				 while (counterC < userNumber) {
					
					System.out.print("*");

				  counterC++;

				}
				  System.out.print("");
				

			}	

			


	}
}