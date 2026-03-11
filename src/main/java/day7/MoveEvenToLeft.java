package day7;

import java.util.Arrays;

public class MoveEvenToLeft {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 0, 4, 1, 3, 1, 5, 6 };
	

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[count] = arr[i];
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr[count] = arr[i];
				count++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
