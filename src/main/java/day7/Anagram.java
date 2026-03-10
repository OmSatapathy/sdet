package day7;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		int[] arrayOne = { 5, 1, 17, 51, 22 };

		int[] arrayTwo = { 22, 41, 17, 1, 5 };

		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);

		if (Arrays.equals(arrayOne, arrayTwo)) {
			System.out.println("equals");
		} else {
			System.out.println("not");
		}
	}

}
