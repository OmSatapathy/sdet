package day4;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {

	public static void main(String[] args) {

		int[] a = { 22, 4, 65, 78, 8 };
		int[] b = { 4, 67, 69, 3, 8, 2 };

		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();

		for (int s : a) {
			set.add(s);
		}

	
		for(int s : b) {
			set.contains(s);
			duplicate.add(s);
		}
		
		System.out.println(duplicate);
	}

}
