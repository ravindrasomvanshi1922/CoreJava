package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList();
		l1.add(44);
		l1.add(33);
		l1.add(22);
		l1.add(11);
		l1.add(5);
		System.out.println("List Elements Are: " + l1);

		Collections.sort(l1);

		for (int i = 0; i < l1.size(); i++) {
			for (int j = i + 1; j < l1.size(); j++) {
				if ((l1.get(i) - l1.get(j)) < 0) {
					System.out.println("desending list");
				}
			}
		}
	}

}
