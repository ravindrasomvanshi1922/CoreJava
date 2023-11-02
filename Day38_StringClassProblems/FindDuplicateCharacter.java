package Day38_StringClassProblems;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String str3 = "mumbaimu";
		char[] charArray = str3.toCharArray();
		int ct;

		for (int i = 0; i < charArray.length; i++) {
			ct = 1;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					ct++;
					charArray[j] = 0;
				}
			}
			if (ct > 1 && charArray[i] != 0) {
				System.out.println(charArray[i] + ": " + ct);
			}
		}

	}

}
