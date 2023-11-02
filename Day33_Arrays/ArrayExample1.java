package Day33_Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
		// Create array:
		int[] arr = { 1, 2, 3, 4, 5 };
		// Create another array with same length as arr
		int[] copied_arr = new int[arr.length];
		// Copy elements from one array to another array
		for (int i = 0; i < arr.length; i++) {
			copied_arr[i] = arr[i];
		}
		// Display copied element
		System.out.println("copied array: ");
		// we use Each loop here
		for (int a : copied_arr) {
			System.out.println(a + "");
		}
	}

}
