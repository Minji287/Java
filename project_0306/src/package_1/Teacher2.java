package package_1;

public class Teacher2 extends Person2 {
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
	
	@Override
	public void info() {
		super.info();
		System.out.println("교번: " + getTeacherID());
		System.out.println("월급: " + getMonthSalary());
	}
}
