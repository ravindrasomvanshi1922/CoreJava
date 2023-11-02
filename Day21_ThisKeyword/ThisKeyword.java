package Day21_ThisKeyword;

public class ThisKeyword {
	int variable = 5;
	int age = 10;

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.method(20);
		obj.method();
		System.out.println("obj GV variable: " + obj.variable);// 5
		ThisKeyword obj2 = new ThisKeyword();
		System.out.println("obj2 GV variable: " + obj2.variable);// 20
	}

	void method(int variable) {
		System.out.println("Value of variable :" + variable);// 20
		System.out.println("GV Value of variable :" + this.variable);// 5
		this.variable = variable;
		System.out.println("Value of variable :" + variable);//
		System.out.println("GV Value of variable :" + this.variable);//
	}

	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);

	}

}
