package CollectionsPracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static boolean IsInOrder(List<Integer> List) {
		for (int i = 0; i < List.size(); i++) {
			if (List.get(i) > List.get(i - 1)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> L6 = new ArrayList<>();
		L6.add(2);
		L6.add(4);
		L6.add(6);
		L6.add(8);
		L6.add(10);
		System.out.println(L6);

		boolean OrderResult = IsInOrder(L6);
		System.out.println(OrderResult);

	}

}
