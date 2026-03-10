package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {

	public static void main(String[] args) {

		ArrayList<String> email = new ArrayList<>(Arrays.asList("keasv", "raghav", "manav", "keasv", "rajesh"));

		Set<String> set = new HashSet<>();

		for (String s : email) {
			set.add(s);
		}

		System.out.println(set);

		// find common ele in 2 array

		int[] arr = { 20, 3, 5, 66, 39 };
		int[] arr2 = { 88, 4, 55, 3, 66, 20 };

		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();

		for (int i : arr) {
			s1.add(i);
		}

		for (int i : arr2) {
			if (s1.contains(i)) {
				s2.add(i);
			}
		}

		System.out.println(s2);

		String str = "Wellcome to automation world";
		char[] ch = str.toLowerCase().toCharArray();
		int counter=0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                       counter++;
			}
		}

		System.out.println(counter);
	}

}
