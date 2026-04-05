package day10;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int first = 0;
		int last = arr.length - 1;

		while (first < last) {
            int temp = arr[first];
            arr[first]= arr[last];
            arr[last]= temp;
            
            first++;
            last--;
            
		}

		for(int i : arr) {
			System.out.println(i);
		}
		
		String str = "I am John Doe";
		String[] str1 = str.split("\\s+");
		
		StringBuilder bs = new StringBuilder();
		String rev="";
		
//		for(int i = str1.length-1; i>=0;i--) {
//			bs.append(str1[i]).append(" ");
//			StringBuilder revs = new StringBuilder();
//			bs.append(revs.reverse()).append(" ");
//		}
//		
//		System.out.println(bs);
		
		String[] words = str.split(" ");
	    StringBuilder result = new StringBuilder();
	    for (String word : words) {
	        // Reverse each word and append
	        result.append(new StringBuilder(word).reverse()).append(" ");
	    }
		
		System.out.println(result);
		
		
	}

}
