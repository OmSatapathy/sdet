package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAlphabatical {

	public static void main(String[] args) {

		String s = "mango  stawerry banana pinapale carrort";

		String[] sp = s.split("\\s+");

		List<String> lst = new ArrayList<>();

		for (String n : sp) {
			lst.add(n);
		}

		Collections.sort(lst);

		System.out.println(lst);

		// sort the character

		String str1 = "himalaya";
		char[] ch = str1.toCharArray();

		List<Character> lst1 = new ArrayList<Character>();

		for (char cm : ch) {
			lst1.add(cm);
		}
		
		Collections.sort(lst1);
		System.out.println(lst1);
	}

}
