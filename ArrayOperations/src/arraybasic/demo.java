package arraybasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class demo {

	 public static int[] mergeArraysAndRemoveDuplicates(int[] arr1, int[] arr2) {  
		 
        int[] mergedArray = new int[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i< arr1.length; i++) {
        	mergedArray[k] = arr1[i];
        	k++;
        }
        
        for(int j = 0; j< arr2.length; j++) {
        	mergedArray[k] = arr1[j];
        	k++;
        }
	        
        Set<Integer> setWithNoDuplicates = new HashSet<>();    
	        
        for(int m =0; m<mergedArray.length; m++) {
        	setWithNoDuplicates.add(mergedArray[m]);
        }
	    
        int[] mergedArrayWithNoDuplicates = new int[setWithNoDuplicates.size()];
        int n=0;
        Iterator<Integer> itr = setWithNoDuplicates.iterator();
        while (itr.hasNext()) {
        	mergedArrayWithNoDuplicates[n] = itr.next();
			n++;
		}
        
        Arrays.sort(mergedArrayWithNoDuplicates);
        
        return mergedArrayWithNoDuplicates;
	              
}
	 
	 
	public static void main(String[] args) {
	
		  int[] a = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
	         
	        int[] b = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
	        
	        int[] mergedArray = mergeArraysAndRemoveDuplicates(a,b);
	        System.out.println(Arrays.toString(mergedArray));
	}



}
