package for_practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PractiseArrayProg {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 1, 6, 1, 4, 7, 7, 6, 1 };
		int[] arr2 = { 1, 2, 8, 9, 10, 10, 16, 1, 8, 9, 9, 1, 11, 15, 20 };

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 1, 2, 3, 4 };

		// merged And Sort Array
		mergedAndSortArray(arr1, arr2);

		// Duplicate no in array
		printDuplicateNo(arr1, arr2);

		// print Even n Odd Nos
		printEvenOddNo(arr1, arr2);

		//
		secondLargestNo(arr1);

		//
		secondsmallNo(arr1, arr2);

		//
		arraysAreEqualOrNot(a, b);
		
		//
		ReverseArray(arr1);
	}

	// merged And Sort Array
	public static void mergedAndSortArray(int[] arr1, int[] arr2) {
		int[] mergArry = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().toArray();

		// System.out.println(arr1.length);
		// System.out.println(arr2.length);
		System.out.println("merge array is :" + Arrays.toString(mergArry));
		// System.out.println(mergArry.length);
	}

	public static void printDuplicateNo(int[] arr1, int[] arr2) {

		Set<Integer> seen = new HashSet<Integer>();

		Set<Integer> duplicate = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted()
				.filter(num -> !seen.add(num)).boxed().collect(Collectors.toSet());

		System.out.println("Duplicate Nos are :" + duplicate);
	}

	public static void printEvenOddNo(int[] arr1, int[] arr2) {

		long evenCnt = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).filter(num -> num % 2 == 0).count();
		long oddCnt = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).filter(num -> num % 2 != 0).count();

		int[] evenNo = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().filter(num -> num % 2 == 0)
				.toArray();

		int[] oddNo = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().filter(num -> num % 2 != 0)
				.toArray();

		System.out.println("Even count is :" + evenCnt);
		System.out.println("Odd count is :" + oddCnt);

		System.out.println("Even Nos are :" + Arrays.toString(evenNo));
		System.out.println("Odd Nos are :" + Arrays.toString(oddNo));

	}

	public static void secondLargestNo(int[] arr1) {

		int secondLargest = Arrays.stream(arr1).distinct().boxed() // Convert int[] to Stream<Integer>
				.sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
		int[] sortArray = Arrays.stream(arr1).sorted().distinct().toArray();

		System.out.println("Arry is : " + Arrays.toString(sortArray));
		System.out.println("Number is :" + secondLargest);
	}

	public static void secondsmallNo(int[] arr1, int[] arr2) {
		// Merging both arrays, sorting, and removing duplicates
		int[] sortedArray = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).distinct().sorted()
				.mapToInt(Integer::intValue).toArray();

		// Finding the second smallest number
		int secondSmallest = Arrays.stream(sortedArray).skip(1) // Skip the smallest number
				.findFirst().orElse(-1); // Handle case when second smallest doesn't exist

		System.out.println("Merged and Sorted Array (Distinct): " + Arrays.toString(sortedArray));
		if (secondSmallest != -1) {
			System.out.println("Second Smallest Number is: " + secondSmallest);
		} else {
			System.out.println("Second Smallest Number not found.");
		}
	}

	public static void arraysAreEqualOrNot(int[] arr1, int[] arr2) {

		boolean isEqual = IntStream.of(arr1).sorted().toArray().length == IntStream.of(arr2).sorted().toArray().length
				&& Arrays.equals(IntStream.of(arr1).sorted().toArray(), IntStream.of(arr2).sorted().toArray());

		System.out.println(isEqual ? "Arrays are equal" : "Arrays are not equal");

	}

	public static void ReverseArray(int[] arr1) {

		int[] reversed = IntStream.range(0, arr1.length)
							.map(i -> arr1[arr1.length - 1 - i])
							.toArray();

		System.out.println("Reversed Array: " + Arrays.toString(reversed));
	}
}
