package week3day1;

public class IndexOfStr {

	public static void main(String[] args) {
		String text = "Java Exercise";
				
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'E' || text.charAt(i) == 'e'  ) {
				System.out.println("The Index of E is :" + i);
			}
			
			if(text.charAt(i) == 'S'||text.charAt(i) == 's' ) {
				System.out.println("The Index of S is :" + i);
			}
		}
		

	}

}
