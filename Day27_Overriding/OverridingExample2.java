package Day27_Overriding;

class Animal_2 {
	public void move() {
		System.out.println("Animals can move");
	}

	public void display() {
		System.out.println("I am display() of animal_2 class");
	}
}

class Dog_2 extends Animal_2 {
	public void move() {
		System.out.println("Dogs can walk & run");
		display();
	}

}

public class OverridingExample2 {
	public static void main(String[] args) {
		Animal_2 a2 = new Dog_2();
		a2.move();

	}

}
