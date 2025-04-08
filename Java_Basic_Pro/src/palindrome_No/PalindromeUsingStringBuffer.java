package palindrome_No;

import java.util.Scanner;

public class PalindromeUsingStringBuffer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		int no = sc.nextInt();

		StringBuffer sb = new StringBuffer(String.valueOf(no));
		
		sb.reverse();
		
		//StringBuffer rev = sb.reverse();
		//System.out.println(sb.reverse());

		if (String.valueOf(no).equals(sb.toString())) {
			System.out.println("Given no is palindrome");
		} else {
			System.out.println("Given no Not a palindrome");
		}

	}

}

