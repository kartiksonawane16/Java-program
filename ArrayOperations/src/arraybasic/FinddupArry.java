package arraybasic;

import java.util.*;
import java.util.Map.Entry;

//How do you find duplicate elements in an array?
public class FinddupArry {

	private static void findDuplicatesUsingBruteForce(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++) 
        {
            for (int j = i+1; j < inputArray.length; j++) 
            {
                if(inputArray[i] == inputArray[j])
                {
                    System.out.println("Duplicate Element : "+inputArray[i]);
                }
            }
        }
    }
       
    //Method 2 : Sorting Method
       
    private static void findDuplicatesUsingSorting(int[] inputArray)
    {
        Arrays.sort(inputArray);
           
        for (int i = 0; i < inputArray.length-1; i++)
        {
            if(inputArray[i] == inputArray[i+1])
            {
                System.out.println("Duplicate Element : " + inputArray[i]);
            }
        }
    }
       
    //Method 3 : Using HashSet
       
    private static void findDuplicatesUsingHashSet(int[] inputArray)
    {
        HashSet<Integer> set = new HashSet<Integer>();
           
        for (int element : inputArray) 
        {
            if( ! set.add(element))
            {
                System.out.println("Duplicate Element : "+element);
            }
        }
    }
       
    //Method 4 : Using HashMap
       
    private static void findDuplicatesUsingHashMap(int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
           
        for (int element : inputArray) 
        {   
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }
           
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
           
        for (Entry<Integer, Integer> entry : entrySet) 
        {               
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }
       
       
    public static void main(String[] args) 
    {
        int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
       
        System.out.println("======Duplicates Using Brute Force======");
           
        findDuplicatesUsingBruteForce(inputArray);
           
        System.out.println("======Duplicates Using Sorting======");
           
        findDuplicatesUsingSorting(inputArray);
           
        System.out.println("======Duplicates Using HashSet======");
           
        findDuplicatesUsingHashSet(inputArray);
   
        System.out.println("======Duplicates Using HashMap======");
           
        findDuplicatesUsingHashMap(inputArray);
           
    }

}
