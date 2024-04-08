import java.util.Scanner;

public class StudentGradeAverageClaculator {
	public static void main(String[] args) {

			//invoke Scanner
		
		Scanner input = new Scanner(System.in);

			//initialize variables


		int gradeCounter = 0;

		int totalOfGrades =  0;


			System.out.print("\nEnter grade (-1 to terminate): ");
			int grade = input.nextInt();			
			

			while (grade != -1 ) {

				totalOfGrades = totalOfGrades + grade;

				gradeCounter = gradeCounter + 1;
	
			System.out.print("\nEnter grade (-1 to terminate): ");

			grade = input.nextInt();

				
			}



			//make decisions using selection statements**

			if (gradeCounter != 0) {
	
			double average = (double)totalOfGrades / gradeCounter;

			System.out.println(gradeCounter);


			System.out.println(totalOfGrades);			

			System.out.printf("%.2f",average);


			} else {

				System.out.print("No grades were entered.");
			}



	}
}