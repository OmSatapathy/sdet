package day5;

public class Stringprog {

	public static void main(String[] args) {

		String str = "om prakash satapathy";
		String rev = "";
		int rev2 = 0;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);

		int[] arr = { 6, 88, 3, 81, 99, 4 };

		int first = 0;
		int last = arr.length - 1;

		while (first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;

			first++;
			last--;

		}

		for (int a : arr) {
			System.out.println(a);
		}

		// reverse each word

		String stp = "We are automation engineer";
		String[] sp = stp.split("\\s+");
		StringBuilder bs = new StringBuilder();
		
		for(int i = sp.length-1; i>=0; i--) {
			bs.append(sp[i]).append(" ");
		
		}
		
		System.out.println(bs.toString());

	}
}
