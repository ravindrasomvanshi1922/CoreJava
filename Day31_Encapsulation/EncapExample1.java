package Day31_Encapsulation;

class demo {
	private int age = 20;
	private double salary = 25000.00;

//  implemented getter method ----> In this method we can read only

	public int getage() {
		return age;
	}

	public double getsalary() {
		return salary;
	}
// implemented setter method ----> In this method we can make changes means we can write only

	public void setage(int age) {
		this.age = age;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}
}

// If we implement both of the methods then we can read and write this essentials info.

public class EncapExample1 {

	public static void main(String[] args) {
		demo d1 = new demo();
		System.out.println(d1.getage());
		System.out.println(d1.getsalary());
		System.out.println("_________________________");
		System.out.println("");
		d1.setage(40);
		d1.setsalary(50000.00);
		System.out.println("updated age: " + d1.getage());
		System.out.println("updated salary: " + d1.getsalary());

	}

}