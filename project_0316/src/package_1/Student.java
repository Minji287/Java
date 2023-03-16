package package_1;

public class Student extends Person{
	int studentID;
	int grade;
	public Student(String name, int age, int height, int weight, int studentID, int grade) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
	}
	@Override
	void showInfo() {
		System.out.println("학번: " + this.studentID);
		System.out.println("학년: " + this.grade);
		super.showInfo();
	}
	
	
	
}
