package other;

import java.util.Scanner;

public class AmstringNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		int no = sc.nextInt();
		int rem = 0;
		int sum = 0;
		int org = no;

		while(no > 0) {
			rem = no % 2;
			sum = sum + (rem * rem * rem);
			no = no /10 ;
		}
		
		if(org == sum) {
			System.out.println("no is Amstrong");
		}else {
			System.out.println("no is not Amstrong");
		}
	}

}
