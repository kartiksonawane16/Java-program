package Print_duplicate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class All_Methods {

	public static void main(String[] args) {
		
		 int[] arr = {1, 4, 3, 2, 7, 8, 2, 1, 8, 8, 10, 1, 8};
		
		// method-1-Simple Program (Using Nested Loops)
	
	        HashSet<Integer> seen = new HashSet<>();
	        HashSet<Integer> duplicates = new HashSet<>();

	        for (int num : arr) {
	            if (!seen.add(num)) { // If already seen, it's a duplicate
	                duplicates.add(num);
	            }
	        }

	        System.out.println("method-1-Duplicate numbers: "+duplicates);
		
	     // method-2-Using Java 8 Features (Using HashMap)
	        Map<Integer, Integer> countMap = new HashMap<>();

	        for (int num : arr) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        countMap.entrySet().stream()
	                .filter(entry -> entry.getValue() > 1)
	                .forEach(entry -> System.out.print(entry.getKey() + " "));
	        
	     // method-3-Using Java Streams
	        
	        Set<Integer> seen2 = new HashSet<>();
	        Set<Integer> duplicates2 = Arrays.stream(arr)
	                .filter(num -> !seen.add(num)) // Keep only duplicates
	                .boxed() // Convert int to Integer
	                .collect(Collectors.toSet());

	        System.out.println("method-3-Duplicate numbers: "+duplicates);
	        
	     // method-4-Using Java IntStream
	        
	        Set<Integer> seen3 = new HashSet<>();
	        Set<Integer> duplicates3 = IntStream.of(arr)
	                .filter(num -> !seen.add(num)) // If number is already seen, it's a duplicate
	                .boxed() // Convert int to Integer
	                .collect(Collectors.toSet());

	        System.out.println("method-4-Duplicate numbers: "+duplicates);
		
		
	}

}
