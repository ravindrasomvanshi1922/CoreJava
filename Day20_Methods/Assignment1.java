package Day20_Methods;

public class Assignment1 {

	// ReverseNumber........................................................

	public static int reverseNumber(int num) {
		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		return reverse;
	}

	// PrimeNumber...........................................................

	public static boolean Primenumber(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	// To print even number between given range.........................

	public static void evenNumber(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}

	// ................................................................................

	public static void main(String[] args) {
		int number = 54321;
		int reverseNumber = reverseNumber(number);
		System.out.println("Original Number is : " + number);
		System.out.println("Reverse Number is : " + reverseNumber);
		System.out.println("******************************************");
		// ......................................................................................

		int num = 7;
		if (Primenumber(num)) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
		System.out.println("*********************************************");
		// ..................................................................................

		int start = 1;
		int end = 50;
		evenNumber(start, end);

	}
}
