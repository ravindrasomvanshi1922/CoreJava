package Day18_Methods;

public class MethodExamplePractice1 {

	public static void main(String[] args) {

	// static global variables
	static int age;
	static double salary;

	/**
	 * This is a static method with return type as int and no parameter in it Method
	 * type: static Access Modifier: public non-access Modifier: statiic return
	 * type: int method name: test1 argument: na return value: 201201
	 */
	public static int test1() {
		System.out.println("I am test1 method.");
		// logic
//					int pin=201201;
//					return pin;
		return 201201;
	}

	/**
	 * This is a static method with return type as void and having no parameter
	 * Method type: static Access Modifier: defalut non-access Modifier: static
	 * return type: void method name: test2 argument: na return value: na
	 */
	static void test2() {
		System.out.println("I am test2 method");
		// return; this will be written by java compiler at compile
	}

	/**
	 * This is a static method with return type as double and having parameter as
	 * boolean Method type: static Access Modifier: public non-access Modifier:
	 * static return type:double method name: test3 argument: boolean return value:
	 * 15.36
	 */
	static public double test3(boolean b1) {
		System.out.println("");
		double d = 15.36;
		return d;
	}

	/**
	 * This is a static private method with return type as void and having parameter
	 * as float Method type: non static Access Modifier: private non-access
	 * Modifier: non static return type: void method name: test4 argument: float
	 * return value: na
	 */
	private void test4(float f) {
		System.out.println("");
	}

	/**
	 * Method type: static Access Modifier: public non-access Modifier: static
	 * return type: void method name: main argument: string return value: na
	 */
	static public void main(String[] args) {

	}

}

}

}
