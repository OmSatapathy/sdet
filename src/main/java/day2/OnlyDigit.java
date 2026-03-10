package day2;

public class OnlyDigit {

	public static void main(String[] args) {
	
		String s ="ompraksh66h46sata";
		char[] ch = s.toCharArray();
		
		int sum=0;
		
		StringBuilder bs = new StringBuilder();
		
		for(int i =0; i< ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				bs.append(ch[i]);
			}
		}
		
		System.out.println(bs);
		
		int value = Integer.parseInt(bs.toString());
		
		while(value>0) {
			int rem = value%10;
			sum= sum+rem;
			value=value/10;
			
		}
		
		System.out.println(sum);
	}

}
