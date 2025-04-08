package remove_operations;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class print_dupli {

	public static void main(String[] args) {
		   String input = "automation";
	       // Convert string to character stream, count occurrences, and filter duplicates
	       Map<Character, Long> charCountMap = input.chars()
	               .mapToObj(c -> (char) c)
	               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	       // Print duplicate characters
	       System.out.println("Duplicate characters in the string:");
	       charCountMap.entrySet().stream()
	               .filter(entry -> entry.getValue() > 1)
	               .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

	}

}
