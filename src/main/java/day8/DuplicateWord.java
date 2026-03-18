package day8;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

	public static void main(String[] args) {
		String str = "my name is Claude Claude";

		String[] sp = str.split(" ");

		Map<String, Integer> mp = new HashMap<>();

		for (String c : sp) {
			mp.put(c, mp.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<String, Integer> ent : mp.entrySet()) {
			if (ent.getValue() > 1)

			{
				System.out.println(ent.getKey() + "->" + ent.getValue());
			}
		}
	}

}
