package CollectionsPracticePrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class Example5 {
	public static void main(String[] args) {

		ArrayList<Integer> l4 = new ArrayList<>();
		HashSet<Integer> l5 = new HashSet<>();

		l4.add(1);
		l4.add(2);
		l4.add(3);
		l4.add(4);
		l4.add(5);

		l5.addAll(l4);
		System.out.println("Set List: " + l5);

	}

}
