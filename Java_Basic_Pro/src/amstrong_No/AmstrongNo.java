package amstrong_No;

import java.util.Scanner;

public class AmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		int no = sc.nextInt();
		
		int rem=0 , sum = 0, org = 0;
		org = no;

		while(org !=  0) {
			rem = org % 10;
			sum = sum + (rem * rem * rem); // sum=sum+Math.pow(rem, 3);
			org = org /10 ;
		}
		
		if(no == sum) {
			System.out.println("no is Amstrong");
		}else {
			System.out.println("no is not Amstrong");
		}
	}
}


