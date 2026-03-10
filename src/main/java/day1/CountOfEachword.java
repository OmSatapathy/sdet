package day1;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachword {

	public static void main(String[] args) {
		String s = "we are here we decide to go here to there we";
		
		String[] sp = s.split(" ");
		
		Map<String,Integer> hm = new HashMap<>();
		
		for(String sn: sp) {
			hm.put(sn, hm.getOrDefault(sn, 0)+1);
			
		}
     for(Map.Entry<String,Integer> ham: hm.entrySet()) {
    	 System.out.println(ham.getKey() +" ->"+ ham.getValue());
     }
	}

}
