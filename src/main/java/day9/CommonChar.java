package day9;

public class CommonChar {

	public static void main(String[] args) {
		
		String str = "think";
		String str1 ="thin";
		
		char[] ch1 = str.toCharArray();
		char[] ch2 = str1.toCharArray();
		
		for(int i =0; i< ch1.length; i++) {
			for(int j =0; j< ch2.length; j++) {
				if(ch1[i]== ch2[j]) {
					System.out.println(ch1[j]);
				}
			}
		}
		
	}

}
