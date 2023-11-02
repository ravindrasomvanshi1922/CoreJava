package Day29_Interface;

interface drawable {
	int salary = 50000;

	void draw();
}

class rectangle implements drawable {
	public void draw() {
		System.out.println("I am rectangle");
	}
}

class circle implements drawable {
	public void draw() {
		System.out.println("I a circle");
	}
}

public class Interface1example3 {

	public static void main(String[] args) {
		System.out.println("Salary of drawable is : " + drawable.salary); // Salary of drawable is : 50000
		rectangle r1 = new rectangle();
		r1.draw(); // I am rectangle
		circle c1 = new circle();
		c1.draw(); // I a circle
		drawable d1 = new rectangle();
		d1.draw(); // I am rectangle
		drawable d2 = new circle();
		d2.draw(); // I a circle

	}

}
