package day9;

public class Stringcompress {

	public static void main(String[] args) {

		String str = "aaaabbccccdddee"; // expected: a4b2c4d3e2
		char[] ch = str.toCharArray();

		StringBuilder sb = new StringBuilder();
		int count = 1;

		for (int i = 0; i < ch.length; i++) {

			if (i < ch.length - 1 && ch[i] == ch[i + 1]) {
				count++;
			} else {
				sb.append(ch[i]).append(count);
				count = 1; // reset
			}
		}

		System.out.println(sb.toString());

	}

}
