package day12;

public class Merge2Array {

	public static void main(String[] args) {
	
		int[] arr = {11,23,4,65,23};
		int[] arr1 = {55,77,29};
		
		int[] result = new int[arr.length + arr1.length];
		System.arraycopy(arr, 0, result, 0, arr.length);
		System.arraycopy(arr1, 0, result, arr.length, arr1.length);
		
		for(int a: result) {
			System.out.print(a+ " ");
		}
	}

}
