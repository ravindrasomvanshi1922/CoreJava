package Day31_Encapsulation;

class info {
	private String name = "Apurav";
	private int age = 24;
	private String country = "India";

// Getter Method for info read only.....

	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}

	public String getcountry() {
		return country;
	}

// Setter method for make changes.....

	public void setname(String name) {
		this.name = name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void setcountry(String country) {
		this.country = country;
	}
}

public class EncapExample2 {

	public static void main(String[] args) {
		info i1 = new info();
		System.out.println("Name: " + i1.getname());
		System.out.println("Age: " + i1.getage());
		System.out.println("Country: " + i1.getcountry());

		System.out.println("______________________________________");
		System.out.println("");

		i1.setname("Apurva");
		i1.setage(22);
		i1.setcountry("India");

		System.out.println("New updated Name: " + i1.getname());
		System.out.println("New updated Age: " + i1.getage());
		System.out.println("New updated Country: " + i1.getcountry());

	}

}
