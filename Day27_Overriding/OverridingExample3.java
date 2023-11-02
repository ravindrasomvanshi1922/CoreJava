package Day27_Overriding;

class birds {
	birds() {
	}

	public void fly() {
		System.out.println("Birds are able to fly");
	}
}

class Parrot extends birds {
	Parrot() {
	}

	public void fly() {
		System.out.println("Parrot able to fly");
	}

	public void parrot() {
		System.out.println("Parrot is green");
	}
}

public class OverridingExample3 {
	public static void main(String[] args) {
		birds b1 = new birds();
		b1.fly();
		System.out.println("__________________________________________");

		Parrot p1 = new Parrot();
		p1.fly();
		p1.parrot();
		System.out.println("__________________________________________");

		birds p2 = new Parrot(); // ---------> Parent class reference variable and child class object
		p2.fly();
		System.out.println("__________________________________________");

	}

}
