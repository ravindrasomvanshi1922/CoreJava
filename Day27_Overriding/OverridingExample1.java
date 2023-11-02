package Day27_Overriding;

class animal1 {
	animal1() {
	}

	public void move() {
		System.out.println("Animals can move");
	}
}

class dog extends animal1 {
	dog() {
	}

	// Overriding
	public void move() {
		System.out.println("Dog can walk and run");
	}

	void bark() {
		System.out.println("Dogs can bark");
	}
}

public class OverridingExample1 {
	public static void main(String[] args) {
		animal1 a = new animal1();
		a.move();
		dog d = new dog();
		d.move();
		d.bark();
		System.out.println("********************************************");
		animal1 a1 = new dog(); // Here we will get Dog class Move()
		a1.move();
		// a1.bark() <----- a1 comlpile time error since b's reference type animal
		// doesn't
	}

}
