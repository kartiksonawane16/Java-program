package check_2_arrays_same;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Check_2_arrays_same {

	public static void main(String[] args) {

		int[] a = {10, 20, 30, 40};
		int[] b = {10, 20, 30, 48};
		
		
	// method-1- for loop
		if(isArraysEqual(a, b)) {
			System.out.println("array are equal ");
		}else {
			System.out.println("array are not equal ");
		}
		
		
		//  method-2-Using Java 8 Arrays.equals()
		Arrays.sort(a);
        Arrays.sort(b);

        boolean isEqual = Arrays.equals(a, b); // ✅ Simplified using Arrays.equals()

        System.out.println(isEqual ? "Arrays are equal" : "Arrays are not equal");
		
		
    // method-3-Using Java 8 Streams
        
        boolean isEqual2 = Arrays.stream(a).sorted().toArray().length == Arrays.stream(b).sorted().toArray().length &&
                Arrays.equals(Arrays.stream(a).sorted().toArray(), Arrays.stream(b).sorted().toArray());

        System.out.println(isEqual2 ? "Arrays are equal" : "Arrays are not equal");
        
        
       // method-4-Using Java 8 IntStreams
        
        boolean isEqual3 = IntStream.of(a).sorted().toArray().length == IntStream.of(b).sorted().toArray().length &&
                Arrays.equals(IntStream.of(a).sorted().toArray(), IntStream.of(b).sorted().toArray());

        System.out.println(isEqual3 ? "Arrays are equal" : "Arrays are not equal");
           

	}
	
	//  method-1-
	public static boolean isArraysEqual(int[] a, int[] b) {
		
		if (a.length != b.length) {
			return false;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i= 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}		
		}
		
		return true;
	}

}
