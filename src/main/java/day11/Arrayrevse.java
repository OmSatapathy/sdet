package day11;

public class Arrayrevse {

	public static void main(String[] args) {
		int[] arr = { 43, 54, 66, 3, 7, 11, 556 };
		int start = 0;
		int end = arr.length - 1;

		if (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}

		for (int p : arr) {
			//System.out.println(p);

		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}

}
