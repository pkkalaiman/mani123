package stringmethod;

public class CodeCountPaint {
	
	public static void main(String[] args) {
		String myStr = "Hello";  //An int value, representing the Unicode value of the character at the index
		int result = myStr.codePointAt(0);
		System.out.println(result);

	}

}
