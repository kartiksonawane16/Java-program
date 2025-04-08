package prime_No;

import java.util.Scanner;

public class PrimeNo {

	 static boolean isPrime(int n)
	    {
	        // Corner case
	        if (n <= 1)
	            return false;

	        // Check from 2 to n 
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;

	        return true;
	    }

	    // Driver Program
	 public static void main(String[] args)
	    {
	        int num = 4;
	        if (isPrime(num)) {
	            System.out.println(num + " is prime");
	        }
	        else {
	            System.out.println(num + " is not prime");
	        }
	    }
	}

