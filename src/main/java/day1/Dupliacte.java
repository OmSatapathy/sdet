package day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dupliacte {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 4, 6, 7, 5, 4, 6, 8 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}

		}
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicate = new HashSet<Integer>();
		
		for(Integer i: arr) {
			if(!set.add(i)) {
				duplicate.add(i);
			}
		}
		System.out.println(duplicate);
		
		Map<Integer, Integer> hm = new HashMap<>();
		for(Integer i: arr) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> map: hm.entrySet()) {
			if(map.getValue()>1) {
				System.out.println(map.getKey());
			}
		}
		
	}

}
