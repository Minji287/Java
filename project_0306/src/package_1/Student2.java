package package_1;

public class Student2 extends Person2 {
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
	@Override
	public void info() {
		super.info();
		System.out.println("학번: " + getStudentID());
		System.out.println("학년: " + getGrade());
	}
	
	
}
