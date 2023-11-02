package Day28_AbstractClass;

abstract class shape {
	abstract void draw();
}

class rectangle extends shape {
	void draw() {
		System.out.println("Draw a rectangle ");
	}
}

class circle extends shape {
	void draw() {
		System.out.println("Draw a Circle");
	}
}

public class AbstractClass3 {

	public static void main(String[] args) {
		shape s1 = new rectangle();
		s1.draw();
		shape s2 = new circle();
		s2.draw();

	}

}
