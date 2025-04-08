package replace_char_with_occurrance;

import java.util.stream.Collectors;

public class Remove_char_in_String {

	public static void main(String[] args) {

		String str = "  Kartik Sonawane  ";

		char charToRemove = 'a';

		// first remove white spaces
		// String newStr = str.replaceAll("\\s+", "").toLowerCase();
		// System.out.println(newStr);

		str = str.toLowerCase().trim();
		
		// method-1 - Simple Program (Using Loop) and StringBuilder
		stringFunction(str, charToRemove);
		
		// method-2 - Use replaceAll to remove character
        String result = str.replaceAll(Character.toString(charToRemove), "");
        System.out.println("String after removal: " + result);
        
     // method-3 - Using Java Streams
        String result2 = str.chars()
                             .filter(ch -> ch != charToRemove) // Keep only characters that are not the target
                             .mapToObj(c -> String.valueOf((char) c)) // Convert to String
                             .collect(Collectors.joining()); // Join to form new string

        System.out.println("String after removal: " + result2);

	}

	// method-1 - Simple Program (Using Loop) and StringBuilder
	public static void stringFunction(String str, char charToRemove) {
		

		StringBuilder result = new StringBuilder();
		
		for (char ch : str.toCharArray()) {
			if (ch != charToRemove) {
				result.append(ch);
			}
		}
		result.trimToSize();

		System.out.println("String after removal: " + result);
	}

	
}
