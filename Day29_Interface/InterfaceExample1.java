package Day29_Interface;

interface A11 {
	void a(); // By default void a consider as public abstract void in interface

	void b();

	void c();

	void d();
}

abstract class B11 implements A11 {
	public abstract void a();

	public abstract void b();

	public abstract void c();

	public void d() {
		System.out.println("I am D ");
	}

	public void e() {
		System.out.println("I am E");
	}
}

class C11 extends B11 {
	public void a() {
		System.out.println("I am A");
	}

	public void b() {
		System.out.println("I am B");
	}

	public void c() {
		System.out.println("I am C");
	}
}

public class InterfaceExample1 {
	public static void main(String[] args) {
		A11 a1 = new C11();
		a1.a();
		a1.b();
		a1.c();
		a1.d();

	}

}
