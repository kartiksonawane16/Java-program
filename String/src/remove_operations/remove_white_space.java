package remove_operations;

public class remove_white_space {

	public static void main(String[] args) {
		String str = "   ka rr to  rina     my    ";
		
		String newStr = str.replaceAll("\\s+", "");
		System.out.println(newStr);
		
		System.out.println(((Object) newStr).getClass().getSimpleName());
		;
		
	}


}
