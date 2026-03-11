package day7;

import java.util.Arrays;

public class Move1toRight {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 0, 4, 1, 3, 1, 5, 1 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1) {
				arr[count] = arr[i];
				count++;
			}
		}
		
		while(count<arr.length) {
			arr[count] =1;
			count++;
		}
		
		System.out.println("Modified array: " + Arrays.toString(arr));

	}

}
