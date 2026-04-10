package day11;

public class Secondmax {

	public static void main(String[] args) {
		int[] arr = {33,55,22,556,64,344,123};
		int max=arr[0];
		int secmax=arr[0];
		
		 for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max) {
	                secmax = max;   // previous max becomes second max
	                max = arr[i];
	            } else if (arr[i] > secmax && arr[i] != max) {
	                secmax = arr[i];
	            }
	        }

		
		System.out.println(secmax);
		System.out.println(max);
		
	
		      String str = "abc d ef";
		      String rev ="";
		      StringBuilder bs = new StringBuilder();
		      String[] cp = str.split(" ");
		      
		      
		      for(int i = cp.length-1 ; i>=0; i-- ) {
		    	  bs.append(cp[i]).append(" ");
		      }
		      
		      System.out.println(bs);
		    
	}

}
