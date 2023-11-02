package Day28_AbstractClass;

abstract class animal {
	abstract void animal_1();

	void cow() {
		System.out.println("Cow is animal");
	}
}

class horse extends animal {
	void animal_1() {
		System.out.println("Animals is treasure of world");
	}

	void horse_1() {
		System.out.println("Horse is animal ");
	}
}

public class AbstractClass2 {
	public static void main(String[] args) {
		horse h1 = new horse();
		h1.animal_1();
		h1.horse_1();
		System.out.println("__________________________");
		System.out.println("");
		animal a1 = new horse(); // Parent class ref variable and child class object
		a1.animal_1();
		a1.cow();
	}

}
