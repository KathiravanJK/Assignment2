package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Kathiravan");
	}
	
	public void studentDept() {
		System.out.println("Aeronautical Engineering");
	}
	
	public void studentId() {
		System.out.println("171AE119");
	}
	
	public static void main(String[] args) {
		Student details=new Student();
		details.studentName();
		details.studentDept();
		details.studentId();
		details.deptName();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
	}

}
