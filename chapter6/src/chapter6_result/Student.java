package chapter6_result;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	void showStudentInfo() {
		System.out.println("이름: " + studentName);
		System.out.println("학년: " + grade);
		System.out.println("학번: " + studentID);
		System.out.println("주소: " + address);
	}
}
