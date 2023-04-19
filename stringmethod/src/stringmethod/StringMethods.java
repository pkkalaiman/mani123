package stringmethod;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Hello world";
		String str1 = "Hello ";
		String str2 = "Hello";
		char result = str.charAt(1);

		System.out.println(result);

		System.out.println();
		System.out.println("Hascode :" + str.hashCode()); // The hashCode() method returns the hash code of a string.

		System.out.println("CompareTo :" +str.compareTo(str2)); // he will check the method on String to string

		System.out.println("Containse :" + str.contains("g")); // it will check the charcter there are not

		System.out.println("equals :" + str.equals(str1)); // it will chect the contains equals are not

		System.out.println("IndexOf :" + str.indexOf("world")); // it will check the number in character

		System.out.println("isEmty :" + str.isEmpty()); // it is String emty or not

		System.out.println("Length :" + str.length());// it will check the charactor length

		System.out.println("Replace :" + str.replace("2", "d")); // it will replacing the charector

		System.out.println("Split :" + str.split("-")); // it will clear the space split the characters

		System.out.println("UpperCase :" + str.toUpperCase()); // it will charactor uppercase tho the characters

		System.out.println("LowerCase :" + str.toLowerCase()); // it will change the lowercase in charectors

		System.out.println("Trim : " + str.trim()); // it will remove the space in left &right

		System.out.println("StartWidth :" + str.startsWith("H")); // it will check the start with the same character are
																	// not
		System.out.println("StartWidth :" + str.startsWith("j"));

		System.out.println("EndWidth :" + str.endsWith("d")); // it wil check the endswidth same charactors are not
		System.out.println("EndWidth :" + str.endsWith("C"));

	}

}
