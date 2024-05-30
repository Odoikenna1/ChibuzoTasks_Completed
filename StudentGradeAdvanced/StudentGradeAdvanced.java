import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeAdvanced {
    public static void main(String[] args) {
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

        inputScores(arrayOfSubjectScores, input);

        displayScores(arrayOfSubjectScores);

        // Calculate positions based on average grades
        // int[] positions = calculatePositions(arrayOfSubjectScores);
        
        // Display positions
        // displayPositions(positions);
    }

    // Method to input scores for each student
    private static void inputScores(int[][] scores, Scanner input) {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%nEntering scores for student %d%n", i + 1);
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("Enter score for subject %d: ", j + 1);
                scores[i][j] = input.nextInt();
                System.out.println("\nSaving  >>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved  successfully");
            }
        }
    }

    // Method to display scores
    private static void displayScores(int[][] scores) {
        System.out.println("\n====================================================================================================");

        System.out.printf("%-10s", "STUDENTS");
        for (int j = 1; j <= scores[0].length; j++) {
            System.out.printf("%2s SUB%d %1s", "", j, "");
        }
        System.out.printf("%1sTOT%5sAVE%5sPOS%n", "", "", "");


        double[] averages = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int score : scores[i]) {
                total += score;
            }
            averages[i] = (double) total / scores[i].length;
        }

        // Sort averages array and remember the original index positions

        int[] positions = new int[averages.length];

        for (int i = 0; i < positions.length; i++) {
            positions[i] = i;
        }
        for (int i = 0; i < averages.length - 1; i++) {
            for (int j = 0; j < averages.length - i - 1; j++) {
                if (averages[j] < averages[j + 1]) {
                    double temp = averages[j];
                    averages[j] = averages[j + 1];
                    averages[j + 1] = temp;
                    int tempIndex = positions[j];
                    positions[j] = positions[j + 1];
                    positions[j + 1] = tempIndex;
                }
            }
        }

        // System.out.println("\n====================================================================================================");
        // System.out.printf("%-10s%-10s%n", "STUDENTS", "POS");
        // System.out.println("====================================================================================================");
        for (int i = 0; i < positions.length; i++) {
            System.out.printf("%s%55s%n", positions[i] + 1, " ");
        }
        System.out.println("====================================================================================================");
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int score : scores[i]) {
                total += score;
            }
            double average = (double) total / scores[i].length;
            System.out.printf("Student %d:%5s", i + 1, "");
            for (int score : scores[i]) {
                System.out.printf("%-12d", score);
            }
            System.out.printf("%-10d%-10.2f%n", total, average);
        }
        System.out.println("====================================================================================================");
    }

    // Method to calculate positions based on average grades

    // private static void calculatePositions(int[][] scores) {
        
    //     //return positions;
    // }

    // Method to display positions
    // private static void displayPositions(int[] positions) {
        
    // }
}
