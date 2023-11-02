package Day26_Inheritance;

class vehicle {
	void Display() {
		System.out.println("I am  an vehicle");
	}

}

class car extends vehicle {
	void calling() {
		System.out.println("I am  a car");
	}
}

class sedan extends car {
	void testing() {
		System.out.println("I am  a sedan");
	}
}

public class Example2 {

	public static void main(String[] args) {
		sedan s1 = new sedan();
		s1.Display();
		s1.calling();
		s1.testing();

	}

}
