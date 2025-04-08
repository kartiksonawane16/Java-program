package Remove_Duplicate;

import java.util.*;
import java.util.stream.IntStream;

public class RemoveDuplicateHashMap {
	
	public static void removeDuplicate(int[] a){
        HashMap<Integer, Boolean> mp = new HashMap<>();
 
        System.out.println("method-1 : ");
        for (int i = 0; i < a.length; i++) {
            if (mp.get(a[i]) == null)
            {                
                mp.put(a[i], true);
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
    }

	public static void setMethod(int[] arr) {
		  // using set
		  Set<Integer> set = new HashSet<>();
	        
	        for (int m = 0; m < arr.length; m++) 
	        {
	        	set.add(arr[m]);
	        }
	        
	        int[] ArrayWithNoDuplicates = new int[set.size()];
	        int i=0;
	        
	       Iterator<Integer> itr = set.iterator();
	       
	       while(itr.hasNext()) {
	    	  ArrayWithNoDuplicates[i] = itr.next();
	    	   i++;
	       }
	    System.out.println("method-2 : " + Arrays.toString(ArrayWithNoDuplicates));
	}
	
	
	public static void main(String[] args) {
		
		  int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
		  
		  // Basic
		  removeDuplicate(arr);
		  
		  // set method
		  setMethod(arr);
		  
		  
		  // Stream 
		  int[] res = IntStream.of(arr).distinct().sorted().toArray();
		  System.out.println("method-3 with IntStream : " + Arrays.toString(res));
		  
		  int[] rr = Arrays.stream(arr).distinct().sorted().toArray();
		  System.out.println("method-4 with Stream : " + Arrays.toString(rr));
		  
		
	    
		  
	}

}
