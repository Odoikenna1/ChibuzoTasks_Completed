import java.util.ArrayList;

import java.util.Scanner;

public class CollectScores {


	public static int[] fetchCollectedScoresInArray(int[] scores) {


		int index = 0;

		int totalNumberCollected = 10;

		Scanner input = new Scanner(System.in);
		

		for (; index < totalNumberCollected; index++) {

			System.out.print("Enter scores: ");
			int userInput = input.nextInt();

			scores.add(userInput);
	
		}

		return result;

	}

}