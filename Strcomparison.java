package week3day1;

public class Strcomparison {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		if (str3 == str4) {
			System.out.println(" Same text");
		} else
			System.out.println("Diff text");

		System.out.println("***");

	}

}
// Justification : == operator refer the storage location of the object created, if str3 and str4 is of different location in the heap memory, then the result is "Different text".