package day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "java is easy";
		String s2 = "is java yrsy";

		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean value = Arrays.equals(ch1, ch2);

			if (value == true) {
				System.out.println("anagram");
			} else {
				System.out.println("not a anagram");
			}

		}
	}

}
