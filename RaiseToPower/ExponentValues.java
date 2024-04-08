import java.util.Scanner;
public class ExponentValues {
	public static void main(String[] args) {
		

		int exponentialValue = 1;

		Scanner input = new Scanner(System.in);

		System.out.print("\nENTER FIRST NUMBER: ");
		int base = input.nextInt();
		
		System.out.print("\nENTER SECOND NUMBER: ");
		int power = input.nextInt();
		
		for (;power > 0;) {

		exponentialValue = exponentialValue * base;
		
			power--;		
		}

		System.out.printf("%nExponent value of your input is %d%n", exponentialValue);

	}
}



