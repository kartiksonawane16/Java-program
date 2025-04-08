package Sort;

public class SortingBasic {

	public static void main(String[] args) {
		
		int[] a = { 45, 12, 78, 34, 89, 21 , 21, 1, 12};

		for (int i = 0; i < a.length - 1; i++) {   // i = 0 to 7
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					// Changed to a[i] > a[j] for ascending order
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// Print the sorted array in ascending order
		for (int value : a) {
			System.out.print(value + " ");
		}
		

	}

}
