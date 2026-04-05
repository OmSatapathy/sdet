package day11;

public class Allzeroright {

	public static void main(String[] args) {
		int[] arr = { 2, 45, 6, 6, 0, 11, 4, 0, 5, 0, 442, 0 };

		int temp;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;

				count++;

			}
		}

		for (int p : arr) {
			System.out.println(p);
		}

		String str = "india is my country";
		String[] ch = str.split("\\s+");

		String rev = "";
		String rev1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		StringBuilder sb = new StringBuilder();
		for (int i = ch.length - 1; i >= 0; i--) {

			sb.append(ch[i]).append(" ");
		}

		System.out.println(sb);
	}

}
