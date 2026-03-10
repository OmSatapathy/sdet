package day2;

public class RotateString {

	public static void main(String[] args) {
		String s= "omprakash";
		
		int n= 4;
		
		String s1= s.substring(0, n);
		String s2= s.substring(n, s.length()-1);
		
		System.out.println(s2+s1);
	}

}
