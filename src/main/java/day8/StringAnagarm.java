package day8;

import java.util.Arrays;

public class StringAnagarm {

	public static void main(String[] args) {
		
		String s1 = "listen";
		String s2 = "silet";
		
		char[] ch1= s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		
		if(ch1.length== ch2.length) {
			
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 
			boolean value=  Arrays.equals(ch1, ch2);
			
			if(value == true) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not an anagarm");
			}
		}
		
		else {
			System.out.println("lenght not equal");
		}

	}

}
