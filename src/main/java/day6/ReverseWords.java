package day6;

public class ReverseWords {

	public static void main(String[] args) {
		String str1 = "my name is Claude tenserflow";
		
		String[] words = str1.split("\\s+");
		StringBuilder sb = new StringBuilder();

		
		for(String word: words) {
			sb = new StringBuilder(word);
			System.out.print(sb.reverse().append(" "));
		}
	}

}
