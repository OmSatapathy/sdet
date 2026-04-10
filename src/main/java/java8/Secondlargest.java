package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Secondlargest {

	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(12,45,23,55,67,31,6);
		
		int result = lst.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(result);
		
		
	}

}
