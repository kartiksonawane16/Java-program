package demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class SecondLargestNo {

	private static final IntUnaryOperator Integer = null;

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 1, 6, 1, 4, 7, 7, 6, 1 };
		// int[] arr = { 1, 1 };
		Arrays.sort(arr);
		System.out.println("Array After sort " + Arrays.toString(arr));
		
	
		
		int secondLargestNo = 
				IntStream.of(arr)
				.distinct()
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(-1);
		
		 if (secondLargestNo == -1) {
			 System.out.println("Second Largest Number not found.");
	           
	        } else {
	        	 System.out.println("Second Largest Number is: " + secondLargestNo);
	        }
	
		 

	}
}
