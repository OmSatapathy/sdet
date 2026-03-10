package day1;

import java.util.Arrays;

public class MoveZero {

	public static void main(String[] args) {

		int[] arr = { 23, 4, 0, 5, 0, 5, 70, 4, 0, 35 };

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				++j;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
