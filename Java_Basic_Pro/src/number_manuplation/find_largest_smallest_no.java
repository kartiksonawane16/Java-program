package number_manuplation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class find_largest_smallest_no {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> num  = new ArrayList<Integer>();
		
		System.out.println("Enter the size  : ");
		int size = sc.nextInt();
		for(int i=0 ; i < size ; i++){
			num.add(sc.nextInt());
		}
		
		System.out.println("Given no are :" + num);
		
		 // Find the largest number using Streams
        int largestNumber = num.stream() // Convert ArrayList<Integer> to Stream<Integer>
        		.distinct()
                .max(Comparator.naturalOrder()) // Get the maximum value
                .orElseThrow(() -> new IllegalArgumentException("List is empty")); // Handle empty list case
        
        int smallestNumber = num.stream()
        						.distinct()
        						.min(Comparator.naturalOrder())
        						.orElseThrow(() -> new IllegalArgumentException("List is empty"));

        System.out.println("Largest number is: " + largestNumber);
        System.out.println("Smallest number is: " + smallestNumber);
		
        
	}

}
