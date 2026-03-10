package day5;

import java.util.Arrays;

public class Pallindrom {

	public static void main(String[] args) {

		String str1 = "civic";
		String rev = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			rev = rev + str1.charAt(i);
		}

		if (str1.equalsIgnoreCase(str1)) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}

		// anagram
		String s1 = "banana";
		String s2 = "applea";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		if (s1.length() == s2.length()) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean value = Arrays.equals(ch1, ch2);

			if (value = true) {
				System.out.println("anagarm");
			} else {
				System.out.println("not anagaram");

			}
		}

		// maximum, second maximum

		int arr[] = { 4, 781, 8, 99, 103 };


		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
		    if (arr[i] > max) {
		        max = arr[i];
		    }
		}

		System.out.println("Max number: " + max);
		
		
	}

}
