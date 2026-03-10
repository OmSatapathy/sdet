package day1;

public class ReverseEachWord {

	public static void main(String[] args) {

		String s = "test automation";
		String[] ch = s.split(" ");

		StringBuilder bs = new StringBuilder();

		for (int i = 0; i < ch.length; i++) {
		    String rev = new StringBuilder(ch[i]).reverse().toString();
			bs.append(rev).append(" ");
		}

		System.out.println(bs);

	}

}
