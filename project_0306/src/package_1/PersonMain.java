package package_1;

public class PersonMain {

	public static void main(String[] args) {
		Student student = new Student("홍길동", 25, 175, 65, "2023001", 3);
		Teacher teacher = new Teacher("강창수", 35, 180, 80, "10203", 350);
		student.info();
		System.out.println("--------------");
		teacher.info();
	}

}
