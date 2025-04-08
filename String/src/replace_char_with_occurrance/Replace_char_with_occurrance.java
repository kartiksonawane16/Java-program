package replace_char_with_occurrance;

import java.util.Arrays;

public class Replace_char_with_occurrance {

	public static void main(String[] args) {

		String str = "  Kartik Sonawane  ";

		char charToReplace = 'a';
		int cnt = 1;
		
		if (str.indexOf(charToReplace) == -1) {
			System.out.println("Character is not found  ");
			System.exit(0);
		}
		
		
		for (int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == charToReplace) {
				str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(str.trim());
		
		
		
		
		/*
		char[] arr = newStr.toCharArray();
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == charToReplace) {
				arr[i] = String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		*/
		
		
	}

}
