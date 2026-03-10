package day2;

public class FindVowelandConst {

	public static void main(String[] args) {
		String s = "ganga is a great river";

		String constFind = s.replaceAll("[aeiou]", "").replaceAll(" ", "");
		System.out.println(constFind);

		System.out.println(constFind.length());
	}

}
