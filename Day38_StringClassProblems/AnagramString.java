package Day38_StringClassProblems;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String x = "LISTEN";
		String y = "SILENT";

// convert the string into char array{]

		char a[] = x.toCharArray();
		char b[] = y.toCharArray();

// sort both of strings 

		Arrays.sort(a);
		Arrays.sort(b);

// check a and b if same or not

		Boolean result = Arrays.equals(a, b);

// if a and b is same dn string is anagram

		if (result == true) {
			System.out.println("Strings Are Anagram");
		} else {
			System.out.println("Strings Are Not Anagram");
		}

	}

}
