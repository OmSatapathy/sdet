package day1;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 4, 6, 7, 5, 4, 6, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length - 3);

		int max = arr[0];
		int secondmax = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < secondmax) {

				secondmax = arr[i];
			}
		}

		System.out.println(max);
		System.out.println(secondmax);

		String s1 = "hello";
		String s2 = "world";

		s1 = s1 + s2;
		
		s2 = s1.substring(0, s1.length()-s2.length());
		s1= s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);
		
		// string compress 
		
		String str2 ="aabbcccddeeffffs";
		
		char[] ch = str2.toCharArray();
		int count=1;
		StringBuilder bs = new StringBuilder();
		
		
		for(int i =0; i< ch.length-1; i++) {
			
			if(ch[i]==ch[i+1]) {
				count++;
			}
			else {
				bs.append(ch[i]).append(count);
				count=1;
			}
		}
		
		System.out.println(bs.toString());

	}

}
