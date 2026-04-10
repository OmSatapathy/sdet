package day11;

public class MergeArray {

	public static void main(String[] args) {
		
		int[] arr1 = {5, 3, 2};
		int[] arr2 = {9, 0, 1};
		
		int[] merge= new int[arr1.length+arr2.length];
		
		for(int i=0; i< arr1.length; i++) {
			 merge[i] = arr1[i];
		}
		
		for(int i =0; i< arr2.length; i++) {
			 merge[arr1.length + i] = arr2[i];
		}
		
		for(int p: merge) {
			System.out.println(p);
		}
		
		String str = "claude2403edualc";
		
		String extract = str.replaceAll("[^0-9]", "");
		System.out.println(extract);
		
	    int p =	Integer.parseInt(extract);
	    
	    

	}

}
