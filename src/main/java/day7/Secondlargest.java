package day7;

public class Secondlargest {

	public static void main(String[] args) {
		int[] numbers = { 5, 78, 72, 1, 92, 3 };

		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				secmax = max;
				max = numbers[i];
			} else if (numbers[i] > secmax && numbers[i] != max) {
				secmax = numbers[i];
			}
		}

		System.out.println(max);
		System.out.println(secmax);

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		System.out.println(numbers[numbers.length - 2]);
	}

}
