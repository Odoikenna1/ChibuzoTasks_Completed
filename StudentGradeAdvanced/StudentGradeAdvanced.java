import java.util.Arrays;

import java.util.Scanner;

public class StudentGradeAdvanced {
	public static void main(String[] args){
		
		System.out.println("\nStudent grade application\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many students do you have? ");
		int numberOfStudents = input.nextInt();
		
		System.out.print("How many subjects do they offer? ");
		int numberOfSubjectsOffered = input.nextInt();
		
		System.out.println("\nSaving  >>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved  successfully");
		System.out.println("===================================");
		
		int[][] arrayOfSubjectScores = new int[numberOfStudents][numberOfSubjectsOffered];
		
		System.out.println("\nThe number of students entered: " + numberOfStudents);
		System.out.println("The number of subjects entered: " + numberOfSubjectsOffered);
		
		int row = arrayOfSubjectScores.length;
		int column = arrayOfSubjectScores[0].length;

		System.out.println(); 
		
		int temp = numberOfSubjectsOffered -1;
		int studentCounter = 1;
		int subjectInputCounter = 1;
		int total = 0;
		float average = 0f;
		int gradeCounter = 1;

		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < column; j++) {
				
			System.out.printf("%nEntering score for student %d%n", studentCounter);
			
			System.out.printf("Enter score for subject %d: %n", subjectInputCounter);
			int scores = input.nextInt();
			
			System.out.println("\nSaving  >>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved  successfully");
				
				arrayOfSubjectScores[i][j] = scores;
				
				total += scores;				
				if (subjectInputCounter == column) {
				
				studentCounter++;
				while (subjectInputCounter != 0)
				subjectInputCounter--;
				}
				subjectInputCounter++;
				gradeCounter++;
				
				
			}
			
		}
		System.out.println();
		
			System.out.println("==================================================");
			System.out.printf("STUDENTS%3s", "");
			for (int j = 1; j <= column; j++) {
				
				System.out.printf("Subject %d%2s ", j,"");
			}
			System.out.printf("TOT%3s", "");
			System.out.printf("AVE%3s", "");
			System.out.printf("POS%3s%n", "");
			System.out.println("==================================================");
			//System.out.println();
			int x = 1;
			for (int i = 0; i < row -1; i++) {
				
				System.out.printf("%nStudent %d:%3s%s ", x, "", arrayOfSubjectScores[0][i]);
				x++;
			}
			
		average = total / (float)gradeCounter;
				
			
			/*System.out.println(arrayOfSubjectScores[0][0]);
				System.out.println(arrayOfSubjectScores[0][1]);
				System.out.println(arrayOfSubjectScores[0][2]);
				System.out.println(arrayOfSubjectScores[0][3]);*/
		//System.out.println("\nBelow are the array of scores entered");
		//System.out.println(Arrays.deepToString(arrayOfSubjectScores));
		//System.out.println("Total scores are " + total + " Average of scores are: " + average);
	}
}