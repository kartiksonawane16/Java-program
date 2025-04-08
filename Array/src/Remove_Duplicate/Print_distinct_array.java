package Remove_Duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Print_distinct_array {

	    public static void main(String[] args) {
	    	
	        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
	        
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
	    System.out.println(Arrays.toString(ArrayWithNoDuplicates));
	    
	    
	    
	    }
}
