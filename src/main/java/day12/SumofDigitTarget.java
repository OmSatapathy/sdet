package day12;

public class SumofDigitTarget {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 6, 7, 10, 4 };
		int target = 7;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] + arr[i + 1] == target) {
				System.out.println(arr[i]);
				System.out.println(arr[i + 1]);
				break;
			}
		}

		// StrinG pallindrom

		String str = "Hello";
		String str1 = "oellH";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);

		// swap 2 string

		String s1 = "hello";
		String s2 = "world";

		s1 = s1.concat(s2);
		// System.out.println(s1);

		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println(s1);
		System.out.println(s2);

		// rotated

		int first = 0;
		int last = arr.length - 1;

		while (first < last) {
			
			int temp= arr[first];
			arr[first] = arr[last];
			arr[last]= temp;
			
			first++;
			last--;

		}
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}

}
