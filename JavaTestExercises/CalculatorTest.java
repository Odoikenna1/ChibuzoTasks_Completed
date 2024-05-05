import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

	@Test
	public void testThatCalculatorCanAddTwoPositiveNumbers() {
		
		int sum = Calculator.add(2,2);
		int expectedSum = 4;
		//assertion
		
		assertEquals(expectedSum, sum);
	}
	
	
	@Test
	public void testThatCalculatorCanSubtract() {
		
		int result = Calculator.subtract(5,2);
		int expectedDifference = 3;
		//assertion
		
		assertEquals(expectedDifference, result);
	}
	
	@Test
	public void testThatCalculatorCanSumTwoNegativeNumbers() {
		
		int result = Calculator.addNegative(-6,-2);
		int expectedNegativeSum = -8;
		//assertion
		
		assertEquals(expectedNegativeSum, result);
	}
	
	@Test
	public void testThatCalculatorCanMultiplyWithoutMultiplicationOperator() {
		
		int product = Calculator.multiply(8,6);
		int expectedProduct = 48;
		//assertion
		
		assertEquals(expectedProduct, product);
	}


}
