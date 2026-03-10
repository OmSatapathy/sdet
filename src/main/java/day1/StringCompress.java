package day1;

public class StringCompress {

	public static void main(String[] args) {
		String s ="aaabbccccdddee";
		char[] ch= s.toCharArray();
		int count = 0;
		StringBuilder bs = new StringBuilder();
		for(int i =1; i< s.length();i++) {
			if(ch[i]==ch[i-1]) {
				count++;
			}
			else {
				bs.append(ch[i-1]).append(count);
				count=1;
			}
		}

		bs.append(s.charAt(s.length()-1)).append(count);
		System.out.println(bs);
	}

}
