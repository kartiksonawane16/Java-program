package palindrome_No;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		
		if (s.equals(sb.toString())) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String Not a palindrome");
		}

	}

}
