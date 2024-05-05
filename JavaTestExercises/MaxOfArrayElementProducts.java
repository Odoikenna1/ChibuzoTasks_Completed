public class MaxOfArrayElementProducts {
	
	public static int findTheMaximumProductIntegerValue(int[] array) {

		
		int arrayProduct = 0;
		int[] results = new int [100];
		int max = 0;
		
		
		for (int i = 1; i < array.length; i++) {
			
			for (int j = 0; j < array.length -1; j++) {
				
				arrayProduct = array[j] * array[i];
				
				if (array[j] == array[i]) continue;

				for (int x = 0; x < results.length; x++) {
					results[x] = arrayProduct;
					if (max < results[x]) {
						max = results[x];
					}
				}
				//System.out.printf("%d X %d = %d\t", array[j], array[i], arrayProduct);
			}
			
			//System.out.println();
		}
		//System.out.println("The maximum product of the elements in the array is: " + max);
		
	return max;	
	}
	
}