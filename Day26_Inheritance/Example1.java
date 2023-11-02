package Day26_Inheritance;

class country {
	void display() {
		System.out.println("I am Display Method of country");
	}
}

class state {
	void calling() {
		System.out.println("I am Calling method of state");
	}
}

class city {
	void testing() {
		System.out.println("I am testing method of city");
	}
}

public class Example1 {
	public static void main(String[] args) {
		country c1 = new country();
		c1.display();
		state s1 = new state();
		s1.calling();
		city c2 = new city();
		c2.testing();
	}

}
