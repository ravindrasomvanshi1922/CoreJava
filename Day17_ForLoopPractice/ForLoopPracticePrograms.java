package Day17_ForLoopPractice;

public class ForLoopPracticePrograms {

	public static void main(String[] args) {
		// write text 5 times ....?

		int n = 5;
		for (int i = 1; i <= 5; i++) {
			System.out.println("I Am Ravindra");
		}
		System.out.println("************************");

		// Display numbers 1 to 5..?

		int m = 5;
		for (m = 1; m <= 5; m++) {
			System.out.println(m);
		}
		System.out.println("************************");

		// Display the sum of n natural numbers...?

		int num = 50, sum = 0;
		for (num = 1; num <= 50; num++) {
			sum = sum + num;
		}
		System.out.println("Sum of 50 natural numbers is =" + sum);
		System.out.println("************************");

		// Display Upper case Alphabets using for loop...?

		char A1 = 'A';
		for (A1 = 'A'; A1 <= 'Z'; A1++) {
			System.out.println(" " + A1);
		}
		System.out.println("************************");
		// Display Lower case Alphabets using for loop...?

		char c1 = 'a';
		for (c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.println(" " + c1);
		}
		System.out.println("************************");

		// Count Number Of Digits In An Integer Using For Loop...?
		// Reverse The Number using For Loop ...?

		int num2 = 10;
		for (num2 = 10; num2 >= 1; num2--) {
			System.out.println(num2);
		}
		System.out.println("************************");

		// Java Program To check Pallindrome String..?
		// Factors of Positive Number.....?

		int j = 60;
		for (j = 1; j <= 60; j++) {
			if (60 % j == 0) {
				System.out.println(j);
			}
		}
		System.out.println("************************");

//			Factors of Negetive Number.....?

		int k = -60;
		for (k = 1; k <= -60; k++)
			if (-60 % k == 0) {
				System.out.println(k);
			}

	}

}
