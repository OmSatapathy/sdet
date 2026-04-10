package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateCharacter {

	public static void main(String[] args) {

		String str = "lets run autmation";
		IntStream stream = str.chars();

		Map<Character, Long> mp = stream.mapToObj((c) -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mp);

	}

}
