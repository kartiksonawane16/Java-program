package reverse_words_in_string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse_Characters {

	public static void main(String[] args) {

		String str = "  Kartik Sonawane  ";

		str = str.trim();
		System.out.println("Original String: " + str);

		// method-1- simple program
		
		revString(str);
/*		
		String[] words = str.split(" ");

		String reverseString = "";

		for (String word : words) {
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);

			}
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println("Reverse String is : " + reverseString);
*/
		
		// method-2- Using Java StringBuilder for Efficiency
		
		RevStringUsingBuilder(str);
		
		
		// method-3- Using Java Streams
		
		 String reversedString = Arrays.stream(str.split("\\s+")) // Split into words
	                .map(word -> new StringBuilder(word).reverse().toString()) // Reverse each word
	                .collect(Collectors.joining(" ")); // Join words with spaces

	        System.out.println("Reversed String: " + reversedString);

	}
	
	
	
	// method-1- simple program
	public static void revString(String str) {
		
		String[] words = str.split(" ");
		
		String reverseString = "";
		
		for (String word : words) {
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);

			}
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println("Reverse String is : " + reverseString.trim());
	}

	
	// method-2- Using Java StringBuilder for Efficiency
	
	public static void RevStringUsingBuilder(String str) {
		
		String[] words = str.split("\\s+");
		
        StringBuilder reverseString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reverseString.append(reverseWord.reverse()).append(" "); // Reverse each word and append
        }

        System.out.println("Reversed String: " + reverseString.toString().trim());
    }

}
