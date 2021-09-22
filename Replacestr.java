package week3day1;

public class Replacestr {

	public static void main(String[] args) {
		String str = "I am working with Java8";
		
		String replace = str.replace("8", "11");
		String str1 = str.substring(4, 13);

		System.out.println("The replaced string is : " + replace);
		System.out.println("The Substring is : " + str1);
	}

}
