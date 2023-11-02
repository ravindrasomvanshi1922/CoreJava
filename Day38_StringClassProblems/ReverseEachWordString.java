package Day38_StringClassProblems;

public class ReverseEachWordString {
	public static void main(String[] args) {
		String str2 = "Java Programming";
		String[] words = str2.split(" ");
		String revString = "";

// this loop will iterate each word in the string

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revword = "";

// this loop will reverse the string 

			for (int j = word.length() - 1; j >= 0; j--) {
				revword = revword + word.charAt(j);
			}
			revString = revString + revword + " ";
		}
		System.out.println(revString);
	}

}
