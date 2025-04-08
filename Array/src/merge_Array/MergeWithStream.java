package merge_Array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeWithStream {

	public static void main(String[] args) {

		
		int[] a = { 100, 20, 30, 10, 50, 60 };
		int[] b = { 50, 60, 70, 80 };

		int[] merged = IntStream.concat(IntStream.of(a), IntStream.of(b)).sorted().toArray();

		System.out.println("Merged array without duplicates and sorted: " + Arrays.toString(merged));
		
		
		//
		withStreamConcate();

	}

	public static void withStreamConcate() {

		int[] a = { 10, 20, 30, 40, 50, 60 };
		int[] b = { 50, 60, 70, 80 };
		int[] merged = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).mapToInt(Integer::intValue).sorted().toArray();

		System.out.println("Merged array without duplicates and sorted: " + Arrays.toString(merged));
	}

} // class
