package palindrome_No;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeNo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		int no = sc.nextInt();
		
		int org = no;
		int rev = 0;
		while(no != 0) {
			rev = rev*10 + no % 10;
			no = no / 10;		
		}
		System.out.println(rev);
		
		if (org == rev)
			System.out.println("no is Palindrome");
		else
			System.out.println("no is not Palindrome");
}
}