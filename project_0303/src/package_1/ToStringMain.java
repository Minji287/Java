package package_1;

class person {
	private String name;
	int age;
	static int height;
//	@override Object class의 toString() -> 추상메서드
	public String toString() { return "김민지"; }
}
class Student extends person {
	int weight;
}

public class ToStringMain {
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st);
		System.out.println(st.toString());
	}

}
