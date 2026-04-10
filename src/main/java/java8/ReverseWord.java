package java8;

import java.io.InputStream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "Hello my Name is ganga";
		String[] arr = str.split(" ");

		Stream<String> steam = Stream.of(arr);

		String results = steam.map((a) -> new StringBuilder(a).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println(results);

		// sum of integer

		int number = 123456;
		IntStream stream = String.valueOf(number).chars();

		int sum = stream.map((i) -> Character.getNumericValue(i)).sum();
		System.out.println(sum);

	}

}
