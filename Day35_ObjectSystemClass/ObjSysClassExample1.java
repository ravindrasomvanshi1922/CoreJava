package Day35_ObjectSystemClass;

public class ObjSysClassExample1 {
	public String tostring() {
		return "Pune";
	}

	public int hashcode() {
		return 101;
	}

	public boolean equals(Object obj) {
		return true;
	}

	public static void main(String[] args) {
		ObjSysClassExample1 e1 = new ObjSysClassExample1();
		System.out.println("e1 with implicit tostring() call: " + e1);
		System.out.println("e1 with explicit tostring() call: " + e1.tostring());
	}

}
