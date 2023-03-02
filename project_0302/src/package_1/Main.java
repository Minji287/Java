package package_1;

public class Main {

	public static void main(String[] args) {
		Student st = new Student("홍길동", 20, 175, 70, "20170101", 1, 4.5);
		Teacher te = new Teacher("Tomy", 27, 180, 80, "A2023001", 3700000, 2);
		
		st.showStudent();
		System.out.println();
		te.showTeacher();
	}

}
