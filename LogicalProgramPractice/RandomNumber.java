package LogicalProgramPractice;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int randomNumber = random.nextInt(100);
			System.out.println("Random number Between 1 to 100: " + randomNumber);
		}

	}

}
