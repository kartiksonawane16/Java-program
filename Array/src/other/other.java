package other;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class other {

	public static void main(String[] args) {
		// reverse array 
		
		int[] arr1 = { 1, 2, 3, 4, 5, 1, 6, 1, 4, 7, 7, 6, 1 };
		
		int[] rev = IntStream.of(arr1).distinct().sorted().toArray();
		
		 int[] rev1 = Arrays.stream(arr1)
                 .boxed()
                 .sorted(Comparator.reverseOrder())
                 .mapToInt(Integer::intValue)
                 .toArray();

		 System.out.println(Arrays.toString(rev));
		 		System.out.println(Arrays.toString(rev1));
		 		System.out.println(rev[rev.length-2]);
		 		
		 		
	}

}
