package Second_largest;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestStresm {

	public static void main(String[] args) {

		int[] arr = { 11, 2, 32, 400, 50, 67, 93, 1, 16, 16, 27 };
//		 int secondLargest = Arrays.stream(arr)
//        .boxed()                       // Convert int[] to Stream<Integer>
//        .sorted((a, b) -> b - a)       // Sort in descending order
//        .skip(1)                       // Skip the largest element
//        .findFirst()                   // Get the first element (second largest)
//        .orElseThrow();

		int secondLargest = Arrays.stream(arr).distinct().boxed() // Convert int[] to Stream<Integer>
				.sorted(Comparator.reverseOrder())
				.skip(2) // Skip the largest element
				.findFirst() // Get the first element (second largest)
				.orElseThrow(); // Throw an exception if not found
		System.out.println("no is : " + secondLargest);

	}

}
