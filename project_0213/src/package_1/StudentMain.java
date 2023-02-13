package package_1;

public class StudentMain {

	public static void main(String[] args) {
		Student stKim = new Student(); // 참조변수
		stKim.studentID = 2023007;
		stKim.studentName = "홍길동";
		stKim.grade = 1;
		stKim.address = "인천";
		stKim.showStudentInfo();
	}

}
