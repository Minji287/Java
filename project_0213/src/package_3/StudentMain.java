package package_3;

public class StudentMain {

	public static void main(String[] args) {
		Student ss1 = new Student();
		ss1.sName = "홍길동";
		ss1.sGrade = 3;
		ss1.sAddress = "인천";
		ss1.studentInfo();
		
		System.out.println();
		
		Student ss2 = new Student();
		ss2.sName = "이순신";
		ss2.sGrade = 4;
		ss2.sAddress = "서울";
		ss2.studentInfo();
	}

}
