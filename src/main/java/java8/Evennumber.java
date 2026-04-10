package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Evennumber {

	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(31, 44, 24, 87, 19, 67, 56);

		List<Integer> result = lst.stream().filter((c) -> c % 2 == 0).collect(Collectors.toList());

		System.out.println(result);

		// sort by accending

		List<String> arr = Arrays.asList("banana", "apple", "kiwi", "jackfruit", "mango", "lemon");

		List<String> res = arr.stream().sorted().toList();
		System.out.println(res);

		List<String> res1 = arr.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(res1);
		
		List<Integer> lst1 = Arrays.asList(3, 4, 2, 8, 1, 6, 5);
		
		List<Integer> rest = lst1.stream().limit(3)
				.map((c)->c*c).toList();
		System.out.println(rest);
		
		

	}

}
