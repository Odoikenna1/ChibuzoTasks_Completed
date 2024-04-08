import java.util.Scanner;

public class InputChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num1 = input.nextInt();

        if ( num1 > 100) {
            System.out.println("Input valid. \nPlease enter a number less than: 100.");
            
        }
        else {
            System.out.printf("Your score is %d%n You passed the test", num1);
        }
    }
}