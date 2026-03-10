package day7;

public class Linersearch {

	public static void main(String[] args) {

		int[] numbers = { 21, 8, 4, 7, 5, 7 };
		int target = 7;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				System.out.println(i);
			}
		}

		// reverse array

		int start = 0;
		int end = numbers.length - 1;

		while (start < end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;

			start++;
			end--;
		}

		for (int p : numbers) {
			System.out.println(p);
		}

		// find max and min

		int max = numbers[0];
		int min = numbers[0];
		int send = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			} else if (numbers[i] < min) {
				min = numbers[i];
			}

		}

		System.out.println("maximum  " + max);
		System.out.println("minmum " + min);

	}

}
