package scond_largest;

import java.util.Comparator;
import java.util.stream.IntStream;

public class ScondLargest {

	public static void main(String[] args) {
		
		int[] arr = {1,1};
		
		int no = IntStream.of(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
		if(no == -1) {
			System.out.println("no no");
		}else {
			System.out.println("no :" + no);
		}

	}

}
// maven-archetype-quickstart