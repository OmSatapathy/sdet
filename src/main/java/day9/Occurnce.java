package day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Occurnce {

	public static void main(String[] args) {
		int[] arr = { 12, 45, 1, 10, 23, 1, 23, 6, 10 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		map.forEach((k,v)->{
			System.out.println(k +"->"+ v);
		});
		System.out.println("**************");
		Iterator<Integer> itr = map.keySet().iterator();

		while (itr.hasNext()) {
		    Integer key = itr.next();
		    System.out.println(key + " -> " + map.get(key));
		}

	}

}
