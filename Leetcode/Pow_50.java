
public class Pow_50 {

	// O(log n) time complexity
	// O(log n) space complexity
	public static void main(String[] args) {

		System.out.println(myPow(2, 3));
	}

	public static double myPow(double x, int n) {
		long d = n;
		if (n < 0) {

			x = 1 / x;
			d = -n;
		}

		return helper(x, d);
	}

	public static double helper(double x, long n) {
		if (n == 0) {
			return 1.0;
		}

		double result = helper(x, n / 2);
		if (n % 2 == 0) {
			return result * result;
		} else {
			return result * result * x;
		}

	}

}
