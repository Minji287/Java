package package_1;

public class SchoolMain {

	public static void main(String[] args) {
		Student st = new Student("이순신", 25, 178, 80, 12345, 3);
		Teacher te = new Teacher("김땡떙", 32, 180, 75, 52154, 300);
		
		st.showInfo();
		System.out.println("-----------------");
		te.showInfo();
		
	}

}
