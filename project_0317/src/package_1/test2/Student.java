package package_1.test2;

public class Student extends Person{
	int studentID;
	int sum = kor+eng;

	public Student(String name, int kor, int eng, int studentID) {
		super(name, kor, eng);
		this.studentID = studentID;
	}

	void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("학번: " + studentID);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum/2);
	}
}
