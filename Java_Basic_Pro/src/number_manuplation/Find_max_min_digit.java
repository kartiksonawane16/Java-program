package number_manuplation;

import java.util.Scanner;

public class Find_max_min_digit {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		int number = sc.nextInt();
		
		int maxDigit = String.valueOf(Math.abs(number))
						.chars()
						.map(Character::getNumericValue)
						.max()
						.orElseThrow(() -> new IllegalArgumentException("No digits found"));
		
		int minDigit = String.valueOf(Math.abs(number))
                 .chars()
                 .map(Character::getNumericValue)
                 .min()
                 .orElseThrow(() -> new IllegalArgumentException("No digits found"));
		
		// Output the results
        System.out.println("Maximum digit: " + maxDigit);
        System.out.println("Minimum digit: " + minDigit);
        
        sc.close();

	}

}

/*
import java.util.Scanner;
import java.util.stream.IntStream;

public class MaxMinDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        // Convert the integer to a stream of digits
        IntStream digitStream = String.valueOf(Math.abs(number)) // Handle negative numbers
                                   .chars() // Get character stream
                                   .map(Character::getNumericValue); // Convert chars to digits

        // Find max and min using streams
        int maxDigit = digitStream.max().orElseThrow(() -> new IllegalArgumentException("No digits found"));
        
        // Recreate the stream for finding min because streams can be consumed only once
        int minDigit = String.valueOf(Math.abs(number))
                        .chars()
                        .map(Character::getNumericValue)
                        .min()
                        .orElseThrow(() -> new IllegalArgumentException("No digits found"));

        // Output the results
        System.out.println("Maximum digit: " + maxDigit);
        System.out.println("Minimum digit: " + minDigit);

        sc.close();
    }
}
*/
