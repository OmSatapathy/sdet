package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(4, 6, 78, 89, 5, 78, 4, 3, 5);

		List<Integer> distincts = lst.stream().distinct().toList();
		System.out.println(distincts);

		List<String> str = Arrays.asList("abc", "pqr", "stv", "abc", "pkr", "stv", "pqr");
		
		List<String> disString = str.stream().distinct().toList();
		System.out.println(disString);
	}

}
