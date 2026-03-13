package day7;

public class ReveseEachword {


	
	public static void main(String[] args) {
		String str ="Om prakash satapathy";
		
		String[] str1 = str.split(" ");
		
		StringBuilder bs = new StringBuilder();
		
		for(String s: str1) {
			  bs.append(new StringBuilder(s).reverse().append(" "));
		}
		
		System.out.println(bs);
		
		
		int num = 64372;
		int rev =0;
		
		
		int rem;
		
		while(num>0) {
			rem = num%10;
			rev = rev*10+rem;
			num= num/10;
			
		}
		
		System.out.println(rev);
		
		
	}

}
