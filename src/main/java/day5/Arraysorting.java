package day5;

public class Arraysorting {

	public static void main(String[] args) {

		int[] arr = { 6, 88, 3, 81, 99, 4 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int s : arr) {
			System.out.println(s);
		}
	}

}
