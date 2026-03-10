package day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String s = "om prakash satapathy";
		char[] ch = s.toCharArray();

		Set<Character> result = new HashSet<>();
		StringBuilder bs = new StringBuilder();

		for (char c : ch) {
			result.add(c);

		}

		for (char c : result) {
			bs.append(c);
		}
		System.out.println(bs);
	}

}
