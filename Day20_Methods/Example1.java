package Day20_Methods;

public class Example1 {
	public static void main(String[] args) {
		display();
		addtwonumbers(2, 3);
		addnumbers();

	}

	public static void display() {
		System.out.println("Hi, I am ravi");
		System.out.println("You are learning Core-Java");
		System.out.println("My contact number is 9764975157");
	}

	public static void addtwonumbers(int num1, int num2) {
		int res;
		res = num1 + num2;
		System.out.println("addition is :" + res);
	}

	public static void addnumbers() {
		int num3 = 75, num4 = 25;
		int res = num3 + num4;
		System.out.println("addition is =" + res);
	}
}
