package day6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SmallestDigit {

	public static void main(String[] args) {

		String str = "claude2403edualc";

		String p = str.replaceAll("[^0-9]", "");
		System.out.println(p);

		char[] ch = p.toCharArray();
		int max = ch[0];
		int min = ch[0];

		for (int i = 0; i < ch.length - 1; i++) {
			if (max < ch[i]) {
				max = ch[i];
			} else if (min > ch[i]) {
				min = ch[i];
			}

		}

		System.out.println(max);
		System.out.println(min);

		String str1 = "my name is Claude Claude";
		String[] str2 = str1.split("\\s+");
		
		Map<String,Integer> mp = new LinkedHashMap<>();
		for( String c: str2) {
			mp.put(c, mp.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<String,Integer> ent: mp.entrySet()) {
		   System.out.println(ent.getKey() +"->" + ent.getValue());
		}

	}

}
