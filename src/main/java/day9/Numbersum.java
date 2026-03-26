package day9;

public class Numbersum {

	public static void main(String[] args) {

		String str = "abcd2346";

		String str1 = str.replaceAll("[a-z]", "");
		System.out.println(str1);

		int num = Integer.parseInt(str1);

		int sum = 0;
		int rem;

		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}

		System.out.println(sum);
		
		String[] arr = {"1","2","3"};
		int sum1=0;
		
		for(int i =0; i<arr.length; i++) {
			sum1= sum1+ Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum1);
	}

}
