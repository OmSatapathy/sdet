package day2;

import java.util.HashMap;
import java.util.Map;

public class Reverse {

	public static void main(String[] args) {
		String s = "om prakash satapathy";
		String rev = " ";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		char[] ch = s.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();
		
		for(char c: ch) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> ham : hm.entrySet()) {
			if(ham.getValue()>1) {
				System.out.println(ham.getKey()+ " "+  ham.getValue());
			}
		}
	}

}
