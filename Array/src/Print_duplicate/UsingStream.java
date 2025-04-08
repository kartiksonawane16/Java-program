package Print_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UsingStream {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2, 1, 16, 16 };

		Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(arr)
                .filter(num -> !seen.add(num)) 			// Keep only duplicates
                .boxed() 								// Convert int to Integer
                .sorted()
                .collect(Collectors.toSet());
        
        System.out.println("Duplicate numbers: " + duplicates);
        
        
        Set<Integer> seen3 = new HashSet<>();
        Set<Integer> duplicates3 = IntStream.of(arr)
        		
                .filter(num -> !seen3.add(num))			 // If number is already seen, it's a duplicate
                .boxed()								// Convert int to Integer
                .collect(Collectors.toSet());

        System.out.println("method-4-Duplicate numbers: "+duplicates3);

	}

}
