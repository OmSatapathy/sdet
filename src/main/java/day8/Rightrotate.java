package day8;

public class Rightrotate {

	public static void main(String[] args) {
		
		int[] arr = {1,0,1,0,0,1,1};
		int count =0;
		
		for (int i =0; i< arr.length; i++) {
			
			  if(arr[i]!=1) {
				  int temp= arr[i];
				  arr[i] = arr[count];
				  arr[count] = temp;
				  
				  count++;
			  }
		}
		
		for(int p: arr) {
			System.out.println(p);
		}

	}

}
