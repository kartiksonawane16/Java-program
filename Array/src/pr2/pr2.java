package pr2;

import java.util.Comparator;
import java.util.stream.Collectors;

public class pr2 {

	public static void main(String[] args) {
		
		String str = "kartik sonawane";
		
		char charToRemove = 'a';
		
		StringBuilder sb = new StringBuilder();
		
		str.chars().distinct().forEach(c -> sb.append((char)c));
		System.out.println(sb);
		
		 String result2 = str.toLowerCase().chars()
                 .filter(ch -> ch != charToRemove) // Keep only characters that are not the target
                 .mapToObj(ch -> String.valueOf((char) ch)) // Convert to String
                 .collect(Collectors.joining())
                 .trim(); // Join to form new string
		 
		 System.out.println("----------------------------------");
		 String result3 = str.toLowerCase()
					.chars() // Get IntStream of characters
                .mapToObj(c -> (char) c) // Convert to Character stream
                .sorted(Comparator.reverseOrder()) // Sort in reverse
                .map(String::valueOf) // Convert back to String
                .collect(Collectors.joining()); // Join to form the final string
		 
		 String result4 = str.toLowerCase()
		 			.chars()
		 			.mapToObj(c -> (char) c)
		 			.sorted()
		 			.map(String::valueOf)
		 			.collect(Collectors.joining());
		 System.out.println(result3);
		 System.out.println(result4);
		 
		 
	}

}
