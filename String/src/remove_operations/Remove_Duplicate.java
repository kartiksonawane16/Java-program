package remove_operations;

import java.util.Scanner;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		// method-1 java 8
		StringBuilder sb = new StringBuilder();
		
		str.chars().distinct().forEach(c -> sb.append((char)c));
		
		System.out.println(sb);
		
		// method-2 java 8
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			int ind = str.indexOf(c, i+1);
			
			if (ind == -1) {
				sb2.append(c);
			}
		}
		System.out.println(sb2);
		
	}

}
