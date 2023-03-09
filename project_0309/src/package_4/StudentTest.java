package package_4;

public class StudentTest {

	public static void main(String[] args) {
		Student2 studentLee = new Student2(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		studentLee.showSubjectInfo();
		
		System.out.println("============");
		
		Student2 studentKim = new Student2(1002, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 90);
		
		studentKim.showSubjectInfo();
	}

}
