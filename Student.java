package org.Student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {

		System.out.println("The Student Name is ABC");
	}

	public void studentDept() {

		System.out.println("Student Department is Compute Science");
	}

	public void studentId() {

		System.out.println("Student ID is 12345");
	}

	public static void main(String[] args) {
		Student st = new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentId();
		st.studentDept();
	}

}
