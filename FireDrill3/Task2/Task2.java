import java.util.Arrays;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {


		int [] score = new int[10] ;
		
		Scanner input = new Scanner(System.in);

		for (int index = 0; index < score.length; index++) {

		System.out.print("Enter scores: ");
		int userInput = input.nextInt();

		score[index] = userInput;

		}


		for (int count = 0; count < score.length; count++) {

		System.out.println(score[count]);

		}


	}
}