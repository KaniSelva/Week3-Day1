package org.department;

import org.college.College;

public class Department extends College {

	public void deptName() {
		
		System.out.println("Department Name is Computer Science");
	}
	public static void main(String[] args) {
		Department obj = new Department();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();

	}

}
