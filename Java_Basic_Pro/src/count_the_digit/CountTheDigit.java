package count_the_digit;

import java.util.Scanner;

public class CountTheDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		int no = sc.nextInt();
		int cnt = 0;
		
		while(no > 0) {
			no = no / 10;
			cnt ++;	
		}
		
		System.out.println("count of digit is : " + cnt);
		
	}

}
