package day5;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {

		String str = "Auomation and webdriver";
		char[] ch = str.toCharArray();

		Set<Character> set = new HashSet<>();
		for (char c : ch) {
			set.add(c);
		}

		
		Set<Character> set1= new HashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			for(int j =i+1; j< ch.length; j++) {
				if(ch[i]==ch[j]) {
					set1.add(ch[j]);
				}
			}

		}
	

	}

}
