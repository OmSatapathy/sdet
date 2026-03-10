package day1;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 4, 6, 7, 5, 4, 6, 8 };
		
		for(int i =0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length-3);
	}

}
