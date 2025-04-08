package arraybasic;

import java.util.*;

public class Arraybasicp {

	public static void main(String[] args) {
		try {
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("rest of the code...");

		int[] a = { 45, 12, 78, 34, 89, 21 };

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) { 
                	// Changed to a[i] > a[j] for ascending order
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Print the sorted array in ascending order
        for (int value : a) {
            System.out.print(value + " ");
        }

		// Arrays.sort(a);
		//System.out.println(Arrays.toString(a)); // Output : [12, 21, 34, 45, 78, 89]

//		for (int i : a) {
//			System.out.println(i);
//		}

	}

}
