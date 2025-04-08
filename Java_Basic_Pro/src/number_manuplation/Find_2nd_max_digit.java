package number_manuplation;

import java.util.Comparator;
import java.util.Scanner;

public class Find_2nd_max_digit {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		long number = sc.nextInt();
		
		 long secondMaxDigit = String.valueOf(Math.abs(number)) // Handle negative numbers
	                .chars()
	                .map(Character::getNumericValue) // Convert characters to digits
	                .boxed() // Box primitive `int` to `Integer` for sorting with a custom comparator
	                .distinct()
	                .sorted(Comparator.reverseOrder()) // Sort in descending order
	                .skip(1) // Skip the maximum digit to find the second maximum
	                .findFirst() // Get the second maximum digit
	                .orElseThrow(() -> new IllegalArgumentException("Not enough digits to find the second maximum"));

		 
	        System.out.println("2nd Maximum digit: " + secondMaxDigit);

	        sc.close();

	}

}
