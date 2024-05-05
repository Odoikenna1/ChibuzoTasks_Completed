import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_MaxOfArrayElementProducts {
	
	@Test
	public void findTheMaximumProductIntegerValueTest() {

		int[] array = {6,9,1,2,3};
		
		int arrayOfNumbers = MaxOfArrayElementProducts.findTheMaximumProductIntegerValue(array);
		int expectedValue = 54;
		//assertion
		
		assertEquals(expectedValue, arrayOfNumbers) ;
	}
	
	@Test
	public void findHighestPositonBasedOnArrayIndexValue() {

		int[] newArray = {6,9,1,2,3};
		
		int arrayOfNumbers = MaxOfArrayElementProducts.findHighestPositonBasedOnArrayIndexValue(newArray);
		int expectedResult = {2,1,3,4,5};
		//assertion
		
		assertEquals(expectedResult, arrayOfNumbers) ;
	}
}