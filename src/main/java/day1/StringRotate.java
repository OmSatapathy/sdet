package day1;

public class StringRotate {

	public static void main(String[] args) {

		String s = "omprakash";
		int n = 3;

		String s1 = s.substring(0, n);
		String s2 = s.substring(n, s.length());

		String s3 = s2+s1;
		System.out.println(s3);
		
		// swap without 3rd varibale
		
		String n1= "suraj";
		String n2 ="chandra";
		
		n1= n1+n2;
		
		n2= n1.substring(0,n1.length()-n2.length());
		n1=n1.substring(n2.length());
		
		System.out.println(n1);
		System.out.println(n2);

	}

}
