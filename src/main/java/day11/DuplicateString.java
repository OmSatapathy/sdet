package day11;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		
		String str = "we are automation enginer and QA and automation are and";
		
		String[] sp = str.split("\\s+");
		
		Map<String, Integer> mp = new HashMap<>();
		for(String s: sp) {
			mp.put(s, mp.getOrDefault(s, 0)+1);
		}
		
		
		for(Map.Entry<String, Integer> ent : mp.entrySet()) {
			 System.out.println(ent.getKey() +"->" + ent.getValue());
		}

	}

}
