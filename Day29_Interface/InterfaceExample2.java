package Day29_Interface;

interface selenium {
	void calling();
}

interface QTP {
	void display();
}

public class InterfaceExample2 implements selenium, QTP {

	public void calling() {
		System.out.println("I am overrided method of selenium");
	}

	public void display() {
		System.out.println("I am overrided method of QTP");
	}

	public static void main(String[] args) {
		InterfaceExample2 i1 = new InterfaceExample2();
		i1.calling();
		i1.display();
		selenium s1 = new InterfaceExample2();
		s1.calling();
		QTP q1 = new InterfaceExample2();
		q1.display();

	}

}
