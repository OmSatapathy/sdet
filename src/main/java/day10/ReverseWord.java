package day10;

public class ReverseWord {

	public static void main(String[] args) {
		
		String str= "we are automation engineer";
		String[] str1 = str.split("\\s+");
		
		StringBuilder bs = new StringBuilder();
		
		for(int i= str1.length-1; i>= 0; i--) {
			 bs.append(str1[i]).append(" ");
		}

		System.out.println(bs.toString());
	}

}
