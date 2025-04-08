package prime_No;

public class FindPrimeNo {

	 public static void main(String[] args) {
	        int[] arr = {1,0,2,3,10, 11, 17, 21, 29, 33, 37, 40}; 
	        System.out.println("Prime numbers in the array:");
	        
	        for (int num : arr) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false; // Numbers <= 1 are not prime
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) { // Check divisors up to √n
	            if (n % i == 0) {
	                return false; // Not a prime number
	            }
	        }
	        return true; // Prime number
	    }

	}


