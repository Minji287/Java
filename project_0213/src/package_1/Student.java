package package_1;

// 메인메소드가 없어서 작동 안됨
public class Student {
	// 멤버변수
	int studentID;
	String studentName;
	int grade;
	String address;
	// 일반 메소드
	// 명령어는 메소드에서만 사용 가능
	public void showStudentInfo() {
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + studentName);
		System.out.println("학년 : " + grade);
		System.out.println("주소 : " + address);
	}
}
