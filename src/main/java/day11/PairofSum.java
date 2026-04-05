package day11;

public class PairofSum {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, -1, 5, 10, 22, 3 };

		int target = 14;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == target) {

					System.out.println(arr[i]);
					System.out.println(arr[j]);
					break;
				}
			}
		}

	}

}
