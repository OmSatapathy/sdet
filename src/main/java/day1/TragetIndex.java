package day1;

public class TragetIndex {

	public static void main(String[] args) {
		  int[] arr = {6, 8, 11, 6, 7, 18};
		  int target = 12;
		  indecs(arr, target);

	}
	
	public static void indecs(int arr[], int target) {
		
		for(int i =0; i< arr.length;i++) {
			for(int j =i+1; j< arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					 System.out.println("Indices: " + i + " and " + j);
					  return;
				}
			}
		}
	}

}
