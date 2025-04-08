package merge_Array;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50, 60 };
		int[] b = { 50, 60, 70, 80 };
		
		int[] mergedArray = new int[a.length + b.length];
		int k = 0;
		
        for(int i = 0; i< a.length; i++) {
        	mergedArray[k] = a[i];
        	k++;
        }
        
        for(int j = 0; j< b.length; j++) {
        	mergedArray[k] = b[j];
        	k++;
        }
        
        System.out.println(Arrays.toString(mergedArray));
        
        
	}

}
