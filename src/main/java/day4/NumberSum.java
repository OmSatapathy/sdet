package day4;

public class NumberSum {

	public static void main(String[] args) {
		
		int num =146;
		
		int sum=0;
	
		
		while(num>0) {
			sum =sum + num%10;
			num = num/10;
		}
		
		System.out.println(sum);
	}

}
