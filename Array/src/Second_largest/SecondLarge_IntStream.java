package Second_largest;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SecondLarge_IntStream {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 1, 6, 1, 4, 7, 7, 6, 1 };

		secondLargestNo(arr1);
    }


    public static void secondLargestNo(int[] arr1) {
        OptionalInt secondNo = IntStream.of(arr1)
                                .distinct()                      // Remove duplicates
                                .boxed()                         // Convert to Stream<Integer> for Comparator
                                .sorted((a, b) -> b - a)         // Sort in descending order
                                .skip(1)                         // Skip the largest number
                                .mapToInt(Integer::intValue)     // Convert back to IntStream
                                .findFirst();                    // Get the second largest

        if (secondNo.isPresent()) {
            System.out.println("Second Largest Number is: " + secondNo.getAsInt());
        } else {
            System.out.println("Second Largest Number not found.");
        }
    }
}
