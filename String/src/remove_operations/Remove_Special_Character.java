package remove_operations;

public class Remove_Special_Character {

	public static void main(String[] args) {
		
		String str = "kartik%%fhj*((ndk#djjj00878K==-9kk";
		String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(newStr);
		

	}

}
