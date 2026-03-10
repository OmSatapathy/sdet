package day1;

public class SkipNumber {

	public static void main(String[] args) {
		int[] arr = { 12, 4, 5, 6, 7, 8, 2, 4, 7, 2, 1, 4, 7, 5 };

		boolean isSeven = false;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 7) {
				isSeven = !isSeven;
				continue;
			}
			if (!isSeven) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
		
		String s = "GoogleSerch";
		int k =4;
		
		String s1 = s.substring(0, k);
		String s2 = s.substring(k, s.length());
		
		String s3= s2+s1;
		
		System.out.println(s3);
	}

}
