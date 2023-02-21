package package_2;

public class StudentMain {

	public static void main(String[] args) {
		Student dd = new Student();
		Student Day13 = new Student("홍길동", 13, 98, 95);
		Student Day14 = new Student("홍길동", 14, 97);
		Student Day15 = new Student("홍길동", 15, 90, 97, 95);
		Day13.showInfo();
		Day14.showInfo();
		Day15.showInfo();
	}

}
