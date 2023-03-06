package package_1;

public class Student extends Person {
	private String studentID;
	private int grade;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Student(String name, int age, int height, int weight, String studentID, int grade) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
	}
	@Override
	public void info() {
		super.info();
		System.out.println("학번: " + getStudentID());
		System.out.println("학년: " + getGrade());
	}
	
	
}
