package day7;

import java.util.HashMap;
import java.util.Map;

public class Dupliacte {

	public static void main(String[] args) {
		
		int[] arr = new int[] {111, 333, 555, 777, 333, 444, 555};
		Map<Integer, Integer> mp = new HashMap<>();
		
		for(int c : arr) {
			mp.put(c, mp.getOrDefault(c, 0)+1);
		}

		
		for(Map.Entry<Integer, Integer> ent: mp.entrySet()) {
			if(ent.getValue() >= 2){
	               System.out.println(ent.getKey() +"->" + ent.getValue());
	           }
		}
				
	}

}
