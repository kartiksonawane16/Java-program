package Sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortwithStream {

	public static void main(String[] args) {

		int[] a = { 45, 12, 78, 34, 89, 21, 21, 1, 12 };

		// Inbuild method
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		// for (int i : a) {
		// System.out.println(i);
		// }

		// Stream
		int[] r = IntStream.of(a).sorted().toArray();
		System.out.println(Arrays.toString(r));

		int[] rr = Arrays.stream(a).sorted().toArray();
		System.out.println(Arrays.toString(rr));

		/*
		//
		List<Integer> sortedList = Arrays.stream(a)
											.sorted()
											.boxed() 
											.collect(Collectors.toList());
		sortedList.forEach(System.out::println);

		List<Integer> list = Arrays.asList(45, 12, 78, 34, 89, 21, 21, 1, 12);

		List<Integer> sortedList2 = list.stream().sorted().collect(Collectors.toList());

		 List<Integer> sortedList3 = Arrays.asList(45, 12, 78, 34, 89, 21, 21, 1, 12)
                 .stream()
                 .sorted()
                 .collect(Collectors.toList());
		// Print the sorted list
		sortedList.forEach(System.out::println);
		
		*/
	}

}
