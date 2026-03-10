package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeated {

	public static void main(String[] args) {

		String s = "javaj programming";

		Map<Character, Integer> mp = new HashMap<>();

		char[] ch = s.toCharArray();

		for (char c : ch) {
			mp.put(c, mp.getOrDefault(c, 0) + 1);
		}

		// Find first non-repeated character
		for (char c : ch) {
			if (mp.get(c) == 1) {
				System.out.println("First non-repeated character: " + c);
				break;
			}
		}
	}

}
