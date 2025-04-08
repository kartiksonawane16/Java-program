package sort_alpha_order;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sort_Alphabetic_order {

	public static void main(String[] args) {

		String str = "   Kartik Sonawane  ";

		// first remove white spaces
		String newStr = str.replaceAll("\\s+", "").toLowerCase();
		System.out.println(newStr);

		// method-1

		char[] arr = newStr.toCharArray();
		char temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(new String(arr));

		// method-2

		char[] chars = newStr.toCharArray();
		Arrays.sort(chars); 		// Sort the characters
		

		String result = new String(chars); 		// Convert back to string

		System.out.println(result);

		
		// method-3

		String result2 = str.replaceAll("\\s+", "") // Remove whitespaces
				.toLowerCase() // Convert to lowercase
				.chars() // Convert to IntStream of characters
				.sorted() // Sort the characters
				.mapToObj(c -> String.valueOf((char) c)) // Convert back to String
				.collect(Collectors.joining()); // Join characters to form a string

		System.out.println(result2);

	}

}
