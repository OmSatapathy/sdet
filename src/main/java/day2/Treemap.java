package day2;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
		
		tm.put(12, "manoj");
		tm.put(15, "aminesh");
		tm.put(18, "kartika");
		tm.put(12, "soham");
		tm.put(1, "rajesh");
		
		for(Map.Entry<Integer,String> hm : tm.entrySet()) {
			System.out.println(hm.getKey()+ "->"+hm.getValue());
		}
	}

}
