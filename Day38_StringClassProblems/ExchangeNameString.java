package Day38_StringClassProblems;

public class ExchangeNameString {
	public static void main(String[] args) {

		String OriginalName = "Hello Java World";
		System.out.println("OriginalName: " + OriginalName);
		String[] NewName = OriginalName.split(" ");

		if (NewName.length == 3) {
			String NewOrder = NewName[2] + " " + NewName[1] + " " + NewName[0];
			System.out.println("ExchangeName: " + NewOrder);
		} else {
			System.out.println("String Not change");
		}
	}

}
