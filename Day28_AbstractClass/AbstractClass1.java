package Day28_AbstractClass;

abstract class bike {
	abstract void run();

	void speed(int spd) {
		System.out.println("bike speed is : " + spd);
	}
}

class honda extends bike {
	void run() {
		System.out.println("Running slow");
	}

	void colour() {
		System.out.println("the colour is red ");
	}
}

public class AbstractClass1 {
	public static void main(String[] args) {
		honda h1 = new honda();
		h1.run();
		h1.speed(100);
		h1.colour();
		System.out.println("__________________");

		bike b1 = new honda();// Parent class is reference variable and child class is object
		b1.run();
		b1.speed(50);
	}

}
