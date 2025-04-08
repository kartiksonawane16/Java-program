package Remove_Duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class My_try {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };

		// method-1-
		Set<Integer> set = new HashSet<Integer>();

		/*
		 * for (int i = 0; i < arr.length; i++) { set.add(arr[i]); }
		 */
		for (int num : arr) {
			set.add(num);
		}
		System.out.println("method-1-Distinct elements in the array: " + set);

		
		// method-2-
		Set<Integer> distinctElements = Arrays.stream(arr) // Convert array to stream
				.boxed() // Convert int to Integer
				.collect(Collectors.toSet()); // Collect as a Set to remove duplicates

		System.out.println("method-2-Distinct elements in the array: " + distinctElements);

		
		// method-3-
		System.out.print("method-3-Distinct elements in the array: ");
		Arrays.stream(arr).distinct() // Removes duplicates efficiently
				.forEach(num -> System.out.print(num + " "));

		// method-4-
		  int[] streamOutput = Arrays.stream(arr) // Convert array to IntStream
	                .distinct() // Removes duplicates
	                .toArray(); // Collect result into an array

	        System.out.println("Distinct elements in the array: " + Arrays.toString(streamOutput));
		
		
		// method-5-
		int[] intStreamOutput = IntStream.of(arr) // Convert array to IntStream
				.distinct() // Removes duplicates efficiently
				.toArray(); // Convert back to array

		System.out.println("method-5-Distinct elements in the array: " + Arrays.toString(intStreamOutput));
	}

}
