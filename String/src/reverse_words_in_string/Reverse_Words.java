package reverse_words_in_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_Words {

	public static void main(String[] args) {

		String str = "  Kartik prakash Sonawane  ";

		str = str.trim();
		System.out.println("Original String: " + str);

		// Method-1 - Simple for loop
		String[] words = str.split("\\s+"); // Split string into words
		String reversedString = "";

		// Reverse the order of words
		for (int i = words.length - 1; i >= 0; i--) {
			reversedString += words[i] + " ";
		}

		System.out.println("Reversed String: " + reversedString.trim());

		// Method-2- Using Java 8 Features (StringBuilder for Efficiency)

		String[] words2 = str.split("\\s+");
		StringBuilder reversedString2 = new StringBuilder();

		// Append words in reverse order
		for (int i = words.length - 1; i >= 0; i--) {
			reversedString2.append(words[i]).append(" ");
		}

		System.out.println("Reversed String: " + reversedString.toString().trim());

		// Method-3- Using Java Streams
		
		List<String> words3 = Arrays.asList(str.split("\\s+")); // Convert string to list of words
        Collections.reverse(words3); // Reverse the list

        String reversedString3 = words3.stream()
                                     .collect(Collectors.joining(" ")); // Join back into a string

        System.out.println("Reversed String: " + reversedString);

	}

}
