package day8;

import java.util.Arrays;

public class Merge2Array {

	public static void main(String[] args) {

		int[] arr1 = { 5, 3, 4 };
		int[] arr2 = { 8, 7, 1 };

		int[] merge = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, merge, 0, arr1.length);
		System.arraycopy(arr2, 0, merge, arr1.length, arr2.length);

		System.out.println(Arrays.toString(merge));

		// even odd difference

		int[] arr = { 3, 5, 6, 334, 51, 44, 0, 64, 63, 22, 80 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;

				count++;
			}

		}

		for (int p : arr) {
			System.out.print(p + " ");
		}

		String str = "ravindra kumar tagore";

		String[] p = str.split(" ");

		StringBuilder bs = new StringBuilder();

		for (String n : p) {

			StringBuilder temp = new StringBuilder(n);
			bs.append(temp.reverse()).append(" ");
		}

		System.out.print(bs.toString());
	}

}
