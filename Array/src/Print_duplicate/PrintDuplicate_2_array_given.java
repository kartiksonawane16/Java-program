package Print_duplicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintDuplicate_2_array_given {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 5, 1, 7, 2, 4, 2, 1, 1, 5, 10, 10, 10, 10};
		int[] arr2 = {1, 2, 5, 7, 4, 7, 4, 7, 7};
		
		 Set<Integer> seen = new HashSet<>();
		 Set<Integer> duplicate = IntStream.concat(IntStream.of(arr), IntStream.of(arr2))
				 					//IntStream.of(arr)
				 					.sorted()
				 					.filter(num -> !seen.add(num))
				 					.boxed()
				 					.collect(Collectors.toSet());
		 
		 System.out.println("method-4-Duplicate numbers: "+duplicate);
		
	



	
	}

}