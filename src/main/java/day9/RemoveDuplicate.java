package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();
		lst.add(443);
		lst.add(8);
		lst.add(28);
		lst.add(448);
		lst.add(28);
		lst.add(182);
		lst.add(8);

		Set<Integer> set = new HashSet<>();

		for (int p : lst) {
			set.add(p);
		}

		System.out.println(set);
		Collections.sort(lst);
		System.out.println(lst);

		char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
		//String str = new String(charArray);

		String n = String.valueOf(charArray);
		System.out.println(n);
	}

}
