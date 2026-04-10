package day11;

public class Stringprog {

	public static void main(String[] args) {
		
		String str = "omPrakash";
		char[] ch= str.toCharArray();
		
		StringBuilder bs = new StringBuilder();
		
		
        
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == '0') continue; // skip already counted chars

            int count = 1;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0'; // mark as visited
                }
            }

            bs.append(ch[i]).append(count);
        }
        
        System.out.println(bs.toString());

	}

}
