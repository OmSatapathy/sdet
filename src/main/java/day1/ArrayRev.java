package day1;

import java.util.Arrays;

public class ArrayRev {

	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 3, 7, 8, 6, 5, 3,4,5,6 };
		int first=0;
		int last= a.length-1;
		

			while(first<last) {
				int temp = a[first];
				a[first] =a[last];
				a[last]= temp;
				
				first++;
				last--;
				
			}
		
	
		
		System.out.println(Arrays.toString(a));
	}

}
