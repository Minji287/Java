package package_1;

public class Main3 {

	public static void main(String[] args) {
		Student[] students = new Student[100];
		for(int i = 0; i < 100; i++) {
			students[i] = new Student("홍길동", 20, 175, 70, i+"", 1, 4.5);
			students[i].showStudent();
		}
	}

}
