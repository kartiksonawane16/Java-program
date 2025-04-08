package reveser_String;

import java.util.Scanner;

public class ReveserString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse  : ");
		String s = sc.nextLine();
		
		String rev = "";
		int len = s.length();
		for(int i = len-1; i >=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("reverse String is : "+ rev);
		System.out.println("******************* ");
		
	/*
		for(int j=s.length()-1; j>=0; j--) {
			System.out.print(s.charAt(j));
		}
	*/	
		//
		name(s);
		
	}
	
	public static void name(String s) {
		
		String rev="";
		for(int j=s.length()-1; j>=0; j--) {
			
			rev = rev + s.charAt(j);
			
		}
		System.out.print("String is : "+ rev);
	}

}
