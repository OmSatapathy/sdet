package day7;

import java.util.HashMap;
import java.util.Map;

public class Occurances {

	public static void main(String[] args) {
		int[] numbers = { 3, 7, 2, 8, 7, 3, 1, 2 };

		Map<Integer, Integer> mp = new HashMap<>();
		for(int i : numbers) {
			mp.put(i, mp.getOrDefault(i, 0)+1);
			
		}
		
		for(Map.Entry<Integer, Integer> ent : mp.entrySet()) {
			System.out.println(ent.getKey() +"->" + ent.getValue());
		}

	}

}
