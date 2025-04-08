package pattern;

public class MiddelLong {

	public static void main(String[] args) {
		patter1(5);

	}

	static void patter(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void patter1(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		for(int i=n; i<=n; i++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	*/
	}
}
