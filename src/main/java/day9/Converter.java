package day9;

public class Converter {

	public static void main(String[] args) {

		double num = 9.98;

		String s = String.valueOf(num);
		System.out.println(s);

		int p = 838;
		String s1 = String.valueOf(p);
		System.out.println(s1);
		
		// char to interger
		
		char c = 'p';
		
		Character.getNumericValue(c);
		System.out.println(Character.getNumericValue(c));

	}

}
