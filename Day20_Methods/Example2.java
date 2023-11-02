package Day20_Methods;

public class Example2 {

	public static void main(String[] args) {
		getROI();
		ROI(20000, 2, 2.5f);
	}

	public static void getROI() {
		int p = 45000, t = 2;
		float r = 2.5f;
		double roi = (p * r * t) / 100;
		System.out.println("ROI Is = " + roi);
	}

	public static double ROI(int p, int t, float r) {
		double roi = (p * r * t) / 100;
		System.out.println("rate of interest is = " + roi);
		return roi;

	}

}
