package reveser_String;

import java.util.Scanner;

public class ReveserUsingStringBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse  : ");
		String s = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println("reverse is : "+ sb.reverse());
		

	}

}
