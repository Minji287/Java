package package_1;

public class Student {
	static String name;
	static private int kor;
	static int mat;
	public Student() {}
	public Student(int kor) { // 생성자(현재 초기값을 생성), 메소드 아님
		this.kor = kor;
	}

	void show() {
		int total;
		int avg;
		total = kor + mat;
		avg = total / 2;
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + mat);
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
	}
}
