package day11;

public class Arrayrevse {

	public static void main(String[] args) {
		int[] arr = {43,54,66,3,7,11,556};
		int start= 0;
		int end = arr.length-1;
		
		if(start<end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			
			start++;
			end--;
			
		}
		
		for(int p: arr) {
			System.out.println(p);
			
		}
	}

}
