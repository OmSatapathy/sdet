package day11;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class StringCompress {

	public static void main(String[] args) {
		String str = "acbcabasigcsd";

		char[] ch = str.toCharArray();

		Map<Character, Integer> mp = new LinkedHashMap<>();

		for (char c : ch) {
			mp.put(c, mp.getOrDefault(c, 0) + 1);

		}

		for (Map.Entry<Character, Integer> ent : mp.entrySet()) {
		//	System.out.print(ent.getKey() + "" + ent.getValue());
		}
		
		int count=0;
		char n = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                   if(   Character.isLowerCase(ch[i])) {
                	  n =  Character.toUpperCase(ch[i]);
                   }
			}
		}

		System.out.println(n);
	}

}
