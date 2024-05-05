import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {

    public static void main(String[] args) {

        int[] userInputs = new int[5];

        int userInput = 0;

        Scanner input = new Scanner(System.in);


            for (int i = 0; i < 5; i++) {
		boolean flag = false;
		while(!flag) {

                try {

                    System.out.print("Enter a number: ");
                    userInput = input.nextInt();

                    userInputs[i] = userInput;
			flag = true;
                } catch (InputMismatchException e) {

                    System.out.println("Wrong input, please enter a number!");
                    input.next();
			//flag = false;

                    
                    /*while (userInputs[i] == 0) {

                        System.out.print("Enter a number: ");
                        userInput = input.nextInt();
                        userInputs[i] = userInput;
                    }*/
        
                }
		}

            }


        System.out.println("Your number inputs are: " + (Arrays.toString(userInputs)));
    }
}