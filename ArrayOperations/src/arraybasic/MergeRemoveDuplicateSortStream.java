package arraybasic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeRemoveDuplicateSortStream {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 ,50, 60};
		int[] b = { 50, 60, 70, 80 };

		//
		int[] mergedDistinctSorted = IntStream.concat(IntStream.of(a), IntStream.of(b)).distinct().sorted().toArray();

		System.out.println("Merged array without duplicates and sorted: " + Arrays.toString(mergedDistinctSorted));

		// -----------------------------------------------------------------------------------------
		 int[] merged = IntStream.concat(IntStream.of(a), IntStream.of(b)).toArray();

	        int[] mergedDistinctSorted1 = Arrays.stream(merged)
	                                           .distinct()
	                                           .sorted()
	                                           .toArray();

	        System.out.println("Merged array: " + Arrays.toString(merged));
	        System.out.println("Merged array without duplicates and sorted: " + Arrays.toString(mergedDistinctSorted1));
	        
	   

	}

}
