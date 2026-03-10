package day5;

public class PallindromNumber {

	public static void main(String[] args) {
		
		int num = 50664;
		int rem;
		int rev =0;
		
		
		while(num>0) {
			rem= num %10;
			rev = rev*10 + rem;
			num = num/10;
		}
		
		System.out.println(rev);

	}

}
