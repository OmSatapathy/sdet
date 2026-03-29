package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();
		lst.add("ram");
		lst.add("sam");
		lst.add("dinesh");
		lst.add("malay");

		java.util.Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		//	lst.add("prakash"); will create cuncorrentmodification exception

		}	
	}

}
