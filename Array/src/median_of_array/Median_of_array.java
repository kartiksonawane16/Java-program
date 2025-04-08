package median_of_array;

import java.util.Arrays;

public class Median_of_array {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 33, 9 };

		int n = arr.length;
		// method-1-Simple Java Program (Using Sorting)
		findMedian(arr);

		// method-1-
		arr = Arrays.stream(arr).sorted().toArray(); // Sorting using Stream API

		double median = (n % 2 == 0) ? (arr[n / 2 - 1] + arr[n / 2]) / 2.0 : arr[n / 2];

		System.out.println(" method-2-Median: " + median);
	}

	
	// method-1-Simple Java Program (Using Sorting)
	public static void findMedian(int[] arr) {

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int n = arr.length;

		double median;
		if (n % 2 == 0) { 				// Even length
			median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
		} else { 						// Odd length
			median = arr[n / 2];
		}

		System.out.println("method-1-Median: " + median);

	}
}
