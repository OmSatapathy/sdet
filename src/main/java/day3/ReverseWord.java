package day3;

public class ReverseWord {

	public static void main(String[] args) {
		String s ="abc de f"; //o/p : fed cb a
		
		char[] ch = s.toCharArray();
		
		int left =0;
		int right = ch.length-1;
		
		while(left<right) {
			char temp = ch[left];
			ch[left]= ch[right];
			ch[right]= temp;
			left++;
			right--;
		}

		
		System.out.println(ch);
	}
}
