package day9;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {

		int[] arr = { 44, 5, 66, 33, 90, 5 };
		int[] arr1 = { 12, 42, 2, 90, 6, 5, 99, 2 };

		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();

		for (int i : arr) {
			set.add(i);
		}

		for (int i : arr1) {
			if (set.contains(i)) {
				duplicate.add(i);
			}
		}

		System.out.println(duplicate);

		// fibonacci series

		// 0 1 1 2 3 5 8 13

		int n = 10, a = 0, b = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(a + ", ");

			// compute the next term
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}
	}

}
