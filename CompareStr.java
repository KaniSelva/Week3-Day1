package week3day1;

public class CompareStr {

	public static void main(String[] args) {
		String str1 ="I am Learning Java" ;
		String str2="I am learning java";
		
		if (str1 == str2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if (str1.equals(str2)) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
		
	}
	
	

}
