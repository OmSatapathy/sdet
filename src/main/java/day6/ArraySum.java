package day6;

public class ArraySum {

	public static void main(String[] args) {
		int[] arr = { 7, 34, 67, 22, 30 };
		int max = arr[0];
		int min = arr[0];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

		for (int i = 0; i < arr.length; i++) {
			if (max > arr[i]) {
				max = arr[i];
			} else if (min < arr[i]) {
				min = arr[i];
			}
		}

		System.out.println(max);
		System.out.println(min);

		// reverse array
		int start = arr[0];
		int end = arr.length - 1;

		if (start < end) {
			int temp = start;
			start = end;
			end = temp;

			start++;
			end--;

		}

		for (int p : arr) {
			System.out.println(p);
		}

	}

}
