package count_the_digit;

import java.util.Scanner;

public class Number_of_Even_Odd_Digit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		int no = sc.nextInt();
		
		int lastDigit = 0;
		int evenCnt = 0;
		int oddCnt = 0;
		
		StringBuilder evenNo = new StringBuilder();
		StringBuilder oddNo = new StringBuilder();
		
		
		
		while(no > 0) {
			lastDigit = no % 10;
			
			if(lastDigit % 2 == 0) {
				evenNo.append(lastDigit).append(" ");
				evenCnt++;}
			else {
				oddNo.append(lastDigit).append(" ");
				oddCnt++;}
			no = no / 10;
			
		}
		
		System.out.println("even count : " + evenCnt++);
		System.out.println("odd count : " + oddCnt++);
		
		System.out.println("even no are : " + evenNo);
		System.out.println("odd no are  : " + oddNo);
		
	

	}

}
