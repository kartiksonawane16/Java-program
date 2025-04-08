package count_the_digit;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		int no = sc.nextInt();
	/*	
		int rem = 0;
		int sum = 0;
		int cnt = 0;
		
		while(no != 0) {
			rem = no % 10; // 1234 4
			sum = sum + rem;
			no = no / 10;  // 123
			cnt++;
			
		}
		
		System.out.println("count of digit is : " + cnt);
		System.out.println("sum of digit is : " + sum);
		*/
		
		int num = String.valueOf(Math.abs(no))
				.chars()
				.map(Character::getNumericValue)
				.sum();
		System.out.println("sum of digit is : " + num);
		

		
	}

}
