package Print_duplicate;



public class Basic {

	 public static void main(String[] args) {
	        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2, 1, 1, 16, 16};

	        System.out.println("Duplicate elements and their occurrences:");
	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;
	            // Check if the current element is already printed as duplicate
	            boolean alreadyPrinted = false;
	            for (int j = 0; j < i; j++) {
	                if (arr[j] == arr[i]) {
	                    alreadyPrinted = true;
	                    break;
	                }
	            }
	            // Skip if already printed
	            if (alreadyPrinted) {
	                continue;
	            }
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }
	            if (count > 0) {
	                System.out.println(arr[i] + "  -->  " + (count + 1));
	            }
	   
	        } // end for
	        
	    }	// end main
		
		
		public void other() {
//		 int[] arr = {1, 2, 5, 1, 7, 2, 4, 2, 1, 1, 16, 16};
//
//	        for (int i = 0; i < arr.length; i++) {
//	            int count = 0;
//	            for (int j = i + 1; j < arr.length; j++) {
//	                if (arr[i] == arr[j]) {
//	                    count++;
//	                }
//	            }
//	            if (count >= 1) {
//	                System.out.print(" " + arr[i]);
//	                i += (count); // Adjust i to skip duplicate elements
//	            }
//	        }
//		
		
		
		
		
		
//		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2, 1, 1, 16, 16};
//		
//		for(int i=0; i<arr.length; i++) {
//			int count = 0;
//			for(int j=i+1; j<arr.length; j++) {
//				if (arr[i] == arr[j])
//					count++ ;
////				else 
////					break;
//			}
//			if (count >= 1) {
//				System.out.print ("array is" + Arrays.toString(arr[i]));
//				i += (count+1);
//			}
//		}

	}

}
