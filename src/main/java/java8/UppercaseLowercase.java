package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class UppercaseLowercase {

	public static void main(String[] args) {

		List<String> lst = Arrays.asList("apple","mango","kiwi","pinapple");
		
		List<String> ressult =    lst.stream().map(String::toUpperCase).toList();
		System.out.println(ressult);

	}

}
