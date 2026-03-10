package day2;

import java.util.Arrays;

public class SortedMissing {

	public static void main(String[] args) {
		
		int[] arr = {4,6,7,1,3,2};
		int sum =0;
		int len= arr.length;
		
		for(int i =0; i< arr.length; i++) {
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i< arr.length-1; i++) {
			sum = sum+arr[i];
		}
		
		int total =len*(len+1)/2;
		System.out.println(total);
		
		System.out.println(total-sum);
	}

}
