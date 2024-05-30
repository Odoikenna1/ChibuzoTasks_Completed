
public class TablePrintingProgram {
	public static void main(String[] args) {

		System.out.print("a\tb\tpow(a,b)");
	
		for (int counterForA = 1; counterForA <= 5; counterForA++) {

			for (int counterForB = 2; counterForB <= 6; counterForB++) {

				System.out.println(counterForA + "\t" + counterForB + "\t" + Math.pow(counterForA, counterForB));
			}
		}



	}
}