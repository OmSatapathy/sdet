package day8;

public class HigherLower {

	public static void main(String[] args) {

		String str = "We are QA autoMation";

		char[] ch = str.toCharArray();

		StringBuilder sb = new StringBuilder();
		char cpu = 0;
		char cl = 0;

		for (int i = 0; i < ch.length; i++) {

			if (Character.isLowerCase(ch[i])) {
				sb.append(Character.toUpperCase(ch[i]));
			} else if (Character.isUpperCase(ch[i])) {
				sb.append(Character.toLowerCase(ch[i]));
			}
		}

		System.out.println(sb.toString());

	}

}
