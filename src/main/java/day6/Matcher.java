package day6;

import java.util.LinkedList;

public class Matcher {

	public static void main(String[] args) {
	
		String str = "rtywrpwq";
		
		
		if(str.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("passed");
		}
		else { 
			System.out.println("not passed !");
		}
		
		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		System.out.println(ll);
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll.descendingIterator().forEachRemaining(ll1::add);
		System.out.println(ll1);
		
	}

}
