package all_int_manuplation_using_stream;

import java.text.DecimalFormat;
import java.util.OptionalDouble;
import java.util.Scanner;



public class Sum_max_min_avg_Digit {

	public static void main(String[] args) {

		final DecimalFormat decfor = new DecimalFormat("0.00"); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		
		long number = sc.nextLong();

		long sum = String.valueOf(Math.abs(number))
				.chars()
				.map(Character::getNumericValue)
				.sum();
		
		long maxDigit = String.valueOf(Math.abs(number))
				.chars()
				.distinct()
				.map(Character::getNumericValue)
				.max()
				.orElseThrow(() -> new IllegalArgumentException("No digits found"));
		
		long minDigit = String.valueOf(Math.abs(number))
				.chars()
				.distinct()
				.map(Character::getNumericValue)
				.min()
				.orElseThrow(() -> new IllegalArgumentException("No digits found"));
		
		double avg = String.valueOf(Math.abs(number))
								.chars()
								.map(Character::getNumericValue)
								.average()
								.orElseThrow(() -> new IllegalArgumentException("No digits found"));

		
        // Print results
        System.out.println("Sum of digits: " + sum);
        System.out.println("Maximum digit: " + maxDigit);
        System.out.println("Minimum digit: " + minDigit);
        System.out.println("Average of digits: " + decfor.format(avg));
        
        
	}
}
/*
 * import java.util.Scanner;
 * 
 * public class DigitOperations {
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter a long integer number: "); long number =
 * sc.nextLong();
 * 
 * // Handle negative numbers by taking absolute value String digits =
 * String.valueOf(Math.abs(number));
 * 
 * // Convert the digits to a stream of integers int[] digitArray =
 * digits.chars() .map(Character::getNumericValue) .toArray();
 * 
 * // Calculate sum of digits int sum = digits.chars()
 * .map(Character::getNumericValue) .sum();
 * 
 * // Find maximum digit int maxDigit = digits.chars()
 * .map(Character::getNumericValue) .max() .orElseThrow(() -> new
 * IllegalArgumentException("No digits found"));
 * 
 * // Find minimum digit int minDigit = digits.chars()
 * .map(Character::getNumericValue) .min() .orElseThrow(() -> new
 * IllegalArgumentException("No digits found"));
 * 
 * // Calculate average of digits double avg = digits.chars()
 * .map(Character::getNumericValue) .average() .orElseThrow(() -> new
 * IllegalArgumentException("No digits found"));
 * 
 * // Print results System.out.println("Sum of digits: " + sum);
 * System.out.println("Maximum digit: " + maxDigit);
 * System.out.println("Minimum digit: " + minDigit);
 * System.out.println("Average of digits: " + avg);
 * 
 * sc.close(); // Close scanner to avoid resource leaks } }
 */