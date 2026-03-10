package day2;

public class Demo {

	public static void main(String[] args) {
		
		String str = "12BdCA%*&&6453";
		
			//output = 123456ABCd%*&&

				char[] ch = str.toCharArray();

				StringBuilder bs = new StringBuilder();
				StringBuilder bs1 = new StringBuilder();
				StringBuilder bs2 = new StringBuilder();

				for( int i =0; i< ch.length; i++){

				  if(Character.isDigit(ch[i])){
				  
				      bs.append(ch[i]);
				  }
				  else if(Character.isAlphabetic(ch[i])){
				  
				      bs1.append(ch[i]);
				  }
				  
				  else{
				     bs2.append(ch[i]);
				  }
				  
				

				}
				  System.out.println(bs.append(bs1).append(bs2));
	}
}
