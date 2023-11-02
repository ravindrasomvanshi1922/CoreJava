package CollectionsPracticePrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class Example1 {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Kalpesh");
		names.add("Durvesh");
		names.add("Vivek");
		names.add("Apurva");
		names.add("Kalpesh");
		names.add("Vivek");

		HashSet<String> UniqueElement = new HashSet<>(names);
		System.out.println("Unique Element: " + UniqueElement);
	}

}
