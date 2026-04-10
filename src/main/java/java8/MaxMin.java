package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MaxMin {

	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(34, 6, 74, 81, 42, 67);

		Stream<Integer> stream = lst.stream();

		int max = stream.mapToInt((c) -> c.intValue()).max().getAsInt();
		System.out.println(max);

		int min = lst.stream().mapToInt(c -> c.intValue()).min().getAsInt();
		System.out.println(min);
	}

}
