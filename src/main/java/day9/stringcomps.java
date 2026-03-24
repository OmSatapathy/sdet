package day9;

public class stringcomps {

	public static void main(String[] args) {
		String str = "aabbcccdddefggg";
		char[] ch = str.toCharArray();
		int count =1;
		StringBuilder bs = new StringBuilder();
		

		for (int i = 0; i < ch.length; i++) {
			if(i < ch.length - 1 && ch[i] ==ch[i+1]) {
				count++;
				
			}
			else {
				bs.append(ch[i]).append(count);
				count=1;
			}

		}

		System.out.println(bs.toString());
	}

}
