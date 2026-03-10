package day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 String[] s1 = {"java", "j2ee", "struts", "hibernate"};
		  
	        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
	        
	        if(s1.length==s2.length){
	        	Arrays.sort(s1);
	        	Arrays.sort(s2);
	        	
	        	boolean value =Arrays.equals(s1, s2);
	        	
	        	if(value=true) {
	        		System.out.println("anagaram");
	        	}
	        	else {
	        		System.out.println("not anagaram");
	        	}
	        }

	}

}
