package day6;

public class Arrayrevese {

	public static void main(String[] args) {

		int[] arr = { 55, 3, 43, 21, 4 };
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}

		for (int p : arr) {
			System.out.println(p);
		}
	}

}
