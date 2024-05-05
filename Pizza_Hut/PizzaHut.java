
import java.util.Scanner;

public class PizzaHut {
    public static void main(String[] args) {
		
        Object[][] catalouge = {
                { "Kids size", "Small", "Medium", "Large" },
                { 4, 6, 8, 12 },
                { 2000, 2400, 3000, 4200 }
        };

		String pizzaType1 = (String) catalouge[0][0];
		String pizzaType2 = (String) catalouge[0][1];
		String pizzaType3 = (String) catalouge[0][2];
		String pizzaType4 = (String) catalouge[0][3];
		
		int no_OfSlices_KidSize = (int) catalouge[1][0];
		int no_OfSlices_SmallSize = (int) catalouge[1][1];
		int no_OfSlices_mediumSize = (int) catalouge[1][2];
		int no_OfSlices_largeSlices = (int) catalouge[1][3];
		
		int kidSizePrice = (int) catalouge[2][0];
		int smallSizePrice = (int) catalouge[2][1];
		int mediumSizePrice = (int) catalouge[2][2];
		int largeSizePrice = (int) catalouge[2][3];
		

        System.out.print("\n==========================================================");
        System.out.printf("%n%2sWelcome to Yum-Bites Pizza Hut, Satisfy your cravings%n%14swith our delicious treats.%n%7sThe ideal pizza joint for your celebrations!%n", "", "", "");
        System.out.printf("==========================================================");
        System.out.println();
        System.out.printf("%n%4sPizza type%5sNumber of Slices%4sPrice per box%n%n", "", "", "");

        for (int j = 0; j < catalouge[0].length; j++) 
        {
            for (int i = 0; i < catalouge.length; i++) 
            {          
                System.out.printf("%15s",  catalouge[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        double slicesLeftOver = 0;
        double quantityToBuy = 0;
		double bill = 0;
		
		Scanner input = new Scanner(System.in);

		System.out.print("How many guests are you entertaining?  ");
		int number_Of_Guests = input.nextInt();
		input.nextLine();
		System.out.print("What size of pizza would you like? ");
		String size_Ordered = input.nextLine();
		
		switch (size_Ordered) {
			case "Kids size":
				quantityToBuy = (double)number_Of_Guests / no_OfSlices_KidSize;
				slicesLeftOver = (double)number_Of_Guests % no_OfSlices_KidSize;
				bill = quantityToBuy * kidSizePrice;
					System.out.printf("Number of boxes of pizzas to buy are %.2f%nNumber of slices left over after serving %.2f%n%n", quantityToBuy, slicesLeftOver);
					System.out.println("Your bill is: " + bill);
				break;
			case "Small":
				quantityToBuy = (double)number_Of_Guests / no_OfSlices_SmallSize;
				slicesLeftOver = (double)number_Of_Guests % no_OfSlices_SmallSize;
				bill = quantityToBuy * smallSizePrice;
					System.out.printf("Number of boxes of pizzas to buy are %.2f%nNumber of slices left over after serving %.2f%n%n", quantityToBuy, slicesLeftOver);
					System.out.println("Your bill is: " + bill);
				break;
			case "Medium":
				quantityToBuy = (double)number_Of_Guests / no_OfSlices_mediumSize;
				slicesLeftOver = (double)number_Of_Guests % no_OfSlices_mediumSize;
				bill = quantityToBuy * mediumSizePrice;
					System.out.printf("Number of boxes of pizzas to buy are %.2f%nNumber of slices left over after serving %.2f%n%n", quantityToBuy, slicesLeftOver);
					System.out.println("Your bill is: " + bill);
				break;
			case "Large":
				quantityToBuy = (double)number_Of_Guests / no_OfSlices_largeSlices;
				slicesLeftOver = (double)number_Of_Guests % no_OfSlices_largeSlices;
				bill = quantityToBuy * largeSizePrice;
					System.out.printf("Number of boxes of pizzas to buy are %.2f%nNumber of slices left over after serving %.2f%n%n", quantityToBuy, slicesLeftOver);
					System.out.println("Your bill is: " + bill);
			break;
			default:
			break;
		}
    }
}