package day7;

import java.util.Arrays;

public class MoveZeroright {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 99, 0, 7, 2, 11, 0, 5, 0, 34 };
		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n");
		//  two pointer approch
		
		int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
		
		int count =0;
		
		for(int i =0; i< arr1.length; i++) {
			if(arr1[i]!=0) {
				
				int temp = arr1[i];
				arr1[i] = arr1[count];
				arr1[count] = arr1[temp];
				
				count++;
				
			}
		}
		
		  for (int num : arr1) {
	            System.out.print(num + " ");
	        }

	}

}
