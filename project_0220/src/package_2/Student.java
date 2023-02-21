package package_2;

public class Student {
	String name;
	int day, kor, eng, mat;
	public Student() {}
	public Student(String name, int day, int eng) {
		this.name = name;
		this.day = day;
		this.eng = eng;
	}
	public Student(String name, int day, int kor, int eng) {
		this.name = name;
		this.day = day;
		this.kor = kor;
		this.eng = eng;
	}
	public Student(String name, int day, int kor, int eng, int mat) {
		this.name = name;
		this.day = day;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public void showInfo() {
		System.out.println(name + " " + day + " " + kor + " " + eng + " " + mat);
	}
}
