package LogicalProgramPractice;

public class Pallindrom {

	public static void main(String[] args) {
		int number = 101;
		int reverse = 0;
		int originalnum = number;// stored the number value in original number

// get reverse the original number
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

// compare original num and reverse with if else condition

		if (originalnum == reverse) {
			System.out.println("Pallindrom");
		} else {
			System.out.println("Not Pallindrom");
		}
	}

}
