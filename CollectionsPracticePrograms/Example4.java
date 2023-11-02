package CollectionsPracticePrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Example4 {
	public static void main(String[] args) {

		Queue<Integer> L2 = new LinkedList<>();
		ArrayList<Integer> L3 = new ArrayList<>();
		L3.add(1);
		L3.add(2);
		L3.add(3);
		L3.add(4);
		L3.add(5);

		// Add all List elements in the queue.....
		L2.addAll(L3);
		System.out.println("Queue List: " + L2);
	}

}
