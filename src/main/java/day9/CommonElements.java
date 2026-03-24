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
	}

}
