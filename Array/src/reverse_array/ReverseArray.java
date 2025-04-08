package reverse_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {
		//
		int[] arr = {1, 2, 3, 4, 5};
		Integer[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] reversed = IntStream.range(0, arr.length)
                                  .map(i -> arr[arr.length - 1 - i])
                                  .toArray();

        System.out.println("Reversed Array: " + Arrays.toString(reversed));
        
        //
        
        List<Integer> list = Arrays.asList(arr2);
        Collections.reverse(list);

        System.out.println("Reversed Array: " + list);
        
        //
        
     // Convert int[] to Integer[] (Boxing)
        Integer[] boxedArray = Arrays.stream(arr) // Using Streams to box primitives
                                     .boxed()
                                     .toArray(Integer[]::new);

        // Convert Integer[] to List and reverse
        List<Integer> list2 = Arrays.asList(boxedArray);
        Collections.reverse(list2);

        // Print the reversed list
        System.out.println("Reversed List: " + list2);

	}

}
