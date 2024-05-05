public class Calculator {

	public static int add(int firstNumber, int secondNumber) {

		int sum = firstNumber + secondNumber;
		
		return sum;
	}
	
		public static int subtract(int firstNumber, int secondNumber) {

		int difference = firstNumber - secondNumber;
		
		return difference;
	}
	
		public static int addNegative(int firstNumber, int secondNumber) {

		int sumNegative = firstNumber + secondNumber;
		
		return sumNegative;
	}
	
		public static int multiply(int firstNumber, int secondNumber) {
		
		int result = 0;
		
		for (int i = 1; i <= secondNumber; i++) {
			
			result += firstNumber;
		}
		
		return result;
	}
	
	

}