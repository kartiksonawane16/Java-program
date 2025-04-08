package other;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  : ");
		int n = sc.nextInt();
		int cnt = 0;
		//int m = n / 2;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt++;
			}
		}

		if (cnt == 2) {
			System.out.println("no is prime");
		} else {
			System.out.println("no is not prime");
		}

	}

}
