package day9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {

		int[] arr1 = { 12, 35, 1, 3, 34, 1, 8 };
		int[] arr2 = { 12, 45, 1, 10, 23, 1, 3 };

		for (int i = 0; i < arr1.length - 1; i++) {

			for (int j = 0; j < arr2.length-1; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}

		int[] arr = { 12, 35, 1, 10, 34, 1 }; // 3rd largest

		int max = arr[0];
		int sencondMax = arr[0];
		int thirdmax = arr[0];
		
		for(int i =0; i< arr.length; i++) {
			 if(arr[i]>max) {
				 max= arr[i];
			 }
			 else if(arr[i]>sencondMax && arr[i]<max) {
				     int temp = arr[i];
				     arr[i]= sencondMax;
				     sencondMax= temp;
			 }
		}
		
		System.out.println(sencondMax);

	}

}
