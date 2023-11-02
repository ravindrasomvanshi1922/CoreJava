package LogicalProgramPractice;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before Swapping A: " + a);
		System.out.println("Before Swapping B: " + b);

		System.out.println("**************************");

		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping A: " + a);
		System.out.println("After Swapping B: " + b);

	}

}
