package package_1;

public class Teacher extends Person {
	private String teacherID;
	private int monthSalary;
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.monthSalary = monthSalary;
	}
	@Override
	public void info() {
		super.info();
		System.out.println("교번: " + getTeacherID());
		System.out.println("월급: " + getMonthSalary());
	}
}
