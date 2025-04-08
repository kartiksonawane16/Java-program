package print_alternate_nos;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Print_Alternate_nos {

	public static void main(String[] args) {
		//
		int[] arr = new int[] { 7, -5, 3, 8, -4, 11, -19, 21 };
		int[] arr2 = { 10, 20, 30, 40, 50, 60, 70 };

		// method-1- for loop
		System.out.print("Alternate elements: ");
		for (int i = 0; i < arr.length; i += 2) { // Skipping every second element
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");

		
		// method-2-Using Java 8 Feature (forEach with index)

		System.out.print("Alternate elements: ");
		IntStream.range(0, arr.length)
				.filter(i -> i % 2 == 0) // Select even index elements
				.map(i -> arr[i])
				.forEach(n -> System.out.print(n + " "));
		
		System.out.println(" ");
		
		
		// method-3- Using Java Stream
		int[] alternateNumbers = IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 0)
                .map(i -> arr[i])
                .toArray();

        System.out.println("Alternate elements: " + Arrays.toString(alternateNumbers));
        

	}

}
