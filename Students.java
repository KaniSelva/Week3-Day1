package MethodOverloading;

public class Students {

	public void getstudentinfo() {
		
		System.out.println("The name of student is ABC");
		// return Name;

	}

	public void getstudentinfo(int id) {
		System.out.println("The ID of student is " + id);
		// return Name;

	}

	public void getstudentinfo(int id, String name) {
		System.out.println("The ID of student is " + id);
		System.out.println("The name of student is " + name);
		// return Name;

	}
	public void getstudentinfo(int id, String name, double phone, String EmailID) {
		System.out.println("The ID of student is " + id);
		System.out.println("The name of student is " + name);
		System.out.println("The phone number of student is " + phone);
		System.out.println("The Email ID of student is " + EmailID);
		// return Name;

	}

	public static void main(String[] args) {
		
		Students obj = new Students();
		obj.getstudentinfo();
		obj.getstudentinfo(23);
		obj.getstudentinfo(23, "ABC");
		obj.getstudentinfo(23, "ABC", 1234567898, "abc@gmail.com");
	}

}
