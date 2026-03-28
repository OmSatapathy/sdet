package day10;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "we are automation engineer";
		String[] str1 = str.split("\\s+");

		StringBuilder bs = new StringBuilder();

		for (int i = str1.length - 1; i >= 0; i--) {
			bs.append(str1[i]).append(" ");
		}

		System.out.println(bs.toString());

		int a = 0;
		int b = 1;
		int n = 15;

		for (int i = 0; i < 10; i++) {
			int temp = a + b;
			a = b;
			b = temp;
			System.out.println(temp);

		}

		// string palindrom

		String str2 = "Mukesh";
		String rev = "";

		for (int i = str2.length() - 1; i >= 0; i--) {
			rev = rev + str2.charAt(i);
		}

		System.out.println(rev);
	}

}
