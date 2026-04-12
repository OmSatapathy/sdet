package day12;

public class PrimeNumber {

	public static void main(String[] args) {

		if (isPrime(71)) {
			System.out.println("is prime");
		} else {
			System.out.println("not prime number");
		}

	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < Math.sqrt(n); i++) { // Simple sqrt optimization
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
