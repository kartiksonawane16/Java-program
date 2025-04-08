package sort_alpha_order;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sort_reverse_alpha_order {

	public static void main(String[] args) {
		String str = "kartik sonawane ";

		//
		name(str);
		
		//
		
		removechar(str, 'a');
		
		
		//
        String result = str.toLowerCase()
        					.chars() // Get IntStream of characters
        					 .mapToObj(c -> (char) c) // Convert to Character stream
                           .sorted(Comparator.reverseOrder()) // Sort in reverse
                           .map(String::valueOf) // Convert back to String
                           .collect(Collectors.joining()); // Join to form the final string

        System.out.println("Reversed Alphabetical Order: " + result);
	}

/*
 String result2 = str.chars()
                             .filter(ch -> ch != charToRemove) // Keep only characters that are not the target
                             .mapToObj(c -> String.valueOf((char) c)) // Convert to String
                             .collect(Collectors.joining()); // Join to form new string

        System.out.println("String after removal: " + result2);

*/
	public static void name(String str) {
		 String result = str.toLowerCase()
				 			.chars()
				 			.mapToObj(c -> (char) c)
				 			.sorted()
				 			.map(String::valueOf)
				 			.collect(Collectors.joining());
				 			
				 			
		 System.out.println("Alphabetical Order: " + result);
	}
	
	public static void removechar(String str, char charToRemove) {
		 String result = str.toLowerCase()
				 			.chars()
				 			.mapToObj(c -> (char) c)
				 			.filter(ch -> ch != charToRemove)
				 			.map(String::valueOf)
				 			.collect(Collectors.joining());
		 
		 System.out.println("remove: " + result);
	} 
	
	
}
