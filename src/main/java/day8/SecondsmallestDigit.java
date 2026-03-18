package day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondsmallestDigit {

	public static void main(String[] args) {

		String str = "claude41783edualc";

		String onlyDigit = str.replaceAll("[^0-9]", "");

		System.out.println(onlyDigit);

		Set<Integer> set = new HashSet<>();

		for (char c : onlyDigit.toCharArray()) {
			set.add(c - '0');
		}

		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);

		if (list.size() >= 2) {
			System.out.println("Second smallest digit: " + list.get(1));
		} else {
			System.out.println("No second smallest digit");
		}

	}

}
