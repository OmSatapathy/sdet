package day10;

public class BubbleSort {

	public static void main(String[] args) {
		int[] num = { 78, 83, 97, 34, 12, 93 };

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length - 1; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}

		for (int p : num) {
			System.out.println(p);
		}
	}

}
