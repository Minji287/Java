package package_1;

public class Teacher extends Person{
	int teacherID;
	int salary;
	public Teacher(String name, int age, int height, int weight, int teacherID, int salary) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.salary = salary;
	}
	@Override
	void showInfo() {
		System.out.println("교번: " + this.teacherID);
		System.out.println("월급: " + this.salary);
		super.showInfo();
	}
	
	
}
