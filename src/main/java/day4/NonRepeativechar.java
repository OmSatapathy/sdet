package day4;

import java.util.HashMap;
import java.util.Map;

public class NonRepeativechar {

	public static void main(String[] args) {
		
		String str = "Good Morning everyone Goa";
		
		Map<Character, Integer> mp = new HashMap<>();
		char[] ch = str.toCharArray();
		
		for(char c: ch) {
			mp.put(c, mp.getOrDefault(c, 0)+1);
		}
		
		for(char c: ch) {
			if(mp.get(c)==1) {
				System.out.println(c);
				break;
			}
		}
	}

}
