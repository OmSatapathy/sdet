package day12;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWord {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";
		String[] str = string.split("\\s+");

		Map<String, Integer> mp = new LinkedHashMap<>();
		for (String s : str) {
			mp.put(s, mp.getOrDefault(s, 0) + 1);
		}

		for (Map.Entry<String, Integer> ent : mp.entrySet()) {
			if (ent.getValue() > 1) {
				System.out.println(ent.getKey() + "" + ent.getValue());
			}

		}

		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
		int temp;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;

				count++;

			}
		}

		for (int a : arr) {
			System.out.print(a);
		}

	}

}
