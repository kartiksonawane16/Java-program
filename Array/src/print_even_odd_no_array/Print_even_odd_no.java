package print_even_odd_no_array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Print_even_odd_no {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 33, 9 };

		// method-1- for loop
		int evenCount = 0, oddCount = 0;

		System.out.print("Even Numbers: ");
		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
				evenCount++;
			}
		}

		System.out.print("\nOdd Numbers: ");
		for (int num : arr) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
				oddCount++;
			}
		}

		System.out.println("\nEven Count: " + evenCount);
		System.out.println("Odd Count: " + oddCount);

		
		// method-2-UUsing Java 8 Feature
		long evenCount1 = Arrays.stream(arr).filter(n -> n % 2 == 0).count();
		long oddCount1 = Arrays.stream(arr).filter(n -> n % 2 != 0).count();

		System.out.println("Even Numbers: " + Arrays.toString(Arrays.stream(arr).filter(n -> n % 2 == 0).toArray()));
		System.out.println("Odd Numbers: " + Arrays.toString(Arrays.stream(arr).filter(n -> n % 2 != 0).toArray()));

		System.out.println("Even Count: " + evenCount1);
		System.out.println("Odd Count: " + oddCount1);
		
		
		
		// method-3- Using Java Stream
		
		long evenCount2 = IntStream.of(arr).filter(n -> n % 2 == 0).count();
        long oddCount2 = IntStream.of(arr).filter(n -> n % 2 != 0).count();

        System.out.print("Even Numbers: ");
        IntStream.of(arr).filter(n -> n % 2 == 0).forEach(num -> System.out.print(num + " "));

        System.out.println(" ");
        
        System.out.print("Odd Numbers: ");
        IntStream.of(arr).filter(n -> n % 2 != 0).forEach(num -> System.out.print(num + " "));

        System.out.println(" ");
        System.out.println("Even Count: " + evenCount2);
        System.out.println("Odd Count: " + oddCount2);

	}

}
