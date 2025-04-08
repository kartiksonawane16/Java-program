package pr2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class pr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50, 60 };
		int[] b = { 50, 60, 70, 80 };
		
		int[] arr = IntStream.concat(IntStream.of(a), IntStream.of(b))
										.boxed()
										.distinct().sorted(Comparator.reverseOrder())
										.mapToInt(Integer::intValue)
										.toArray();
		System.out.println("Merged array without duplicates and sorted: " + Arrays.toString(arr));
		
		printDuplicateNo(a,b);
	}

	public static void printDuplicateNo(int[] arr1, int[] arr2) {

		Set<Integer> seen = new HashSet<Integer>();

		Set<Integer> duplicate = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
		        .sorted()
		        .filter(num -> !seen.add(num))
		        .collect(Collectors.toSet());
		

		System.out.println("Duplicate Nos are :" + duplicate);
		
		Set<Integer> duplicate1 = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().boxed()
				.filter(num -> !seen.add(num)).collect(Collectors.toSet());

		System.out.println("Duplicate Nos are :" + duplicate1);
	}
}
