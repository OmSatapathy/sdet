package day7;

import java.util.HashSet;
import java.util.Set;

public class Sumofarray {

	public static void main(String[] args) {

		int[] numbers = { 3, 7, 2, 8, 7, 3, 1, 2 };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("sum is: " +sum);

		// sort the array

		int[] num = { 14, 3, 15, 71, 9, 22 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}

		for (int p : num) {
			System.out.println(p);
		}
		
		int[] arr = {3, 7, 2, 8, 7, 3, 1, 2};
		
		Set<Integer> set = new HashSet<>();
		
		for(int n: arr) {
			set.add(n);
		}
		
		System.out.println(set);
		
	}

}
